# Animal Project - Java Inheritance Study

## Purpose

This project is a study exercise to practice core Object-Oriented Programming concepts in Java, mainly:

- Inheritance
- Method overriding
- Method overloading
- Abstraction with abstract classes
- Enums for controlled values

The idea is to model animals using a base class (`Animal`) and specialized classes like `Dog` and `Cat`.

## What This Project Is For

Use this repository to learn how to:

- Create a reusable parent class with common attributes and behavior.
- Extend that parent class in child classes with specific fields and methods.
- Override parent methods to change behavior in subclasses.
- Overload methods to support different parameter combinations.
- Organize Java code using packages (`app`, `model`, `enums`, `util`).

## Current Structure

```text
app/
  Main.java
enums/
  FurColor.java       # Implemented using TrainingLevel as a base
  Habitat.java
  TrainingLevel.java
model/
  Animal.java
  Cat.java            # Implemented using Dog as a reference
  Dog.java
util/
  Validations.java