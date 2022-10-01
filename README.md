
### Author: Zachary Stewart

### Description: Program is intended to try and explain different aspects of Objects

---

## Useful Resources:
 - [Structure Of A Java Program(javapoint)](https://www.javatpoint.com/structure-of-java-program)
 - [Methods In Java (javapoint)](https://www.javatpoint.com/method-in-java)
 - [Java Data Types (javapoint)](https://www.javatpoint.com/java-data-types)
 - [Difference Between Objects and Classes (javapoint)](https://www.javatpoint.com/difference-between-object-and-class)

## Definitions:
 - application/package/project - refers to a folder containing a program in Java for example: 'ObjectsExplained' would be this program's application. Different languages used differing terms for this, in this case, the official name is 'package'

# Notes:
- ### Access Specifier/Modifier: Java Classes and methods start with something called an 'Access Specifier/Modifier'
   Information collected from: https://www.javatpoint.com/method-in-java
     It determines the visibility of the method.
     There are 4 different Access Specifiers: Public, Private, Protected, and Default
        - **Public:** allows a class or method to be accessed by any class, even those that are not in the application/package
        - **Private:** class or method can only be accessed in the file/class that it is defined (this is a security feature that allows you to hide data from other classes/methods/users)
        - **Protected:** class or method can only be accessed within the same application/package or a subclass in a different package/application (this is meant as a less restrictive form of security then 'private', it however is ineffective as someone can easily just instantiate a class in your package and call the 'protected' data. As such, it is not recommended to be used for security)
        - **Default:** as you can guess, this is the value given when an access specifier is not given. Classes or methods with 'default' access modifiers are only accessable within the same application/package
 
- ### Return Type: The data type that the method returns. You can also view it as the data type that is given to the 'return' in a method
   Valid data types include: primitive data types, objects, collections, arrays, void, etc.
   If nothing is returned, use the keyword: void.
   Information collected from: https://www.javatpoint.com/method-in-java

---

## To Run: javac ObjectsExplainedTest.java && java ObjectsExplainedTest
