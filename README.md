# Spring Boot E-Commerce Microservices

Enterprise-grade e-commerce platform built with modern Java microservices architecture.

---

## Tech Stack

- Java 21
- Spring Boot 3.5
- Spring Cloud
- Spring Cloud Gateway
- Eureka Discovery Server
- Spring Config Server
- Spring Data JPA
- MySQL
- Docker
- Maven Monorepo
- OAuth2 / JWT (planned)
- Kafka Event-Driven Architecture (planned)
- Observability Stack (planned)

---

## Architecture

```plaintext
Client
   ↓
API Gateway
   ↓
Service Discovery
   ↓
Microservices
   ├── User Service
   ├── Product Service
   ├── Cart Service
   ├── Order Service
   ├── Payment Service
   └── Notification Service
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
 │   ├── cart-service
 │   ├── order-service
 │   ├── payment-service
 │   └── notification-service
 │
 ├── shared/
 │   └── common-core
 │
 └── docker/
```

---

## Current Progress

- [x] Monorepo bootstrap
- [ ] Discovery Server
- [ ] API Gateway
- [ ] User Service
- [ ] Routing
- [ ] Docker Compose
- [ ] Authentication Server
- [ ] Product Service
- [ ] Order Workflow
- [ ] Kafka Integration
- [ ] Observability

---

## Build

```bash
mvn clean install
```

---

## Goals

This project demonstrates:

- Enterprise Java architecture
- Modular monorepo design
- Distributed systems patterns
- Cloud-native Spring ecosystem
- Production-grade scalability practices

---

## Author

**Jorge Lazo**

Software Engineer focused on:

- Java / Spring Ecosystem
- Microservices Architecture
- Cloud-native Backend Systems
- Enterprise Software Design