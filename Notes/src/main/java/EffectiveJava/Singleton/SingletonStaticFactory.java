package EffectiveJava.Singleton;

public class SingletonStaticFactory {

    private static final SingletonStaticFactory INSTANCE = new SingletonStaticFactory();
    String name = "Elvis";

    private SingletonStaticFactory() {

    }

    public static SingletonStaticFactory getInstance() {
        return INSTANCE;
    }

    private Object readResolove() {
        return INSTANCE;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        System.out.println(SingletonStaticFactory.getInstance().getName());
    }
}
