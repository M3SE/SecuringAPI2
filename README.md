 # Securing API 2

This project is a Spring Boot application that demonstrates CSRF protection and Redis caching. The application includes an API endpoint that sanitizes user input to prevent XSS attacks.

## Prerequisites

- Java 11
- Maven
- Redis

## Getting Started

### 1. Clone the Repository


### 2. Configure Redis

Ensure Redis is running on your local machine or configure the connection details in `src/main/resources/application.properties`:

```properties
spring.redis.host=localhost
spring.redis.port=6379
spring.redis.password=yourpassword
```

### 3. Build the Project

Use Maven to build the project:

```bash
mvn clean install
```

### 4. Run the Application

Run the Spring Boot application:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`.

## Testing the APIs

### 1. Manual Testing with Postman

You can use Postman to test the APIs. Ensure you include the CSRF token in your requests.

#### Example Request

- **Endpoint**: `POST /api/sanitize`
- **Headers**:
    - `Content-Type: application/json`
    - `X-CSRF-TOKEN: <csrf-token>`
- **Body**:
  ```json
  "<script>alert('XSS')</script>"
  ```

### 2. Automated Testing with JUnit

Run the integration tests using Maven:

```bash
mvn test
```

### Test Class

The `UserControllerTest` class tests the `/api/sanitize` endpoint:
