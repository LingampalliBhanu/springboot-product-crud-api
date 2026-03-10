# springboot-product-crud-api
Spring Boot REST API for Product Management with CRUD operations using JPA and MySQL
# Spring Boot Product CRUD API

This project is a REST API built using Spring Boot for managing products with CRUD operations.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Features
- Add Product
- View All Products
- Get Product By ID
- Delete Product

## API Endpoints

| Method | Endpoint | Description |
|------|------|------|
| GET | /products | Get all products |
| POST | /products | Add a new product |
| GET | /products/{id} | Get product by ID |
| DELETE | /products/{id} | Delete product |



## Example API Requests

### Add Product

POST /products

Request Body (JSON)

{
  "name": "Laptop",
  "price": 55000,
  "quantity": 5
}

### Get All Products

GET /products

### Get Product By ID

GET /products/1

### Delete Product

DELETE /products/1


## Author
**Bhanu Lingampalli**
