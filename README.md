Design Pattern 
![design_patterns_schema_en](https://github.com/user-attachments/assets/0d0dc0dc-3c94-41a6-b4df-001ab563bcf5)



### ✅ **Design Patterns Summary Table**

| Category | Pattern | Definition | Goal | When to Use | Real-world Java Example |
|----------|---------|------------|------|--------------|--------------------------|
| **Creational** | **Singleton** | Ensures a class has only one instance and provides a global access point. | Control access to shared resource. | Logging, config managers, database connections. | `Runtime.getRuntime()` |
|  | **Factory Method** | Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created. | Delegates instantiation logic to subclasses. | When you don't know the object type in advance. | `Calendar.getInstance()` |
|  | **Abstract Factory** | Provides an interface to create families of related objects without specifying their concrete classes. | Build groups of related products. | UI components for different OS (Windows/Mac). | `DocumentBuilderFactory` |
|  | **Builder** | Separates the construction of a complex object from its representation. | Build complex objects step-by-step. | Complex object creation with multiple options. | `StringBuilder`, `Lombok @Builder` |
|  | **Prototype** | Clone existing object instead of creating from scratch. | Reduce object creation overhead. | When creating new objects is expensive. | `Object.clone()` |

---

| Category | Pattern | Definition | Goal | When to Use | Real-world Java Example |
|----------|---------|------------|------|--------------|--------------------------|
| **Structural** | **Adapter** | Converts interface of a class into another expected by the client. | Compatibility between incompatible interfaces. | Integrating legacy systems. | `InputStreamReader`, `Arrays.asList()` |
|  | **Bridge** | Separates abstraction from implementation so they can vary independently. | Decouple abstraction from implementation. | UI rendering on different platforms. | JDBC drivers |
|  | **Composite** | Treat individual objects and compositions uniformly. | Tree-like structures. | Filesystem (folder contains files or other folders). | `Component` in Swing |
|  | **Decorator** | Add behavior to objects dynamically without altering original code. | Extend functionality at runtime. | Adding filters or wrappers. | `BufferedReader`, `HttpServletRequestWrapper` |
|  | **Facade** | Provides a simplified interface to a complex subsystem. | Reduce complexity. | External APIs or library access. | `javax.faces.context.FacesContext` |
|  | **Flyweight** | Shares objects to reduce memory usage when many objects are needed. | Improve memory performance. | Text editors for characters. | `Integer.valueOf()` (caching) |
|  | **Proxy** | Provides a surrogate or placeholder for another object to control access. | Add access control, lazy loading. | Security, logging, lazy initialization. | `java.lang.reflect.Proxy` |

---

| Category | Pattern | Definition | Goal | When to Use | Real-world Java Example |
|----------|---------|------------|------|--------------|--------------------------|
| **Behavioral** | **Strategy** | Define a family of algorithms, encapsulate each one, and make them interchangeable. | Make algorithm easily swappable. | Sorting strategies, payment modes. | `Comparator`, `Collections.sort()` |
|  | **Observer** | One-to-many dependency between objects so that when one changes, dependents are notified. | Event-driven programming. | UI events, pub-sub systems. | `java.util.Observer` (deprecated), `PropertyChangeListener` |
|  | **Command** | Encapsulate a request as an object, allowing undo/redo and queuing. | Decouple sender from receiver. | Task scheduling, command queue. | `Runnable`, `ActionListener` |
|  | **State** | Allows an object to alter its behavior when its internal state changes. | Eliminate large conditional logic. | Finite State Machines (FSM). | `Thread` states |
|  | **Template Method** | Defines the skeleton of an algorithm and lets subclasses override steps. | Reuse algorithm structure. | Common steps across different modules. | `AbstractList` |
|  | **Mediator** | Centralized communication between objects. | Reduce object-to-object dependencies. | Chat apps, UI coordination. | `java.util.Timer`, `java.util.concurrent.ExecutorService` |
|  | **Chain of Responsibility** | Pass request along a chain until it is handled. | Decouple sender and receiver. | Logging, filters, support systems. | Servlet Filters, Logger Chains |
|  | **Iterator** | Provides a way to access elements sequentially without exposing underlying structure. | Traverse collections. | Looping over collections. | `Iterator`, `ListIterator` |
|  | **Visitor** | Add new operations to a structure without modifying the structure. | Separate algorithms from data. | Compilers, document processors. | `FileVisitor`, `javax.lang.model.element.ElementVisitor` |
|  | **Interpreter** | Defines a grammar and interpreter for a language. | Parse expressions or DSLs. | Expression evaluation. | Expression parsers |
|  | **Memento** | Capture and restore an object's state. | Undo/rollback functionality. | Undo systems, versioning. | `Serializable` with deep copy |
