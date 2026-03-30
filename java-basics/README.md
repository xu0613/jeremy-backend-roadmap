# Java Basics
## Day 1 — Java Basics

Today I set up my Java development environment and confirmed everything works correctly.

- Installed **JDK 21**
- Installed **IntelliJ IDEA**
- Created my GitHub learning repository
- Connected the project with Git and pushed the first commit

After that, I started learning basic Java syntax, including:

- Java program structure (`class` and `main` method)
- Variables and basic data types (`int`, `double`, `String`, `boolean`, `char`)
- Output using `System.out.println`
- Basic arithmetic operations
- User input with `Scanner`
- Conditional statements (`if`, `else if`, `else`)

I also wrote several small programs to practice input, calculations, and simple conditional logic.

Tomorrow I plan to continue with logical operators and loops.

## Day 2 — Java Basics

Today I continued learning Java syntax, focusing on logical conditions and loops.

I learned how to use logical operators (`&&`, `||`, `!`) to combine multiple conditions in `if` statements.

I also understood an important difference from Python: in Java, strings should be compared using `.equals()` instead of `==`.

In addition, I learned how to use loops (`while` and `for`) to repeat code execution.

I implemented a simple number guessing game using `while` and `if`, which helped me better understand how to control program flow.

Overall, today was about making programs more interactive and dynamic.

## Day 3 - Java OOP 1

Today I continued learning Java and focused on object-oriented programming.

What I learned:
- Classes and objects
- Attributes and methods
- Using `this`
- Creating simple classes such as `day1To3.Student`, `day1To3.Book`, and `day1To3.Dog`

What I practiced:
- Writing class definitions
- Creating objects in `main`
- Calling methods like `showInfo()`, `read()`, and `bark()`
- Passing values into methods such as `setInfo()`

I also learned that method parameters are used to receive values from outside the class, which helps update the attributes of an object more flexibly.

## Day 4 - Java OOP 2

Today I learned more about Java object-oriented programming.

I studied:
- constructors
- encapsulation
- getter and setter methods

I learned that constructors can initialize objects when they are created.  
I also learned how `private` can protect fields from direct access, and how getters and setters provide a proper way to read and modify data.

Then I practiced by creating classes with private fields, constructors, and validation in setter methods.

## Day 5 - Java OOP Practice

Today I practiced Java object-oriented programming by completing three small exercises.

I created:
- a student score class with an average score method
- a contact class with private fields and getter/setter methods
- a library book class with borrowing and returning status changes

Through these exercises, I became more familiar with constructors, encapsulation, return values, and object behavior.

## Day 6 - Java Inheritance and Polymorphism

Today I learned the core ideas of inheritance and polymorphism in Java.

I studied:
- `extends`
- method overriding
- `super`
- multi-level inheritance
- access modifiers in inheritance (`private`, `protected`, `public`)
- polymorphism with parent references

I practiced by creating `Vehicle`, `Car`, and `Bike` classes.  
Through this exercise, I understood how subclasses inherit from a parent class, how overridden methods work, and how different objects can show different behaviors through polymorphism.

## Day 7 - Abstract Classes, Interfaces, and Practice

Today I learned the basics of abstract classes and interfaces in Java.

I studied:
- abstract classes
- abstract methods
- interfaces
- `implements`
- when to use inheritance and when to use interfaces

I learned that an abstract class can provide common fields and methods, while also forcing subclasses to implement specific behaviors.  
I also learned that an interface is used to define a common ability or standard, such as payment or login.

Then I practiced by designing:
- a student and teacher class based on inheritance
- a payment simulation based on interfaces

Through these exercises, I became more familiar with abstraction, polymorphism, and Java object-oriented design.

## Day 8 - Java Collections Basics

Today I learned the basics of Java collections.

### What I learned
- `ArrayList` for storing ordered elements
- `HashMap` for storing key-value pairs
- Common methods like `add()`, `get()`, `set()`, `remove()`, `size()`, and `put()`
- Different ways to traverse collections:
    - `for` loop
    - enhanced `for` loop
    - `keySet()` for `HashMap`

### My understanding
- `ArrayList` is like a flexible array
- `HashMap` is useful when I want to find a value by a key
- Collections are more practical than arrays in many real programs

### Practice
- Created simple `ArrayList` examples
- Created a `HashMap` to store student scores
- Practiced traversal of both collections

## Day 9 - Java Exception Handling

Today I learned the basics of Java exception handling.

I studied:
- `try-catch` for catching and handling exceptions
- `throws` for declaring that a method may cause an exception
- `throw` for manually throwing an exception
- `finally` for code that runs at the end whether an exception happens or not

I also learned some common exceptions, such as:
- `ArithmeticException`
- `ArrayIndexOutOfBoundsException`
- `NullPointerException`
- `NumberFormatException`
- `IllegalArgumentException`

In practice, I wrote simple programs to:
- catch runtime errors
- use `finally` to finish cleanup work
- manually throw an exception when input is out of range

This helped me understand how to make Java programs safer and more robust when errors happen.