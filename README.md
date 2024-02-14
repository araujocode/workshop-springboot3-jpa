# Spring Boot Web Services with JPA/Hibernate

## Overview

This project aims to demonstrate the implementation of a web service using Spring Boot and JPA/Hibernate. It was developed as part of the course by Nélio Alves. The main objectives include:

- Creating a Spring Boot Java project.
- Implementing a domain model.
- Structuring logical layers: resource, service, repository.
- Configuring a test database (H2).
- Populating the database.
- CRUD operations - Create, Retrieve, Update, Delete.
- Exception handling.

## Prerequisites

To run this project, you need to have the following installed:

- Java Development Kit (JDK) version 8 or higher
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse) - Optional
- Spring Boot 3
- Hibernate/JPA

## Getting Started

Follow these steps to get the project up and running on your local machine:

1. Clone the repository to your local machine:

    ```
    git clone https://github.com/araujocode/workshop-springboot3-jpa.git
    ```

2. Open the project in your preferred IDE or editor.

3. Build the project using Maven:

    ```
    mvn clean install
    ```

4. Run the Spring Boot application:

    ```
    mvn spring-boot:run
    ```

5. Access the endpoints using a web browser or tools like Postman.

## Project Structure

The project is structured as follows:

- `src/main/java`: Contains the Java source code.
    - `com.example.demo`: Main package for the project.
        - `controller`: Contains RESTful controllers.
        - `model`: Contains domain model classes.
        - `repository`: Contains JPA repositories.
        - `service`: Contains service classes.
        - `exception`: Contains custom exception classes.
    - `Application.java`: Entry point of the Spring Boot application.
- `src/main/resources`: Contains application properties and SQL scripts.
    - `application.properties`: Configuration properties.
 
## Domain Model

Below is a visual representation of the domain model used in this project:

![Domain Model](https://github.com/araujocode/workshop-springboot3-jpa/assets/125917112/4edd36d5-5ae1-4e93-afeb-884e054e141e)

The domain model defines the structure and relationships between the key concepts of the system. It includes entities, relationships, and attributes essential for understanding the system's functionality.


## Technologies Used

- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

## Contributing

Contributions are welcome! Feel free to fork the repository, make changes, and submit pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

Special thanks to [Nélio Alves](https://github.com/acenelio) for the guidance and resources provided in his course.
