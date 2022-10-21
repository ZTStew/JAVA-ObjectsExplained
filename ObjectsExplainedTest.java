/*
 * Author: Zachary Stewart
 *
 * Description: Program is intended to try and explain different aspects of Objects
 *
 * Program Requirements:
 * In order to help demonstrate the need for Objects and how they are used, make a Zoo that holds multiple exotic creatures
 * each creature which is able to preform activities like, walk around, eat, drink, act board, as well as tell you its stats
 * Considerations need to be made for cases where there are multiple different creatures, creatures of the same type and
 * creatures with similar or identical attributes.
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
    System.out.println(test_var);

    /*
     * Java is designed in a way that makes it so 1 file can contain 1 class.
     * Additionally, a method cannot be placed inside of another method. Because 'main' is a method, any methods we make
     * must be created outside 'main'
     */

    /*
     * To help demonstrate the need for Objects and how they are used, let us make a Zoo that holds multiple exotic creatures
     *  each creature which is able to preform activities like, walk around, eat, drink, act board
     * If we were to try to represent an animal like this without objects, it would end up looking something like this:
     */

    /* As this data applies to the creature we can call these variables the creature's "attributes" */
    /* attributes */
    String creature_species = "Giant Moon Eating Lobster-Cat";
    String creature_name = "Rudof The Clipper Of Nails";
    int creature_age = 13;
    String creature_color = "#397889";
    float creature_speed = 45.783f;
    int creature_arms = 4;
    int creature_legs = 3;
    String creature_environment = "amphibious";
    String creature_movement_method = "legs";
    float creature_location_x = 257;
    float creature_location_y = 388;
    /* attributes */

    /*
    * This works fine if we have 1 creature, but what happens if there are multiple creatures? We could take on a naming
    * scheme that goes: [species]_[attribute]
    * but what happens if there are multiples of that species? We could try something like: [species]_[attribute]_[name]
    * As you can see, in order to handle multiple attribute sets, we have to make the names of the set increasingly more
    * specific and it doesn't account for what would happen if there are 2 sets that contain identical information.
    * Lastly, there is no way to itterativly declare variables so we would be stuck hard coding every single creature we
    * add to the zoo.
    */

    /*
     * Before worrying about creating multiple creatures, let's look at the other requirement:
     * "each creature which is able to preform activities like, walk around, eat, drink, act board, as well as tell you its stats"
     */

    /* If we only want to see 1 piece of data, we could view it normally like this: */
    System.out.println(creature_location_x);
    /* We can also change a single piece of data as we normally would with this: */
    creature_location_x += creature_speed;
    System.out.println(creature_location_x);

    /* And we can view all the creature's data by doing this: */
    System.out.printf("creature_species = %s\ncreature_name = %s\ncreature_age = %d\ncreature_color = %s\ncreature_speed = %f\ncreature_arms = %d\ncreature_legs = %d\ncreature_environment = %s\ncreature_movement_method = %s\ncreature_location_x = %f\ncreature_location_y = %f", creature_species, creature_name, creature_age, creature_color, creature_speed, creature_arms, creature_legs, creature_environment, creature_movement_method, creature_location_x, creature_location_y);

   /*
    * This works fine if there is a single creature we are keeping track of, but once there are multiple, things
    * start falling appart rather quickly because of variable names and everything needing to be hard coded.
    * What's more, it took me several minutes to write up that, "print all the creature's data" line and if it were to
    * be used multiple times, you could see how that would get rather old rather quickly.
    *
    * Lucky for us, there is a way to cut down on duplicate code, functions/methods.
    * Unfortunately, a method cannot be created inside another method in Java and 'main' is a method.
    * We could define a method outside of the 'main' method, but then it will not be able to access the creature data
    * because of scope. We could then also move the data outside of 'main', but variables defined outside of main and
    * inside the class must be static meaning we are restricted in what we can do.
    *
    *
    * Looking at this problem, there are 3 main issues:
    * 1) variable naming when there are mutliple creatures
    * 2) defining variables somewhere accessable
    * 3) duplicated code that should be stored in a function/method
    */


    /*
     * There is thankfully a solution for all of these issues, objects.
     *
     */
    Giant_Moon_Eating_Lobster_Cat Creature1 = new Giant_Moon_Eating_Lobster_Cat();
  } // method main
} // class ObjectsExplainedTest

