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
- Reducing coupling between classes

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

### [Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)

- Allows to create families of related objects without specifying specific classes.
- Instead of creating individual objects directly, we create factories that produce a set of related objects.
- ***Useful when*** you need to create objects that are part of a family and you want to make sure that these objects complement each other.

[View code](./src/creational/abstractfactory)

### [Prototype](https://refactoring.guru/design-patterns/prototype)

- Allows to copy existing objects without making the code dependent on their classes.
- ***Useful when*** you need to duplicate content.

[View code](./src/creational/prototype)

### Immutability with copy

- Although immutability is a good practice, it is not always possible.
- In these cases you can make a copy of the object and modify the copy.
- ***Useful when*** you want to maintaining a history of states in interactive applications.

[View code](./src/creational/immutabilitycopy)

### [Singleton](https://refactoring.guru/design-patterns/singleton)

- Ensures that a class has only a single instance and provides an entry point to that instance.
- ***Useful when*** you need to control access to a unique class instance.
- Common examples are database object or configuration object.

[View code](./src/creational/sigleton)

### Factory Function

- Allows to create objects or functions dynamically
- ***Useful when*** we need to create objects or functions in runtime

[View code](./src/creational/factoryfunction)

---

## Structural patterns

Explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.

Here is a more complete description of structural design patterns with the missing details filled in:

**Solve problems related to:**

- Organizing objects and classes to form larger, well-structured systems.
- Managing dependencies between objects.
- Ensuring that changes in one part of a system minimally affect other parts.
- Supporting dynamic addition or modification of system behavior.

**Objectives:**

- Simplify the design of complex systems by focusing on the relationships between objects and classes.
- Enhance code maintainability and readability.
- Promote reuse by providing standard solutions for common structural challenges.
- Support scalability by creating flexible and extensible structures.

**Benefits:**

- Improved organization and clarity of the system’s architecture.
- Reduced coupling between system components.
- Greater flexibility and adaptability to changes in requirements.
- Increased reuse of existing code by combining objects in new ways.

### [Adapter](https://refactoring.guru/design-patterns/adapter)

- Allows objects with incompatible interfaces to work together.
- ***Useful when*** using external libraries.

[View code](./src/structural/adapter)

### [Bridge](https://refactoring.guru/design-patterns/bridge)

- It allows decoupling an abstraction from its implementation, so that both can vary independently.
- ***Useful when*** you have several implementations of an abstraction.
- It can be used to separate business logic from presentation.
- Can be used to separate the logic from the user interface.

[View code](./src/structural/bridge)

### [Composite](https://refactoring.guru/design-patterns/composite)

- Allows to compose objects in tree structures to represent hierarchies.
- ***Useful when*** you need to treat individual objects and their compositions in a uniform way.

[View code](./src/structural/composite)

### [Decorator](https://refactoring.guru/design-patterns/decorator)

- It allows adding functionalities to objects by placing these objects inside other special encapsulated objects that contain these functionalities.
- ***Useful when*** you need to add functionalities to objects in a dynamic and flexible way.

[View code](./src/structural/decorator)

### [Facade](https://refactoring.guru/design-patterns/facade)

- Provides a unified interface for a set of interfaces in a subsystem.
- Defines a higher level interface that makes the system easier to use.

[View code](./src/structural/facade)

### [Flyweight](https://refactoring.guru/design-patterns/flyweight)

- Allows the use of shared objects to efficiently support large numbers of objects.
- ***Useful when*** we have a large number of objects and want to reduce memory usage.

[View code](./src/structural/flyweight)

### [Proxy](https://refactoring.guru/design-patterns/proxy)

- Allows controlling access to an object, i.e. an object is created that acts as an intermediary between the client and the real object.It allows you to control access to an object, in other words, you create an object that acts as an intermediary between the client and the actual object.
- ***Useful when*** we need to control access to an object, for example, to verify if the client has permissions to access methods or properties.

[View code](./src/structural/proxy)

---

## Behavioral patterns

Take care of effective communication and the assignment of responsibilities between objects.

**Solve problems related to:**

- **Complex interactions** between objects without making them tightly coupled.
- **Encapsulating behaviors** that can change at runtime.
- **Efficient object collaboration** while maintaining flexibility.
- **Avoiding hardcoded logic** for executing different behaviors.

**Objectives:**

- **Improve object communication** while keeping them loosely coupled.
- **Encapsulate behavior** and allow objects to change their behavior dynamically.
- **Increase flexibility** by making it easier to extend functionality without modifying existing code.
- **Follow the Open/Closed Principle** by enabling new behaviors without altering existing classes.

**Benefits:**

- **Better maintainability** by reducing dependencies between objects.
- **Scalability** by allowing new behaviors to be introduced easily.
- **Code reusability** by separating behavior from the main logic.
- **Enhances flexibility** in how objects interact without requiring modifications.

### [Chain Responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility)

- Allows requests to be passed along a chain of handlers.
- ***Useful when*** you need to process data in different ways, but you do not know in advance what kind of processing you need or in what order. But you know that you need to process in a sequence.

[View code](./src/behavioral/chainresponsibility)

### [Command](https://refactoring.guru/design-patterns/command)

- Encapsulates a request as an object, allows to parameterize other objects with different requests, queue requests, log requests and supports undoable operations.
- ***Useful when*** you need to decouple the object that invokes the operation from the object that knows how to perform it.

[View code](./src/behavioral/command)

### [Iterator](https://refactoring.guru/design-patterns/iterator)

- Allows you to scroll through the internal elements of a collection without exposing the internal structure of the collection.
- ***Useful when*** you need to traverse a collection of elements regardless of how the elements are stored.

[View code](./src/behavioral/iterator)

### [Mediator](https://refactoring.guru/design-patterns/mediator)

- Helps reduce messy dependencies between objects. Limits direct communication, making communication only through the mediator.
- ***Useful when*** you need to reduce the complexity between objects.

[View code](./src/behavioral/mediator)

### [Memento](https://refactoring.guru/design-patterns/memento)

- Allows to capture and externalize an internal state of an object, so that the object can be restored to that state later.
- ***Useful when*** you need to save the state of an object in order to be able to return to it in the future.

[View code](./src/behavioral/memento)

### [Observer](https://refactoring.guru/design-patterns/observer)

- It establishes a one-to-many relationship between an object called the subject and other objects called observers that are automatically notified and updated by the subject when changes in its state occur. 
- ***Useful when*** we need multiple objects to be aware of changes.

[View code](./src/behavioral/observer)

### [State](https://refactoring.guru/design-patterns/state)

- Allows an object to change its behavior when its internal state changes.
- ***Useful when*** an object has a state-dependent behavior and must change its behavior at runtime.

[View code](./src/behavioral/state)

### [Strategy](https://refactoring.guru/design-patterns/strategy)

- It defines a family of algorithms, encapsulates them and makes them interchangeable. 
- ***Useful when*** you have a class that has a behavior that can change at runtime and you want to delegate the implementation responsibility to another class.

[View code](./src/behavioral/strategy)

### Template method
### Visitor

## Stay in touch

- Website - [www.bryan-aguilar.com](https://www.bryan-aguilar.com/)
- Medium - [baguilar6174](https://baguilar6174.medium.com/)
- LinkedIn - [baguilar6174](https://www.linkedin.com/in/baguilar6174)
