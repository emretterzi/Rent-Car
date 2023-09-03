# Rent-A-Car

### Project Description:

I developed a web-based project using the Spring Boot framework, PostgreSQL database management system, and Hibernate ORM framework for handling database operations. The architecture is well-structured into different layers, including the business, data access, and presentation layers, with data transfer between layers handled by DTO (Data Transfer Object) classes.

**Key Features:**
- API endpoints defined using Spring MVC
- Integration with Swagger UI for browsing functionalities, testing parameters, and viewing documentation
- Customized exception handling and data validation using Java Bean Validation API and Hibernate Validator
- CRUD operations for car brands and models through the API

**Technologies Used:**
- Spring Boot
- PostgreSQL
- Hibernate ORM
- Spring MVC
- Swagger UI
- Java Bean Validation API
- Hibernate ValidatorSure!
  
**Usage:**

When the project is running successfully, users can access the API by sending requests to **localhost:8080** and using the Swagger UI interface. Through the API, users can perform the following operations:
- View car brands and models
- Add new car brands and models
- Update existing car brands and models
- Delete car brands and models

**Conclusion:**

In conclusion, this web-based project demonstrates the effective use of Spring Boot, PostgreSQL, and Hibernate ORM to develop a well-structured application with a layered architecture. The integration of Spring MVC and Swagger UI allows for easy browsing and testing of API endpoints, while customized exception handling and data validation ensure the accuracy of incoming requests. The project provides a user-friendly interface for managing car brands and models through CRUD operations.

### Using Postman with Spring Boot API (Local Development)

This document provides guidance on how to use Postman to interact with the Spring Boot API running locally on port 8080. The API offers various endpoints to manage car models.

#### Endpoints

- **GET /api/models**
  - Description: Retrieve a list of all car models.
  - Request Type: GET
  - URL: http://localhost:8080/api/models
  - Response: List of all car models.

- **GET /api/models/{id}**
  - Description: Retrieve details of a specific car model by its ID.
  - Request Type: GET
  - URL: http://localhost:8080/api/models/{id}
  - Response: Details of the car model with the specified ID.

- **POST /api/models**
  - Description: Create a new car model.
  - Request Type: POST
  - URL: http://localhost:8080/api/models
  - Request Body: JSON data containing details of the new car model.
  - Example Request Body:
    ```json
    {
      "name": "ModelName",
      "brandId": 1
    }
    ```
  - Response: A success message indicating the model has been added.

- **DELETE /api/models/{id}**
  - Description: Delete a car model by its ID.
  - Request Type: DELETE
  - URL: http://localhost:8080/api/models/{id}
  - Response: A success message indicating the model with the specified ID has been deleted.

- **PUT /api/models**
  - Description: Update an existing car model.
  - Request Type: PUT
  - URL: http://localhost:8080/api/models
  - Request Body: JSON data containing updated details of the car model, including the model ID.
  - Example Request Body:
    ```json
    {
      "id": 1,
      "name": "UpdatedModelName",
      "brandId": 2
    }
    ```
  - Response: A success message indicating the model with the specified ID has been updated.

- **GET /api/brands/{id}**
  - Description: Retrieve details of a specific car brand by its ID.
  - Request Type: GET
  - URL: http://localhost:8080/api/brands/{id}
  - Response: Details of the car brand with the specified ID.

- **GET /api/brands**
  - Description: Retrieve a list of all car brands.
  - Request Type: GET
  - URL: http://localhost:8080/api/brands
  - Response: List of all car brands.

- **POST /api/brands**
  - Description: Create a new car brand.
  - Request Type: POST
  - URL: http://localhost:8080/api/brands
  - Request Body: JSON data containing details of the new car brand.
  - Example Request Body:
    ```json
    {
      "name": "BrandName"
    }
    ```
  - Response: A success message indicating the brand has been added.

- **PUT /api/brands**
  - Description: Update an existing car brand.
  - Request Type: PUT
  - URL: http://localhost:8080/api/brands
  - Request Body: JSON data containing updated details of the car brand, including the brand ID.
  - Example Request Body:
    ```json
    {
      "id": 1,
      "name": "UpdatedBrandName"
    }
    ```
  - Response: A success message indicating the brand with the specified ID has been updated.

- **DELETE /api/brands/{id}**
  - Description: Delete a car brand by its ID.
  - Request Type: DELETE
  - URL: http://localhost:8080/api/brands/{id}
  - Response: A success message indicating the brand with the specified ID has been deleted.


#### Using Postman

1. Open Postman.

2. Select the request type (GET, POST, DELETE, PUT).

3. Enter the URL for the desired endpoint, as provided in the endpoint descriptions.

4. If required, provide a JSON request body as mentioned in the endpoint description.

5. Click the "Send" button to make the request.

6. Review the response in the Postman console.

You can use these endpoints to interact with your locally running Spring Boot API (port 8080) and perform CRUD (Create, Read, Update, Delete) operations on car models.




### Spring Boot Application Configuration

This document outlines the configuration properties required for a Spring Boot application to connect to a PostgreSQL database. These properties are typically specified in the application's `application.properties` or `application.yml` file.

#### DataSource Configuration

- `spring.datasource.url`: The URL of the PostgreSQL database. Replace `localhost:5432/TestCampRent` with the appropriate database URL.

- `spring.datasource.username`: The username used to authenticate with the PostgreSQL database.

- `spring.datasource.password`: The password used to authenticate with the PostgreSQL database.

- `spring.datasource.driverClassName`: The JDBC driver class for PostgreSQL.

#### Hibernate Configuration

- `spring.jpa.properties.hibernate.dialect`: Specifies the Hibernate dialect for PostgreSQL. This property defines how Hibernate interacts with the PostgreSQL database.

- `spring.jpa.hibernate.ddl-auto`: Specifies the behavior for Hibernate to automatically create, update, or validate the database schema. In this example, it's set to `update`, which means Hibernate will update the schema based on entity classes.

- `spring.jpa.show-sql`: Enables the display of SQL statements in the application logs for debugging purposes.

- `spring.jpa.hibernate.show-sql`: Similar to `spring.jpa.show-sql`, this property also enables the display of SQL statements specifically for Hibernate.

#### Validation Mode

- `spring.jpa.properties.javax.persistence.validation.mode`: Sets the validation mode for the Java Persistence API (JPA) to `none`. This disables JPA's automatic validation.

Please ensure that you replace placeholders such as database URLs, usernames, and passwords with the actual values relevant to your PostgreSQL database configuration. Properly configuring these properties is essential for your Spring Boot application to work seamlessly with PostgreSQL.

For further details on configuring Spring Boot applications, refer to the official Spring Boot documentation.

