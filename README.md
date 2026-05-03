# Kafka Spring Boot Demo

This project demonstrates how to use Apache Kafka with Spring Boot.

## 🚀 Tech Stack
- Java 17
- Spring Boot
- Apache Kafka

## 📌 Features
- Producer API
- Consumer listener
- REST endpoint to send messages

## 🔧 How to Run

### Start Kafka
Run Kafka server on localhost:9092

### Run Application
mvn spring-boot:run

### API
GET /rest/api/producerMsg?message=hello

## 📂 Project Structure
- controller → REST APIs
- service → Kafka producer logic

## 🧠 Concepts Covered
- Kafka Producer
- Kafka Consumer
- Consumer Groups
