# Product Manager

## Spring Boot CRUD Application 
This repository contains a simple Spring Boot application implementing CRUD (Create, Read, Update, Delete) operations for managing categories and products. The application is built on the Spring framework and uses a PostgreSQL database.

## Project Structure 
### Controller: 
* **CategoryController:** Handles requests related to categories.
* **ProductController:** Manages product-related requests.
  
### DTO (Data Transfer Object): 
* **ProductDTO:** A DTO for transferring product-related data.
  
### Entity: 
* **Category:** Represents a category entity.
* **Product:** Represents a product entity, including a many-to-one relationship with Category.
  
### Repository: 
* **CategoryRepository:** JPA repository for the Category entity.
* **ProductRepository:** JPA repository for the Product entity.
  
### Service: 
* **CategoryService:** Provides business logic for category-related operations.
* **ProductService:** Manages product-related business logic, including creating, reading, updating, and deleting products.

## How to Run
* **Clone the repository:** git clone https://github.com/DrDmlg/product-manager.git
* Ensure you have PostgreSQL installed and running.
* Configure the database connection in application.properties or application.yml.
* **Build and run the application:** Access the application at http://localhost:8080.

## Endpoints 
### Categories: 
* **GET /categories:** Retrieve all categories.
* **DELETE /categories/delete/{id}:** Delete a category by ID.

### Products: 
* **POST /products:** Create a new product.
* **GET /products:** Retrieve all products.
* **GET /products/category/{id}:** Retrieve products by category ID.
* **PUT /products:** Update a product.
* **DELETE /products/delete/{id}:** Delete a product by ID.
  
## Contributing 
Feel free to fork this repository, make changes, and submit a pull request. Contributions are welcome!

## Contact
If you have any questions or suggestions, feel free to reach out to me at *dorokhov.did@gmail.com* or through my GitHub page.
