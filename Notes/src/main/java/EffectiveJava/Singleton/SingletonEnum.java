package EffectiveJava.Singleton;

public enum SingletonEnum {
    ELVIS_INSTANCE;

    String name = "Elvis";

    public String getName() {
        return this.name;
    }
}

class Driver {
    public static void main(String[] args) {
        System.out.println(SingletonEnum.ELVIS_INSTANCE.getName());
    }
}
