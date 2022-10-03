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
    /* Reads the first string in 'args' */
    // System.out.println(args[0]);

    /*
     * To demonstrate the need for Objects and how they are used, let us make a Zoo that holds multiple exotic creatures
     *  each creature which is able to preform activities like, walk around, eat, drink, act board
     * If we were to try to represent an animal like this without objects, it would end up looking something like this:
     */

    /* As this data applies to the creature we can call these variables the creature's "attributes" */
    /* attributes */
    public static String creature_species = "Giant Moon Eating Lobster-Cat";
    public static String creature_name = "Rudof The Clipper Of Nails";
    public static int creature_age = 13;
    public static String creature_color = "#397889";
    public static float creature_speed = 45.783f;
    public static int creature_arms = 4;
    public static int creature_legs = 3;
    public static String creature_environment = "amphibious";
    public static String creature_movement_method = "legs";
    public static float creature_location_x = 257;
    public static float creature_location_y = 388;
    /* attributes */


    /* Let's look at how we might view or modify the creature's data */

    /* We could view single pieces of data as we normally would with this: */
    System.out.println(creature_location_x);
    /* We could change a single piece of data as we normally would with this: */
    creature_location_x += 5;
    System.out.println(creature_location_x);

    /* We can view the variable data by doing this: */
    System.out.printf("creature_species = %s\ncreature_name = %s\ncreature_age = %d\ncreature_color = %s\ncreature_speed = %f\ncreature_arms = %d\ncreature_legs = %d\ncreature_environment = %s\ncreature_location_x = %f\ncreature_location_y = %f", creature_species, creature_name, creature_age, creature_color, creature_speed, creature_arms, creature_legs, creature_environment, creature_location_x, creature_location_y);
    /*
    * Once again, this works fine if we are dealing with a single creature, but once there are more then 1 we will end
    * up duplicating a lot of code. And there's the catch, 'dublicating code', whenever this happens, it means that we
    * should use a function/method in order to reduce the amount of code that is duplicated.
    */

    /*
     * When we look at what each method will do, we can generalize them into 2 main types,
     * methods that get data about the creature
     * methods that set creature data
     *
     * So we will name them as such, Getters and Setters
     */


    System.out.println(getCreatureLocationX());



    /*
    * This works fine if we have 1 creature, but what happens if there are multiple creatures? We could take on a naming
    * scheme that goes: [species]_[attribute]
    * but what happens if there are multiples of that species? We could try something like: [species]_[attribute]_[name]
    * As you can see, in order to handle multiple attribute sets, we have to make the names of the set increasingly more
    * specific and it doesn't account for what would happen if there are 2 sets that contain identical information.
    * Lastly, there is no way to itterativly declare a variable
    */


    /* Now we have a creature that we have made and it has various attributes and we can now modify it in various ways for example: */
    // creature_location_x += creature_speed;

  } // method main
  static float getCreatureLocationX(){
    return creature_location_x;
  }
} // class ObjectsExplainedTest
