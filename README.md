# Spring Boot E-Commerce Microservices

Enterprise-grade e-commerce platform built with modern Java microservices architecture using **Spring Boot 3.5**, **Spring Cloud**, and **modular monorepo design**.

---

## Architecture

```plaintext
Client
   ↓
API Gateway (JWT Validation)
   ↓
Service Discovery (Eureka)
   ↓
Centralized Configuration
   ↓
Microservices
   ├── Auth Service
   ├── User Service
   ├── Product Service
   ├── Order Service
   ├── Cart Service (planned)
   ├── Payment Service (planned)
   └── Notification Service (planned)
```

---

## Repository Structure

```plaintext
ecommerce-microservices/
 ├── infrastructure/
 │   ├── discovery-server
 │   ├── config-server
 │   └── api-gateway
 │
 ├── services/
 │   ├── auth-service
 │   ├── user-service
 │   ├── product-service
 │   ├── order-service
 │   ├── cart-service (planned)
 │   ├── payment-service (planned)
 │   └── notification-service (planned)
 │
 ├── shared/
 │   └── common-core
 │
 ├── pom.xml
 ├── README.md
 └── .gitignore
```

---

## Services

| Service                 | Port |
| ----------------------- | ---- |
| Eureka Discovery Server | 8761 |
| Config Server           | 8888 |
| API Gateway             | 8080 |
| User Service            | 8081 |
| Product Service         | 8082 |
| Order Service           | 8083 |
| Auth Service            | 8084 |

---

## Test Endpoints

### Authentication

```http
POST http://localhost:8084/auth/login
```

Body:

```json
{
  "username": "jorge"
}
```

### Users

```http
GET http://localhost:8080/user-service/users
```

### Products

```http
GET http://localhost:8080/product-service/products
```

### Order Checkout

```http
GET http://localhost:8080/order-service/orders/checkout
```

### Config Server

```http
GET http://localhost:8888/user-service/default
```

---

## Build

```bash
mvn clean install
```

---

## Run Locally

Start services in order:

```bash
mvn spring-boot:run -pl infrastructure/discovery-server
mvn spring-boot:run -pl infrastructure/config-server
mvn spring-boot:run -pl services/auth-service
mvn spring-boot:run -pl services/user-service
mvn spring-boot:run -pl services/product-service
mvn spring-boot:run -pl services/order-service
mvn spring-boot:run -pl infrastructure/api-gateway
```

---

## Tech Stack

* Java 21
* Spring Boot 3.5
* Spring Cloud 2025
* Spring Cloud Gateway
* Eureka Discovery Server
* Spring Config Server
* Spring Data JPA
* H2 Database
* OpenFeign
* JWT Authentication
* Resilience / Fallback Clients
* Maven Monorepo
* MVC Architecture

### Planned

* Gateway JWT Validation
* Role-based Security
* Kafka Event-Driven Architecture
* Distributed Tracing
* Docker Deployment
* MySQL / PostgreSQL Migration

---

## Current Progress

* [x] Monorepo bootstrap
* [x] Eureka Discovery Server
* [x] API Gateway
* [x] Dynamic Routing
* [x] Config Server
* [x] Auth Service
* [x] JWT Token Generation
* [x] User Service
* [x] Product Service
* [x] JPA Persistence
* [x] Distributed Checkout Workflow
* [x] Feign Fallback Resilience
* [ ] Gateway JWT Validation
* [ ] Role-based Security
* [ ] Kafka Integration
* [ ] Observability
* [ ] Docker Compose

---

## Features Implemented

* Service Discovery
* Dynamic Gateway Routing
* Centralized Configuration Management
* Persistent Product Catalog
* Distributed Checkout Orchestration
* Declarative Feign Clients
* Fault-Tolerant Fallback Clients
* JWT Authentication Service
* Enterprise Monorepo Architecture

---

## Goals

This project demonstrates:

* Enterprise Java Architecture
* Cloud-native Spring Ecosystem
* Distributed Systems Design
* Modular Microservices Development
* Production-grade Backend Engineering Practices

---

## Author

**Jorge Lazo**

Backend Engineer focused on:

* Java / Spring Ecosystem
* Microservices Architecture
* Cloud-native Backend Systems
* Enterprise Software Design
