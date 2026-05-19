# Spring Boot E-Commerce Microservices

Enterprise-grade e-commerce platform built with modern Java microservices architecture using **Spring Boot 3.5**, **Spring Cloud**, and **modular monorepo design**.

---

## Architecture

```plaintext
Client
   ↓
API Gateway
   ↓
Service Discovery (Eureka)
   ↓
Centralized Configuration
   ↓
Microservices
   ├── User Service
   ├── Product Service
   ├── Cart Service (planned)
   ├── Order Service (planned)
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
 │   ├── user-service
 │   ├── product-service
 │   ├── cart-service (planned)
 │   ├── order-service (planned)
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

| Service | Port |
|---------|------|
| Eureka Discovery Server | 8761 |
| Config Server | 8888 |
| API Gateway | 8080 |
| User Service | 8081 |
| Product Service | 8082 |

---

## Test Endpoints

### Users

```http
GET http://localhost:8080/user-service/users
```

### Products

```http
GET http://localhost:8080/product-service/products
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
mvn spring-boot:run -pl services/user-service
mvn spring-boot:run -pl services/product-service
mvn spring-boot:run -pl infrastructure/api-gateway
```

---

## Tech Stack

- Java 21
- Spring Boot 3.5
- Spring Cloud 2025
- Spring Cloud Gateway
- Eureka Discovery Server
- Spring Config Server
- Spring Data JPA
- H2 Database
- Maven Monorepo
- MVC Architecture

### Planned

- OAuth2 / JWT Security
- Kafka Event-Driven Architecture
- Observability Stack
- Distributed Tracing
- Docker Deployment
- MySQL / PostgreSQL Migration

---

## Current Progress

- [x] Monorepo bootstrap
- [x] Eureka Discovery Server
- [x] API Gateway
- [x] Dynamic Routing
- [x] Config Server
- [x] User Service
- [x] Product Service
- [x] JPA Persistence
- [x] Sample Catalog Bootstrap
- [ ] Authentication Server
- [ ] Order Workflow
- [ ] Feign Clients
- [ ] Kafka Integration
- [ ] Observability
- [ ] Docker Compose

---

## Features Implemented

- Service Discovery
- Dynamic Gateway Routing
- Centralized Configuration Management
- Persistent Product Catalog
- Distributed Service Registration
- Enterprise Monorepo Architecture

---

## Goals

This project demonstrates:

- Enterprise Java Architecture
- Cloud-native Spring Ecosystem
- Distributed Systems Design
- Modular Microservices Development
- Production-grade Backend Engineering Practices

---

## Author

**Jorge Lazo**

Backend Engineer focused on:

- Java / Spring Ecosystem
- Microservices Architecture
- Cloud-native Backend Systems
- Enterprise Software Design