package EffectiveJava.Singleton;

/**
 * A singleton is a class that is instantiated exactly once.
 */
public class SingletonPrivateConstructor {

    public static final SingletonPrivateConstructor INSTANCE = new SingletonPrivateConstructor();

    public String name = "Elvis";

    private SingletonPrivateConstructor() {
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        System.out.println(SingletonPrivateConstructor.INSTANCE.getName());
    }



}
