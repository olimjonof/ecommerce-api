# E-Commerce Product & Category API

A Spring Boot REST API for managing products and categories using a secure DTO architecture.

##  Features
- **Relational Mapping:** Connects products to categories (`1:N`).
- **DTO Layer:** Hides DB entities, returns `categoryName` for products.
- **Validation:** Validates inputs (`@NotBlank`, `@Positive`).

##  Tech Stack
- Java & Spring Boot (JPA, Hibernate)
- PostgreSQL & DBeaver
- Lombok

##  Endpoints
- `POST /api/categories` | `GET /api/categories`
- `POST /api/products` | `GET /api/products`