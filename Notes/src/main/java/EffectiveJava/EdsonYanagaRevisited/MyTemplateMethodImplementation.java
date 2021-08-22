package EffectiveJava.EdsonYanagaRevisited;

public abstract class MyTemplateMethodImplementation {

    public void doSomething() {
        System.out.println("a");
        System.out.println("a");
        System.out.println(getString());
    }

    protected abstract String getString();

    public static void main(String[] args) {
        new OneTemplateImplementation().doSomething();
    }
}

class OneTemplateImplementation extends MyTemplateMethodImplementation {

    @Override
    protected String getString() {
        return "c";
    }
}