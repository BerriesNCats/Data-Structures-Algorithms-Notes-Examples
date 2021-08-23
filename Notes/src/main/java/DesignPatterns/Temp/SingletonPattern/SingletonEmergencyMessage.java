package DesignPatterns.Temp.SingletonPattern;

/**
 * The Singleton is a design pattern that allows you to have one single instance of an object.
 * It's constructor is set to private so no other class can instantiate a new instance.
 * The unique instance is accessed through a get method. You can use 'Lazy Construction' on the
 * Singleton if memory space is a concern that will only create the single instance of the
 * Singleton when and if it is called.
 */

public class SingletonEmergencyMessage {

    private static SingletonEmergencyMessage uniqueInstance;

    private SingletonEmergencyMessage(){}

    public static synchronized SingletonEmergencyMessage getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonEmergencyMessage();
        }
        return uniqueInstance;
    }

    public void emergencyMessge() {
        System.out.println("I'm an emergency message. The only person that can call me is the" +
                " unique instance of an object of the SingletonEmergencyMessage Class.");
    }
}
