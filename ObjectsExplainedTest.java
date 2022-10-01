/* 
 * Author: Zachary Stewart
 * 
 * Description: Program is intended to try and explain different aspects of Objects
 * 
 * Useful Resources:
 *  https://www.javatpoint.com/structure-of-java-program
 *  https://www.javatpoint.com/method-in-java
 *  https://www.javatpoint.com/java-data-types
 *  https://www.javatpoint.com/difference-between-object-and-class
 * 
 * Definitions:
 *  application/package/project - refers to a folder containing a program in Java for example: 'ObjectsExplained' would
 *    be this program's application. Different languages used differing terms for this, in this case, the official name
 *    is 'package'
 * 
 * Notes:
 * Access Specifier/Modifier: Java Classes and methods start with something called an 'Access Specifier/Modifier'
 *    Information collected from: https://www.javatpoint.com/method-in-java
 *      It determines the visibility of the method.
 *      There are 4 different Access Specifiers: Public, Private, Protected, and Default
 *      Public: allows a class or method to be accessed by any class, even those that are not in the application/package
 *      Private: class or method can only be accessed in the file/class that it is defined (this is a security feature 
 *        that allows you to hide data from other classes/methods/users)
 *      Protected: class or method can only be accessed within the same application/package or a subclass in a different 
 *        package/application (this is meant as a less restrictive form of security then 'private', it however is ineffective
 *        as someone can easily just instantiate a class in your package and call the 'protected' data. As such,
 *        it is not recommended to be used for security)
 *      Default: as you can guess, this is the value given when an access specifier is not given.
 *        classes or methods with 'default' access modifiers are only accessable within the same application/package
 *  
 * Return Type: The data type that the method returns. You can also view it as the data type that is given to the 'return' in a method
 *    It may have a primitive data type, object, collection, arrays, void, etc. 
 *    If nothing is returned, use the keyword: void.
 *    Information collected from: https://www.javatpoint.com/method-in-java
 * 
 * To Run: javac ObjectsExplainedTest.java && java ObjectsExplainedTest
*/

/*
 * class - the term 'class' is used to identify an object in Java
 * technically, a 'class' is not an object, it is the blue print for the object. An object is an instantiated class
 * there are a few other differences as can be seen here: (https://www.javatpoint.com/difference-between-object-and-class)
 */
public class ObjectsExplainedTest {
  /*
   * the main method shows up only 1 time per application, and is what Java looks for as the first line of code to execute
   * 
   * Looking at the 'main' method:
   * public - an 'Access Specifier/Modifier'
   * static - this means that only a single copy of 'main' gets created and is then shared between all instances of a
   *    class. In this case the class is 'ObjectsExplainedTest'
   * void - a 'Return Type', in this case 'void' meaning that 'main' will return nothing when called.
   * main - execution of a Java program starts here. There can only be 1 'main' method per application.
   * String[] args - an argument declaration, saying that 'main' is expecting. 
   */
  public static void main(String[] args) {
    System.out.println("test program");
  } // method main
} // class ObjectsExplainedTest
