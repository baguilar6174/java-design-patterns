# Design Patterns with Java

Design patterns are common and proven solutions to common problems.

**Advantages:**

1. ***Proven solutions***: Avoiding known errors
2. ***Effective communication:*** Establish a common language for developers.
3. ***Code quality:*** clean and effective code
4. ***Facilitates learning:*** guides and helps to understand the concepts
5. ***Standardization:*** by applying known patterns, we apply consistency in the code.
6. ***Don't reinvent the wheel:*** focus on the problem without having to plan the strategy from scratch.

---

## Creational patterns

Provide object creation mechanisms that increase flexibility and reuse of existing code. And hide the instantiation details.

**Solve problems related to:**

- How to create objects efficiently?
- Hiding the instantiation logic.
- Reducing coupling between cl

**Objectives:**

- Improve flexibility by changing the creation process.
- Promotes the principle of single responsibility.

**Benefits**

- Reduction of duplicate code
- Increased clarity in the object creation process
- Alignment with SOLID principles

### [Builder](https://refactoring.guru/design-patterns/builder)

- Allows to build complex objects step by step.
- Produce different types and representations of an object using the same construction code.
- ***Useful when*** we need to build a complex object with many parts, and we want the construction process to be independent of the parts that compose it.

[View code](./src/creational/builder)

### [Factory Method](https://refactoring.guru/design-patterns/factory-method)

- Allows you to create objects without specifying the exact class of the object to be created.
- Delegate the creation of objects to subclasses or methods that encapsulate this logic.
- ***Useful when*** a class cannot anticipate the type of objects to be created.

[View code](./src/creational/factorymethod)

### Abstract Factory
### Prototype
### Immutability
### Singleton
### Factory Function

---

## Structural patterns

Explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.

### Adapter
### Bridge
### Composite
### Decorator
### Facade
### Flyweight
### Proxy

---

## Behavioral patterns

Take care of effective communication and the assignment of responsibilities between objects.

### Chain Responsibility
### Command
### Iterator
### Mediator
### Memento
### Observer
### State
### Strategy
### Template method
### Visitor

## Stay in touch

- Website - [www.bryan-aguilar.com](https://www.bryan-aguilar.com/)
- Medium - [baguilar6174](https://baguilar6174.medium.com/)
- LinkedIn - [baguilar6174](https://www.linkedin.com/in/baguilar6174)
