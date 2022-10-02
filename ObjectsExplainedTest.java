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
 *  https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/
 * 
 * Definitions:
 *  application/package/project - refers to a folder containing a program in Java for example: 'ObjectsExplained' would
 *    be this program's application. Different languages used differing terms for this, in this case, the official name
 *    is 'package'
 * 
 * Notes:
 *  Access Specifier/Modifier: Java Classes and methods start with something called an 'Access Specifier/Modifier'
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
 *  Return Type: The data type that the method returns. You can also view it as the data type that is given to the 'return' in a method
 *    It may have a primitive data type, object, collection, arrays, void, etc. 
 *    If nothing is returned, use the keyword: void.
 *    Information collected from: https://www.javatpoint.com/method-in-java
 * 
 *  Objects:
 *    There are 3 main types of objects in Java: class, interface, abstract
 *      1) Class: the standard object you see in programming
 *      2) Interface:
 *      3) Abstract:
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
   * main - Method name, execution of a Java program starts here. There can only be 1 'main' method per application.
   * String[] args - an argument declaration, saying what 'main' is expecting. In this case, it is expecting an array of
   *    Strings and is naming it 'args'. 'args' is provided when you run call the program in the terminal.
   *    For example: javac ObjectsExplainedTest.java && java ObjectsExplainedTest "this is where 'args' gets its arguments"
   *    this allows the executing user to provide information on program execution rather than having the program prompt
   *    the users for the information.
   */
  public static void main(String[] args) {
    /* Tests to make sure program runs */
    // System.out.println("test program");
    /* Tests 'args' */
    // System.out.println(args[0]);

    /* 
     * To demonstrate the need for Objects and how they are used, let us make a Zoo that holds multiple exotic creatures
     *  each creature which is able to preform activities like, walk around, eat, drink, act board
     * If we were to try to represent an animal like this with out objects it would end up looking something like this:
     */

    String creature_species = "Giant Moon Eating Lobster-Cat";
    String creature_name = "Rudof The Clipper Of Nails";
    int creature_age = 13;
    String creature_color = "#397889";
    float creature_speed = 45.783f;
    int creature_arms = 4;
    int creature_legs = 3;
    String creature_environment = "amphibious";
    float creature_location_x = 257;
    float creature_location_y = 388;

    System.out.printf("creature_species = %s\ncreature_name = %s\ncreature_age = %d\ncreature_color = %s\ncreature_speed = %f\ncreature_arms = %d\ncreature_legs = %d\ncreature_environment = %s\ncreature_location_x = %f\ncreature_location_y = %f", creature_species, creature_name, creature_age, creature_color, creature_speed, creature_arms, creature_legs, creature_environment, creature_location_x, creature_location_y);

    /* Now we have a creature that we have made and it has various attributes and we can now modify it in various ways for example: */
    // creature_location_x += creature_speed;

  } // method main
} // class ObjectsExplainedTest
