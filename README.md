# Retail Delivery Notification System

Java implementation of the **Decorator Pattern** — models an automatic beverage vending machine where coffee and tea drinks are composed from a base beverage class with condiments layered on top at runtime.

[![Java](https://img.shields.io/badge/Java-11+-ED8B00?style=flat&logo=java)](https://adoptium.net/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-C71A36?style=flat&logo=apachemaven)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## Overview

The `AutomaticBeverageVendingMachine` serves six drinks across two categories. Rather than hard-coding every beverage+condiment combination, each drink extends an abstract `Beverage` base class. Coffee and Tea act as mid-level abstractions; specific drinks (`Espresso`, `Americano`, `LatteMacchiato`, `BlackTea`, `GreenTea`, `YellowTea`) inherit from them and define their own cost and description.

## Design Pattern — Decorator / Inheritance

| Category | Drinks |
|---|---|
| ☕ Coffee | Espresso, Americano, Latte Macchiato |
| 🍵 Tea | Black Tea, Green Tea, Yellow Tea |

```
Beverage (abstract)
├── Coffee (abstract)
│   ├── Espresso
│   ├── Americano
│   └── LatteMacchiato
└── Tea (abstract)
    ├── BlackTea
    ├── GreenTea
    └── YellowTea
```

## Project Structure

```
src/main/java/edu/bu/met/cs665/
├── Main.java
└── models/
    ├── Beverage.java
    ├── Coffee.java / Tea.java
    ├── AutomaticBeverageVendingMachine.java
    └── [individual drink classes]
```

## Prerequisites

- Java 11+
- Maven 3.6+

## Build & Run

```bash
mvn clean package
java -jar target/*.jar
```

## Run Tests

```bash
mvn test
```