# Liveasy-Spring-Assignment

This is a simple spring boot application where I have built some APIs.

GitHub link for my Spring Boot application is [Here](https://github.com/vaish5/Liveasy-Spring-Assignment) .

## Prerequisites

You will need:
- Java 8 or higher
- Maven 3.1.1 or higher
- Spring Boot
- PostgreSQL

## Running the application locally

Firstly download the project files ([GitHub Link](https://github.com/vaish5/Liveasy-Spring-Assignment)) and open them in your IDE (Eg. IntelliJ) .
There are several ways to run a Spring Boot application on your local machine.
One way is to execute the `main` method in the `LiveasyspringrestassignmentApplication` class from your IDE.

## Database Configuration

The Database that I have used is PostgreSQL. 
You can set up the database by following these steps:
1. Create a PostgreSQL database with the name [your_database_name] ( `liveasy` is my Database name).
2. Update the `application.properties` file with your database configurations :
<br> <br> You can find the database configurations in `application.properties` file from the project that I have provided.
Here is what it contains:

```
server.port = 9090

spring.datasource.url=jdbc:postgresql://localhost:5432/[Your Database name Here]
spring.datasource.username=[Your Username Here. Default username is postgres]
spring.datasource.password=[Your Password Here]
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update

logging.level.org.hibernate.SQL= DEBUG
```
## Postman Testing

Here are some Postman screenshots demonstrating how to test the APIs:

### Load's APIs

1). POST "/load"

"POST" request for Posting JSON Data:


<img width="636" alt="image" src="https://github.com/vaish5/Liveasy-Spring-Assignment/assets/58335958/ab2cdb12-81a2-439e-94f8-3a998ec176b3">

Response after successfully Posting the JSON Data :

<img width="638" alt="image" src="https://github.com/vaish5/Liveasy-Spring-Assignment/assets/58335958/fc9890db-095e-4e09-a777-a8299e01fdee">


<br> <br>
2). GET "/load"

"GET" request for Getting all records (GET all) :

<img width="643" alt="image" src="https://github.com/vaish5/Liveasy-Spring-Assignment/assets/58335958/a69db0c6-75fa-4402-8423-9fcca0192e2b">
<img width="622" alt="image" src="https://github.com/vaish5/Liveasy-Spring-Assignment/assets/58335958/112a4bc3-1160-495b-9a84-edcf69abf291">
<img width="622" alt="image" src="https://github.com/vaish5/Liveasy-Spring-Assignment/assets/58335958/91baa23f-9f58-49d9-bcea-cb83c23c21e2">

<br> <br> 
3). GET "/load/{shipperId}"

"GET" request for Getting records by shipperId :

<img width="647" alt="image" src="https://github.com/vaish5/Liveasy-Spring-Assignment/assets/58335958/72ec12dd-4e4c-4b3c-952a-5417d898f4bb">

<br> <br>
4). PUT "/load/{shipperId}"

"PUT" request for Updating records by shipperId :

<img width="639" alt="image" src="https://github.com/vaish5/Liveasy-Spring-Assignment/assets/58335958/5e6ab5f9-6cfb-440f-a7a6-8e9c3ae1e9ff">

Response after successfully updating record :

<img width="647" alt="image" src="https://github.com/vaish5/Liveasy-Spring-Assignment/assets/58335958/1ce7c18a-4751-4b87-96d9-e47b95409393">

<br> <br>
5). DELETE "/load/{shipperId}"

"DELETE" request for Deleting record by shipperId :

<img width="644" alt="image" src="https://github.com/vaish5/Liveasy-Spring-Assignment/assets/58335958/e4053938-621e-4e7a-8a62-5868506da253">










