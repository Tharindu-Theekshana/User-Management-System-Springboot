# User Management System

A robust and scalable User Management System built with Spring Boot that provides RESTful APIs for managing users. This system implements best practices in terms of architecture, security, and code organization.

## 🚀 Technologies Used

- Java 17
- Spring Boot 3.4.3
- Spring Data JPA
- MySQL Database
- H2 Database (for testing)
- Lombok
- ModelMapper
- Maven

## 🛠️ Features

- User CRUD operations
- RESTful API endpoints
- Data validation
- Database persistence
- Clean architecture implementation
- DTO pattern for data transfer
- Service layer abstraction
- Repository pattern for data access

## 📋 Prerequisites

- JDK 17 or higher
- Maven 3.6.x or higher
- MySQL Server (for production)
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

## 🚀 Getting Started

1. Clone the repository:

```bash
git clone https://github.com/Tharindu-Theekshana/User-Management-System-Springboot.git
cd User-Management-System-Springboot
```

2. Configure the database:

   - For development, the application uses H2 database by default
   - For production, update the `application.properties` with your MySQL credentials

3. Build the project:

```bash
mvn clean install
```

4. Run the application:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## 📁 Project Structure

```
src/main/java/com/example/demo/
├── controller/    # REST API endpoints
├── service/       # Business logic layer
├── repository/    # Data access layer
├── entity/        # Database entities
├── dto/           # Data Transfer Objects
└── DemoApplication.java  # Application entry point
```

## 🔧 Configuration

The application can be configured through `application.properties` or `application.yml`. Key configurations include:

- Database connection settings
- Server port
- Logging levels
- JPA/Hibernate properties

## 🧪 Testing

Run the test suite using:

```bash
mvn test
```

## 📝 API Documentation

The API endpoints will be documented here. (To be added)

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 👥 Authors

- Your Name - Initial work

## 🙏 Acknowledgments

- Spring Boot Team
- All contributors who have helped this project grow
