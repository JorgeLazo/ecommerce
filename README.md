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
   ├── Order Service
   │     ├── Feign → User Service
   │     └── Feign → Product Service
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

| Service | Port |
|---------|------|
| Eureka Discovery Server | 8761 |
| Config Server | 8888 |
| API Gateway | 8080 |
| User Service | 8081 |
| Product Service | 8082 |
| Order Service | 8083 |

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

### Orders (Distributed Checkout)

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
mvn spring-boot:run -pl services/user-service
mvn spring-boot:run -pl services/product-service
mvn spring-boot:run -pl services/order-service
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
- Spring Cloud OpenFeign
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
- [x] Order Service
- [x] JPA Persistence
- [x] Sample Catalog Bootstrap
- [x] Feign Client Integration
- [x] Distributed Checkout Workflow
- [ ] Authentication Server
- [ ] Kafka Integration
- [ ] Observability
- [ ] Docker Compose

---

## Features Implemented

- Service Discovery
- Dynamic Gateway Routing
- Centralized Configuration Management
- Persistent Product Catalog
- Declarative Inter-service Communication
- Distributed Checkout Orchestration
- Distributed Service Registration
- Enterprise Monorepo Architecture

---

## Distributed Workflow Example

```plaintext
Client Request
   ↓
API Gateway
   ↓
Order Service
   ├── Fetch Users → User Service
   └── Fetch Products → Product Service
   ↓
Aggregated Checkout Response
```

---

## Goals

This project demonstrates:

- Enterprise Java Architecture
- Cloud-native Spring Ecosystem
- Distributed Systems Design
- Declarative Service Communication
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