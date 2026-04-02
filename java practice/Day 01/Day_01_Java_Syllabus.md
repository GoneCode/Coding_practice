# Day 1 - Java Fundamentals & OOP Basics
**Date:** April 2, 2026
**Focus:** Core Java Fundamentals, Object-Oriented Programming Basics
**Level:** Beginner to Intermediate

---

## 🎯 Today's Learning Objectives

By the end of today, you should be able to:
- [ ] Understand Java basics and JVM architecture
- [ ] Master classes, objects, and constructors
- [ ] Apply the four pillars of OOP (Encapsulation, Inheritance, Polymorphism, Abstraction)
- [ ] Use access modifiers effectively
- [ ] Understand the difference between class and instance members
- [ ] Implement basic OOP programs

**Estimated Time:** 4-6 hours

---

## 📚 Theory: Core Concepts

### 1. Java Platform Basics

#### What is Java?
Java is a **high-level**, **object-oriented**, **platform-independent** programming language.

**Key Features:**
- **Platform Independent** - Write Once, Run Anywhere (WORA)
- **Object-Oriented** - Everything is an object
- **Secure** - No explicit pointers, security manager
- **Robust** - Strong memory management, exception handling
- **Multithreaded** - Built-in support for concurrency
- **Portable** - Works on any platform with JVM

---

#### JVM, JRE, and JDK

```
┌─────────────────────────────────┐
│            JDK                  │  (Java Development Kit)
│  ┌──────────────────────────┐  │
│  │         JRE              │  │  (Java Runtime Environment)
│  │  ┌────────────────────┐  │  │
│  │  │       JVM          │  │  │  (Java Virtual Machine)
│  │  │                    │  │  │
│  │  └────────────────────┘  │  │
│  │  + Java Libraries        │  │
│  └──────────────────────────┘  │
│  + Development Tools            │
│    (javac, javadoc, jar)        │
└─────────────────────────────────┘
```

**JVM (Java Virtual Machine):**
- Executes Java bytecode
- Platform-specific (different for Windows, Linux, Mac)
- Provides runtime environment

**JRE (Java Runtime Environment):**
- JVM + Libraries
- Needed to run Java programs

**JDK (Java Development Kit):**
- JRE + Development tools
- Needed to develop Java programs

---

#### How Java Works

```
Java Source (.java)
       ↓
   [javac compiler]
       ↓
Bytecode (.class)
       ↓
     [JVM]
       ↓
Machine Code
```

**Example:**
```bash
# Compile
javac HelloWorld.java  → creates HelloWorld.class

# Run
java HelloWorld        → JVM executes bytecode
```

---

### 2. Classes and Objects

#### What is a Class?
A **class** is a blueprint or template for creating objects.

#### What is an Object?
An **object** is an instance of a class with actual values.

**Analogy:**
- **Class** = Blueprint of a house
- **Object** = Actual house built from the blueprint

---

#### Basic Class Structure

```java
public class Car {
    // Fields (Instance Variables)
    String brand;
    String model;
    int year;
    double price;

    // Constructor
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Methods
    public void displayInfo() {
        System.out.println(brand + " " + model + " (" + year + ")");
        System.out.println("Price: $" + price);
    }

    public void startEngine() {
        System.out.println(brand + " engine started!");
    }
}
```

#### Creating Objects

```java
public class Main {
    public static void main(String[] args) {
        // Creating objects using constructor
        Car car1 = new Car("Toyota", "Camry", 2023, 25000);
        Car car2 = new Car("Honda", "Civic", 2024, 23000);

        // Accessing methods
        car1.displayInfo();
        car1.startEngine();

        System.out.println();

        car2.displayInfo();
        car2.startEngine();
    }
}
```

**Output:**
```
Toyota Camry (2023)
Price: $25000.0
Toyota engine started!

Honda Civic (2024)
Price: $23000.0
Honda engine started!
```

---

### 3. Constructors

A **constructor** is a special method used to initialize objects.

**Characteristics:**
- Same name as the class
- No return type (not even void)
- Called automatically when object is created
- Can be overloaded

#### Types of Constructors

**1. Default Constructor (No Arguments)**
```java
public class Student {
    String name;
    int age;

    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
    }
}

// Usage
Student s = new Student();  // name="Unknown", age=0
```

**2. Parameterized Constructor**
```java
public class Student {
    String name;
    int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Usage
Student s = new Student("Alice", 20);
```

**3. Constructor Overloading**
```java
public class Student {
    String name;
    int age;
    String course;

    // Constructor 1
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor 2
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor 3
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

// Usage
Student s1 = new Student();
Student s2 = new Student("Bob", 22);
Student s3 = new Student("Carol", 21, "Computer Science");
```

**4. this() - Constructor Chaining**
```java
public class Student {
    String name;
    int age;
    String course;

    public Student() {
        this("Unknown", 0);  // Calls constructor 2
    }

    public Student(String name, int age) {
        this(name, age, "Not Assigned");  // Calls constructor 3
    }

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
}
```

**Important:** `this()` must be the first statement in constructor!

---

### 4. The Four Pillars of OOP

#### 🔒 1. Encapsulation

**Definition:** Bundling data (fields) and methods that operate on that data into a single unit (class), and restricting direct access to some components.

**How to Achieve:**
- Make fields `private`
- Provide public `getter` and `setter` methods

**Benefits:**
- Data hiding
- Control over data validation
- Flexibility to change internal implementation

**Example:**
```java
public class BankAccount {
    // Private fields (encapsulated)
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for balance (read-only access)
    public double getBalance() {
        return balance;
    }

    // Controlled way to modify balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
```

**Usage:**
```java
BankAccount account = new BankAccount("ACC001", 1000);

// Can't access directly: account.balance = 5000; ❌ (private)

// Must use methods:
account.deposit(500);     // ✅
account.withdraw(200);    // ✅
System.out.println("Balance: $" + account.getBalance());
```

---

#### 🧬 2. Inheritance

**Definition:** A mechanism where a new class (child/subclass) inherits properties and behaviors from an existing class (parent/superclass).

**Syntax:**
```java
class ChildClass extends ParentClass {
    // Additional fields and methods
}
```

**Benefits:**
- Code reusability
- Method overriding
- Polymorphism support

**Example:**
```java
// Parent class (Superclass)
public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class (Subclass)
public class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }

    // Dog-specific method
    public void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }

    // Override parent method
    @Override
    public void eat() {
        System.out.println(name + " the dog is eating dog food.");
    }
}

// Another child class
public class Cat extends Animal {
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void meow() {
        System.out.println(name + " is meowing: Meow! Meow!");
    }
}
```

**Usage:**
```java
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.eat();    // Overridden method
        dog.sleep();  // Inherited method
        dog.bark();   // Dog-specific method

        System.out.println();

        Cat cat = new Cat("Whiskers", 2, "Orange");
        cat.eat();    // Inherited method
        cat.sleep();  // Inherited method
        cat.meow();   // Cat-specific method
    }
}
```

**Types of Inheritance in Java:**
```
✅ Single Inheritance:    A → B
✅ Multilevel Inheritance: A → B → C
✅ Hierarchical:          A → B, A → C
❌ Multiple Inheritance:  A,B → C (NOT supported with classes)
✅ Multiple via Interface: Supported
```

**Why Java doesn't support multiple inheritance with classes?**
To avoid the **Diamond Problem** (ambiguity when two parent classes have the same method).

---

#### 🎭 3. Polymorphism

**Definition:** The ability of an object to take many forms. Same method behaves differently in different contexts.

**Types:**

**A. Compile-time Polymorphism (Method Overloading)**

Same method name, different parameters.

```java
public class Calculator {
    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method 4: Add two strings
    public String add(String a, String b) {
        return a + b;
    }
}

// Usage
Calculator calc = new Calculator();
System.out.println(calc.add(5, 3));           // Calls method 1 → 8
System.out.println(calc.add(5, 3, 2));        // Calls method 2 → 10
System.out.println(calc.add(5.5, 3.2));       // Calls method 3 → 8.7
System.out.println(calc.add("Hello", "World")); // Calls method 4 → HelloWorld
```

**Rules for Method Overloading:**
- Same method name
- Different number of parameters, OR
- Different types of parameters, OR
- Different order of parameters
- Return type alone is NOT enough!

**B. Runtime Polymorphism (Method Overriding)**

Child class provides specific implementation of a method already defined in parent class.

```java
// Parent class
public class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public double area() {
        return 0;
    }
}

// Child class 1
public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Child class 2
public class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public double area() {
        return length * width;
    }
}
```

**Usage (Dynamic Method Dispatch):**
```java
public class Main {
    public static void main(String[] args) {
        // Parent reference, child objects
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);

        // Runtime polymorphism
        shape1.draw();  // Calls Circle's draw()
        System.out.println("Area: " + shape1.area());

        shape2.draw();  // Calls Rectangle's draw()
        System.out.println("Area: " + shape2.area());
    }
}
```

**Output:**
```
Drawing a circle
Area: 78.53981633974483
Drawing a rectangle
Area: 24.0
```

**@Override Annotation:**
- Optional but recommended
- Helps catch errors at compile time
- Makes code more readable

---

#### 👁️ 4. Abstraction

**Definition:** Hiding implementation details and showing only essential features.

**How to Achieve:**
1. Abstract Classes
2. Interfaces

**A. Abstract Classes**

```java
// Abstract class
public abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (no implementation)
    public abstract void start();

    // Concrete method
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Concrete class
public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " car is starting with ignition key.");
    }
}

// Another concrete class
public class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " bike is starting with kick.");
    }
}
```

**Usage:**
```java
// Vehicle v = new Vehicle("Generic"); ❌ Cannot instantiate abstract class

Vehicle car = new Car("Toyota");
car.displayBrand();
car.start();

Vehicle bike = new Bike("Yamaha");
bike.displayBrand();
bike.start();
```

**Abstract Class Rules:**
- Cannot be instantiated
- Can have abstract and concrete methods
- Can have constructors, fields, static methods
- A class extending abstract class must implement all abstract methods (or be abstract itself)

---

**B. Interfaces**

An interface is a completely abstract class that contains only abstract methods (before Java 8).

```java
// Interface
public interface Playable {
    void play();      // public abstract by default
    void pause();
    void stop();
}

// Implementation
public class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Music is playing...");
    }

    @Override
    public void pause() {
        System.out.println("Music paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped.");
    }
}

public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Video is playing...");
    }

    @Override
    public void pause() {
        System.out.println("Video paused.");
    }

    @Override
    public void stop() {
        System.out.println("Video stopped.");
    }
}
```

**Usage:**
```java
Playable mp = new MusicPlayer();
mp.play();
mp.pause();
mp.stop();

Playable vp = new VideoPlayer();
vp.play();
```

**Multiple Interface Implementation:**
```java
public interface Drawable {
    void draw();
}

public interface Printable {
    void print();
}

// Implementing multiple interfaces
public class Document implements Drawable, Printable {
    @Override
    public void draw() {
        System.out.println("Drawing document...");
    }

    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}
```

---

**Abstract Class vs Interface**

| Feature | Abstract Class | Interface |
|---------|---------------|-----------|
| **Methods** | Can have abstract and concrete methods | Only abstract methods (before Java 8) |
| **Variables** | Can have instance variables | Only constants (public static final) |
| **Constructor** | Can have constructors | Cannot have constructors |
| **Multiple Inheritance** | No (single inheritance) | Yes (implement multiple interfaces) |
| **Access Modifiers** | All modifiers allowed | Methods are public by default |
| **Keyword** | `extends` | `implements` |
| **When to use** | "IS-A" relationship with shared code | "CAN-DO" capability/contract |

**Example Decision:**
- `Animal` → Abstract Class (shared behavior: eat, sleep)
- `Flyable` → Interface (capability: can fly)

```java
public abstract class Bird extends Animal {
    // Bird-specific code
}

public class Sparrow extends Bird implements Flyable {
    // Sparrow can fly
}

public class Penguin extends Bird {
    // Penguin cannot fly, so doesn't implement Flyable
}
```

---

### 5. Access Modifiers

Control the visibility of classes, methods, and variables.

| Modifier | Class | Package | Subclass | World |
|----------|-------|---------|----------|-------|
| **public** | ✅ | ✅ | ✅ | ✅ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| **default** (no modifier) | ✅ | ✅ | ❌ | ❌ |
| **private** | ✅ | ❌ | ❌ | ❌ |

**Examples:**
```java
public class Example {
    public int publicVar;        // Accessible everywhere
    protected int protectedVar;  // Accessible in package and subclasses
    int defaultVar;              // Accessible only in same package
    private int privateVar;      // Accessible only in this class

    private void privateMethod() {
        // Only accessible within this class
    }

    public void publicMethod() {
        // Accessible everywhere
        privateMethod();  // Can call private method from within class
    }
}
```

**Best Practice:**
- Use most restrictive access level possible
- Fields: usually `private`
- Methods: `public` for API, `private` for helpers
- Classes: usually `public` or default

---

### 6. Static vs Instance Members

#### Instance Members
Belong to an object (each object has its own copy).

```java
public class Student {
    String name;  // Instance variable
    int age;

    public void study() {  // Instance method
        System.out.println(name + " is studying.");
    }
}

Student s1 = new Student();
s1.name = "Alice";

Student s2 = new Student();
s2.name = "Bob";

// Each object has its own name
```

#### Static Members
Belong to the class (shared by all objects).

```java
public class Student {
    String name;           // Instance variable
    static int count = 0;  // Static variable (shared)

    public Student(String name) {
        this.name = name;
        count++;  // Increment shared counter
    }

    public static void printCount() {  // Static method
        System.out.println("Total students: " + count);
        // System.out.println(name); ❌ Can't access instance variable
    }
}

// Usage
Student s1 = new Student("Alice");
Student s2 = new Student("Bob");
Student s3 = new Student("Carol");

Student.printCount();  // Total students: 3
// Access via class name, not object
```

**Key Points:**
- Static members accessed using class name
- Static methods can only access static members directly
- Instance methods can access both static and instance members
- Common use: utility methods, constants

**Example - Math class:**
```java
Math.PI;           // Static variable
Math.sqrt(16);     // Static method
Math.max(10, 20);  // Static method
```

---

### 7. this and super Keywords

#### this Keyword
Refers to the current object.

**Uses:**
```java
public class Person {
    String name;
    int age;

    // 1. Differentiate between instance and local variables
    public Person(String name, int age) {
        this.name = name;  // this.name = instance variable
        this.age = age;    // name = parameter
    }

    // 2. Call another method in same class
    public void display() {
        this.printInfo();  // Can omit 'this.' here
    }

    public void printInfo() {
        System.out.println(this.name + " - " + this.age);
    }

    // 3. Pass current object as parameter
    public void compare(Person other) {
        if (this.age > other.age) {
            System.out.println(this.name + " is older");
        }
    }

    // 4. Return current object
    public Person getThis() {
        return this;
    }
}
```

#### super Keyword
Refers to the parent class.

**Uses:**
```java
public class Animal {
    String type = "Animal";

    public Animal() {
        System.out.println("Animal constructor");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    String type = "Dog";

    public Dog() {
        super();  // 1. Call parent constructor (must be first line)
        System.out.println("Dog constructor");
    }

    @Override
    public void makeSound() {
        super.makeSound();  // 2. Call parent method
        System.out.println("Dog barks");
    }

    public void printType() {
        System.out.println("Child type: " + this.type);   // Dog
        System.out.println("Parent type: " + super.type); // Animal
    }
}
```

---

## 💻 Today's Practice Problems

### Problem 1: Create a Student Management System ⭐⭐ Medium

**Requirements:**
1. Create a `Student` class with:
   - Private fields: name, rollNo, marks (in 3 subjects)
   - Constructor to initialize fields
   - Method to calculate average marks
   - Method to display student details
   - Static variable to count total students

2. Create multiple student objects and display their information

**Starter Code:**
```java
public class Student {
    // Your code here
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 85, 90, 88);
        Student s2 = new Student("Bob", 102, 78, 82, 80);

        s1.displayInfo();
        s2.displayInfo();

        System.out.println("Total students: " + Student.getCount());
    }
}
```

---

### Problem 2: Implement Inheritance Hierarchy ⭐⭐ Medium

**Requirements:**
Create a hierarchy for geometric shapes:
1. Abstract class `Shape` with:
   - Abstract method `calculateArea()`
   - Abstract method `calculatePerimeter()`

2. `Circle` class extending `Shape`
3. `Rectangle` class extending `Shape`
4. `Triangle` class extending `Shape`

**Starter Code:**
```java
public abstract class Shape {
    // Your code here
}

public class Circle extends Shape {
    private double radius;

    // Implement methods
}

// Implement Rectangle and Triangle similarly
```

---

### Problem 3: Bank Account System ⭐⭐⭐ Hard

**Requirements:**
1. Create `BankAccount` class (parent):
   - Private fields: accountNumber, holderName, balance
   - Methods: deposit(), withdraw(), getBalance()

2. Create `SavingsAccount` extends `BankAccount`:
   - Additional field: interestRate
   - Method: calculateInterest()

3. Create `CurrentAccount` extends `BankAccount`:
   - Additional field: overdraftLimit
   - Override withdraw() to allow overdraft

**Bonus:** Add input validation and exception handling

---

### Problem 4: Interface Implementation ⭐⭐ Medium

**Requirements:**
1. Create interface `Playable` with methods: play(), pause(), stop()
2. Create interface `Downloadable` with methods: download(), getFileSize()
3. Create `Video` class implementing both interfaces
4. Create `Audio` class implementing both interfaces

---

### Problem 5: Polymorphism Demo ⭐⭐ Medium

**Requirements:**
Create a program demonstrating runtime polymorphism:
1. `Employee` parent class with method `calculateSalary()`
2. `Manager` extends Employee (salary + bonus)
3. `Developer` extends Employee (salary + project incentive)
4. `Intern` extends Employee (stipend only)

Create an array of Employee and calculate total salary for all employees.

---

## 🔍 Sample Solutions

### Problem 1 Solution:

```java
public class Student {
    private String name;
    private int rollNo;
    private int mark1, mark2, mark3;
    private static int count = 0;

    public Student(String name, int rollNo, int mark1, int mark2, int mark3) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        count++;
    }

    public double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    public void displayInfo() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.printf("Average: %.2f%n", calculateAverage());
        System.out.println();
    }

    public static int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 85, 90, 88);
        Student s2 = new Student("Bob", 102, 78, 82, 80);
        Student s3 = new Student("Carol", 103, 92, 95, 89);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        System.out.println("Total students created: " + Student.getCount());
    }
}
```

---

### Problem 2 Solution:

```java
public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void display() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        // Using Heron's formula
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Circle:");
        circle.display();

        System.out.println("\nRectangle:");
        rectangle.display();

        System.out.println("\nTriangle:");
        triangle.display();
    }
}
```

---

## 🎓 Key Concepts Summary

### What You Learned Today:
1. ✅ **Java Platform** - JVM, JRE, JDK
2. ✅ **Classes & Objects** - Blueprints and instances
3. ✅ **Constructors** - Object initialization
4. ✅ **Encapsulation** - Data hiding with getters/setters
5. ✅ **Inheritance** - Code reusability
6. ✅ **Polymorphism** - Overloading and overriding
7. ✅ **Abstraction** - Abstract classes and interfaces
8. ✅ **Access Modifiers** - public, private, protected, default
9. ✅ **Static vs Instance** - Class-level vs object-level
10. ✅ **this & super** - Current and parent object references

---

## ⚠️ Common Mistakes to Avoid

### 1. Forgetting `this` in Constructor
```java
// WRONG
public Student(String name) {
    name = name;  // Just assigns parameter to itself!
}

// CORRECT
public Student(String name) {
    this.name = name;
}
```

### 2. Calling super() Incorrectly
```java
// WRONG
public Child() {
    System.out.println("Child");
    super();  // Must be first line!
}

// CORRECT
public Child() {
    super();
    System.out.println("Child");
}
```

### 3. Accessing Static Members via Object
```java
// WORKS but NOT recommended
Student s = new Student();
System.out.println(s.count);

// CORRECT
System.out.println(Student.count);
```

### 4. Trying to Instantiate Abstract Class/Interface
```java
// WRONG
Shape shape = new Shape();        // ❌ Cannot instantiate
Playable p = new Playable();      // ❌ Cannot instantiate

// CORRECT
Shape shape = new Circle();       // ✅
Playable p = new MusicPlayer();   // ✅
```

### 5. Missing @Override
```java
// Can cause subtle bugs
public class Child extends Parent {
    // Typo: overide instead of override
    public void dispaly() {  // Creates NEW method instead of overriding!
        // ...
    }
}

// Better: Use @Override
@Override
public void display() {  // Compiler catches mistakes
    // ...
}
```

---

## 📝 Today's Checklist

Before you finish Day 1:
- [ ] Understand JVM, JRE, JDK differences
- [ ] Create at least 3 classes with constructors
- [ ] Implement encapsulation with private fields and getters/setters
- [ ] Create an inheritance hierarchy (at least 3 levels)
- [ ] Demonstrate method overloading
- [ ] Demonstrate method overriding
- [ ] Create and use an abstract class
- [ ] Create and implement an interface
- [ ] Solve all 5 practice problems
- [ ] Understand when to use `this` and `super`
- [ ] Practice access modifiers

---

## 🔗 Additional Resources

### Official Documentation:
- [Oracle Java Tutorials - OOP Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)

### Video Tutorials:
- "Java OOP Tutorial" - search on YouTube
- "Java Inheritance and Polymorphism explained"
- "Abstract Classes vs Interfaces"

### Practice Platforms:
- **HackerRank:** Java OOP track
- **LeetCode:** Java problems
- **GeeksforGeeks:** Java OOP articles
- **Baeldung:** Java tutorials

### Books:
- "Head First Java" - Kathy Sierra (beginner-friendly)
- "Effective Java" - Joshua Bloch (best practices)
- "Core Java Volume I" - Cay S. Horstmann

---

## 💡 Tips for Success

1. **Practice Typing Code** - Don't just read, type every example
2. **Experiment** - Modify examples and see what happens
3. **Draw Diagrams** - Visualize class hierarchies
4. **Real-World Analogies** - Relate concepts to real life
5. **Debug Deliberately** - Understand why errors occur
6. **Ask "Why?"** - Don't just memorize, understand the reasoning
7. **Build Small Projects** - Apply concepts in mini-projects

---

## 📅 Tomorrow's Preview

**Day 2 Topics:**
- Exception Handling
- Collections Framework (ArrayList, HashMap)
- File I/O operations
- String manipulation and StringBuilder

**Get Ready To:**
- Handle errors gracefully
- Work with dynamic data structures
- Read/write files
- Master String operations

---

## ✍️ Notes Section

**What I found difficult:**


**What I found easy:**


**Questions to research:**


**Real-world applications I thought of:**


**Code snippets to remember:**


---

**Remember:** Object-Oriented Programming is the foundation of Java. Master these concepts! 💪

**Next:** Practice the problems, experiment with code, and prepare for Day 2!

---

**Happy Coding!** 🚀
