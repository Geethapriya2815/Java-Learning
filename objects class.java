 **Java Methods and Objects**
In Java, **methods** and **objects** are fundamental concepts of **object-oriented programming (OOP)**. Let’s break them down:

---

 **1. Java Methods**
A **method** in Java is a block of code that performs a specific task. Methods allow code reusability and modularity.

 **Types of Methods:**
1. **Predefined Methods (Built-in Methods)**  
   - Example: `System.out.println()`, `Math.sqrt()`
   
2. **User-Defined Methods**  
   - Methods created by programmers to perform custom tasks.

 **Syntax of a Method:**
```java
returnType methodName(parameters) {
    // Method body
    return value; // Optional, required if return type is not void
}
```

 **Example of a Method:**
```java
class Example {
    // Method with parameters and return type
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Example obj = new Example(); // Creating an object
        int result = obj.add(5, 10); // Calling method
        System.out.println("Sum: " + result);
    }
}
```
 **Key Points:**
- `add()` is a method that takes two integers and returns their sum.
- The `main` method creates an **object** and calls `add()`.

---

## **2. Java Objects**
An **object** is an instance of a class. It represents **real-world entities** with **state (attributes)** and **behavior (methods).**

### **Creating an Object**
Objects are created using the `new` keyword.

```java
ClassName objectName = new ClassName();
```

### **Example of a Class with an Object**
```java
class Car {
    // Attributes (Instance Variables)
    String brand;
    int speed;

    // Method to display car details
    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }

    public static void main(String[] args) {
        Car myCar = new Car();  // Creating an object
        myCar.brand = "Toyota"; // Assigning values
        myCar.speed = 120;

        myCar.display(); // Calling method
    }
}
```

#### **Key Points:**
- `Car` is a **class** with attributes `brand` and `speed`.
- `myCar` is an **object** of `Car`.
- The `display()` method prints object details.

---

## **3. Method Invocation in Java**
There are **two types** of methods in Java:

### **A. Instance Methods (Non-Static)**
- Need an object to call the method.
- Example:
  ```java
  obj.methodName();
  ```

### **B. Static Methods**
- Can be called without creating an object.
- Example:
  ```java
  ClassName.methodName();
  ```
- Example:
  ```java
  class MathUtils {
      static int square(int x) {
          return x * x;
      }

      public static void main(String[] args) {
          System.out.println(MathUtils.square(4)); // Calling without object
      }
  }
  ```

---

## **4. Method Overloading**
Same method name with **different parameters**.
```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5, 10));      // Calls int method
        System.out.println(obj.add(5.5, 2.3));  // Calls double method
    }
}
```

---

 **Conclusion**
- **Methods** define behaviors and allow code reuse.
- **Objects** store data and interact with methods.
- Methods can be **static** (class-level) or **instance methods** (object-specific).
- **Method Overloading** allows multiple methods with the same name but different parameters.
