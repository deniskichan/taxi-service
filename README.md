![taxi image](https://image.api.playstation.com/vulcan/ap/rnd/202103/3009/phkHdAJk5kr9jceb3sTXPQFJ.jpg)

# Taxi service app

This simple application allows us to manage a database of drivers and taxi cars, register new drivers and new cars in the database, as well as assign new drivers to cars.
Authentication is done using the driver's account. The application is based on SOLID principles and N-tier architecture with 3 levels such as DAO layer with CRUD operations, Service layer, Controller layer.
Input information from web pages as well as some service information from service layer will is logged to console and file.

# Technologies used:

* Java 11
* JDBC
* MySQL 8.0 RDBMS
* Log4j 2
* Maven Checkstyle Plugin
* Apache Tomcat 9.0.50
* Javax Servlet API 4.0.1
* JSTL 1.2
* JSP
* HTML, CSS

# Configuration:

* Clone this project to your computer and open project in your IDE.
* Install MySQL and MySQL Workbench
* Set your mySQL username and password as parameters in `src/main/java/taxi/util/ConnectionUtil.java`
* Copy content of the init_db.sql file in `src/main/resources` folder, paste in MySQL query window and execute
* In src/main/resources/log4j2.xml enter your absolute path where you want your log file to be stored, e.g. `C:\Users\Admin\IdeaProjects\taxi-service\logs\app.log`
* Configure Apache Tomcat
    * Edit Configurations
    * Add New Configuration -> TomCat Server -> Local
    * Fix -> web-security:war exploded
    * Deployment tab -> Application context -> leave only "/"
* Launch application and starting page should be displayed
* Register new driver to be able to login
* Login to the system using login and password