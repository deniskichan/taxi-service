package taxi.controller.driver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.lib.Injector;
import taxi.model.Driver;
import taxi.service.DriverService;

public class AddDriverController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private static final Logger logger = LogManager.getLogger((AddDriverController.class));
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/drivers/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        String name = req.getParameter("name");
        String licenceNumber = req.getParameter("licence_number");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        logger.info("doPost method was called with parameters: Name: {}, License Number: {},"
                + " Login: {}", name, licenceNumber, login);
        Driver driver = new Driver(name, licenceNumber, login, password);
        driverService.create(driver);
        req.setAttribute("success", "Driver was successfully registered");
        req.getRequestDispatcher("/WEB-INF/views/drivers/add.jsp").forward(req, resp);
    }
}
