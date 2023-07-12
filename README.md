#  <p style="color: blue;">Auto Service API</p>

Auto Service API is a web service specifically designed for auto service centers, providing convenient and efficient tools to manage data about mechanics, vehicles, vehicle owners, and service orders. With this API, auto service centers can optimize their workflow, streamline customer interactions, and enhance service quality.

Key Features and Functionality:

- Mechanics Management: Add new mechanics, edit their details, and retrieve a list of completed jobs.<br>
- Vehicle Information Management: Add new vehicles, edit vehicle details, and retrieve owner information.<br>
- Efficient Service Order Management: Create new service orders, edit order details, and track order status (accepted, in progress, successfully completed, unsuccessfully completed, paid).<br>
- Service Order Cost Calculation: Automatically calculate the total cost of an order, including the cost of services and items included.<br>
- Service Management: Create new services, edit service details, and manage service status (paid, unpaid to mechanic).<br>
- Item Management: Add new items, edit item details.<br>
- Comprehensive Documentation and Documented API: Utilize Swagger for automated API documentation generation, enabling developers to quickly understand and utilize the API.<br>
Auto Service API helps auto service centers improve efficiency, reduce administrative overhead, and streamline customer interactions. By providing convenient and powerful tools for data and order management, it allows service centers to focus on delivering quality services to their customers and enhance customer satisfaction.

## <span style="color:yellow;">Technologies Used</span>
* ### Spring boot
* ### Spring Security
* ### Hibernate
* ### PostgreSQL
* ### Liquibase
* ### JUnit
* ### Testcontainers
* ### Swagger
* ### Maven
* ### Git

## <span style="color:yellow;">Installation and Configuration</span>

#### Step 1: Clone the repository
To start, clone the project repository from GitHub by running the following command in your preferred command-line interface:<br>
git clone https://github.com/example/auto-service-api.git<br>
This will create a local copy of the project on your machine
#### Step 2: Install dependencies
Navigate to the project directory using the command-line interface and install the required dependencies by running the following command:<br>
cd auto-service-api<br>
npm install<br>
This command will download and install all the necessary packages and libraries needed for the project.

#### Step 3: Configure the application
Open the application.properties file located in the project's root directory. This file contains the application configuration settings, including the database connection details. Update the following properties with your specific values:<br>
spring.datasource.url=jdbc:mysql://localhost:3306/auto_service_db<br>
spring.datasource.username=<your-username><br>
spring.datasource.password=<your-password><br>
Make sure to replace your-username and your-password with your actual database credentials.

#### Step 4: Create and compile the project
To create and compile the project, execute the following command in the command-line interface:
npm run build
This command will transpile the TypeScript code into JavaScript and generate the necessary files for the application.

#### Step 5: Start the application
After the build process is complete, start the application by running the following command:<br>
npm start<br>
The Auto Service API will now be running on the specified port.

#### Database setup with Liquibase
The application uses Liquibase for managing database migrations. It will automatically create the required tables and populate them with sample data.

#### Swagger API documentation
You can verify and test the application using Swagger. Once the application is running, open your web browser and visit the following URL:<br>
http://localhost:your-port/swagger-ui.html<br>
Replace your-port with the actual port number where the application is running.

#### User credentials
Upon launching the application for the first time, a user account will be created with the following credentials:

#### Username: _admin@gmail.com_
#### Password: _admin_
These credentials can be used to access the administrative features of the application.
#### Conclusion
By following these installation and configuration steps, you should have the Auto Service API project set up and running successfully. You can now proceed to test and interact with the API using Swagger or any other API testing tool.

## Test Coverage
The Auto Service API has comprehensive test coverage to ensure the reliability and correctness of the codebase. The testing approach includes writing tests using JUnit 5, a widely-used testing framework for Java applications. The following information provides details about the test coverage and the testing tools utilized:

#### Test Types
The testing strategy for the Auto Service API includes different types of tests to validate various components and functionalities of the application. These test types may include:

* Unit tests: Unit tests focus on testing individual units of code, such as classes, methods, or functions, in isolation. For the Auto Service API, unit tests are written to test repository classes, service classes, and controller classes.
* Integration tests: Integration tests verify the interaction and integration between different components of the API. In the context of the Auto Service API, integration tests are written to ensure that the components, such as repositories, services, and controllers, work together correctly.
* Functional tests: Functional tests assess the overall functionality of the API from an end-to-end perspective. These tests simulate real-world scenarios and test the API's features as a whole, ensuring that it behaves as intended.
#### Testing Tools
  The Auto Service API utilizes the following testing tools and frameworks:

1. [x] JUnit 5
3. [x] Testcontainers
5. [x] SpringBootTest
7. [x] DataJpaTest
