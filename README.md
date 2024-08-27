# Booking Movie Ticket APIs Spring Boot Project

- This project is a Spring Boot implementation of the backend APIs for a ticket booking system similar to the popular platform "BookMyShow". It provides a set of RESTful APIs that enable client applications to interact with the ticket booking system and perform various operations.
- This project is a movie ticket booking system allowing users to add movies, theaters, shows, and book tickets. The system includes various functionalities such as adding theaters and seats, associating seats with shows, and booking tickets.

## Features
* User Registration -> Users can create an account, log in, and manage their profile information.
* Movie Management -> Admin users can add, edit, and remove movie from the system.
* Theater Management -> Admin users can add, allocate seats, edit, and remove Theaters from the system.
* Ticket Booking -> Users can browse through the available movie, select the desired event, and book tickets for it.
* Seat Selection -> Users can choose their preferred seats from the available options for a selected event.
* Booking History -> Users can view their booking history and check the details of their past bookings.

## Technologies Used
* Java 17+
* Spring Boot 3.3.0 
* Spring Data JPA
* PostGresql (as the database)
* Maven (for dependency management)

## Getting Started
To set up the project on your local machine, follow these steps:

1. Navigate to the project directory
2. Configure the database settings in `application.properties` file.
3. Build the project using Maven: `mvn clean install`
4. Run the application: `mvn spring-boot:run`
5. The application will be accessible at `http://localhost:8080`.

## Database Setup
This project uses MySQL as the database. Follow these steps to set up the database:
1. Install MySQL on your local machine.
2. Create a new database named movie_ticket_booking.
3. Update the database configuration in `application.properties` file.

## API Documentation
- The API documentation for this project can be found at `http://localhost:8080/swagger-ui.html`. 
- It provides detailed information about each API, including request/response formats and parameters.

## API Endpoints

### Movie

**1. Add Movie**
- **POST** `http://localhost:8080/movie/addNew`

**Request Body:**
```json
{
    "movieName": "Inception",
    "duration": 148,
    "rating": 8.8,
    "releaseDate": "2010-07-16",
    "genre": "ACTION",
    "language": "ENGLISH"
}
```
**Response:**
- `The movie has been added successfully`

### TheaterController
**1. Add Theater**
- **Post** : `http://localhost:8080/theater/addNew`
- **Request Body:**
```json
{
    "name": "CineMax",
    "address": "123 Main Street, Springfield"
}
```
**Response Body :**
- `Theater has been saved Successfully`

**Request Body:**
```
{
    "name": "Galaxy Cinema",
    "address": "456 Elm Street, Springfield"
}
```
**Response Body:**
- `Theater has been saved Successfully`

**Request Body:**
```
{
    "name": "CineWorld",
    "address": "123 Main Street, Springfield"
}
```
**Response Body :** 
- `Theater is already Present on this Address`

**2. Add Theater Seats**
- **Post** : `http://localhost:8080/theater/addTheaterSeat`
- **Request Body:**
```  
{
    "address": "123 Main Street, Springfield",
    "noOfSeatInRow": 10,
    "noOfPremiumSeat": 20,
    "noOfClassicSeat": 80
} 
```
**Response Body :**
 - `Theater Seats have been added successfully`

**Request Body:**
```  
{
    "address": "789 Maple Avenue, Springfield",
    "noOfSeatInRow": 10,
    "noOfPremiumSeat": 15,
    "noOfClassicSeat": 50
}
```
**Response :**
- `Theater is not present in this address`

### ShowController
**1. Add Show**
-**Post :** `http://localhost:8080/show/addNew`
- **Request Body:**
```
{
  "showStartTime": "18:00:00",
  "showDate": "2024-09-01",
  "theaterId": 1,
  "movieId": 1
}
```
- **Response Body :**
- `Show has been added Successfully```

**2. Associate Show Seats:**
- **Post :** `http://localhost:8080/show/associateSeats`
- **Request Body:**
```
{
  "showId": 1,
  "priceOfPremiumSeat": 200,
  "priceOfClassicSeat": 100
}
```
- **Response Body:**
- `Show seats have been associated successfully```

### UserController
- **add user**
- **Post :** `http://localhost:8080/user/addNew`
- **Request Body:** 
```
{
    "name": "John Doe",
    "age": 30,
    "address": "123 Main St",
    "gender": "FEMALE",
    "mobileNo": "1234567890",
    "emailId": "johndoe@example.com",
    "roles": "USER"
}
```
- **Response :**
- `User Saved Successfully`

### TicketController
- **Book ticket**
- **Post :** `http://localhost:8080/ticket/book`
- **Request Body:**
```
{
    "showId": 1,
    "userId": 2,
    "requestSeats": [
        "1A",
        "1B",
        "2A"
    ]
}
```
**Response :**
```
 {
    "time": "18:00:00",
    "date": "2024-09-01",
    "movieName": "Inception",
    "theaterName": "CineMax",
    "address": "123 Main Street, Springfield",
    "bookedSeats": "1A,1B,2A,",
    "totalPrice": 300
}
```

### Thank You !!!
