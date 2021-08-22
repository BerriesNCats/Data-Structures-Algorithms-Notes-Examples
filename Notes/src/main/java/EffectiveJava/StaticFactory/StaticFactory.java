package EffectiveJava.StaticFactory;

/**
 * Consider static factory methods instead of constructors
 *
 * Advantages
 *      - Unlike constructors, static factory methods have names
 *      - They are not required to create a new object each time they are invoked
 *      - They can return an object of any subtype of their return type
 *      - They reduce verbosity of creating parameterized type instances
 *
 * Disadvantages
 *      - Classes without public or protected constructors cannot be subclassed
 *      - They are not readily distinguishable from other static methods
 *
 * Naming Conventions
 *      - valueOf
 *      - of
 *      - getInstance
 *      - newInstance
 *      - getType
 *      - newType
 */
public class StaticFactory {
}
