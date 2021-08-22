package EffectiveJava.EdsonYanagaRevisited;

import java.util.function.Supplier;

/**
 * Instead of Template Methods use Functional Interfaces
 */
public class MyStrategyImplementation {

    private final Supplier<String> supplier;

    private MyStrategyImplementation(Supplier<String> supplier) {
        this.supplier = supplier;
    }

    public static MyStrategyImplementation of(Supplier<String> supplier) {
        return new MyStrategyImplementation(supplier);
    }

    public void doSomething() {
        System.out.println("a");
        System.out.println("a");
        System.out.println(supplier.get());
    }

    public static void main(String[] args) {
        MyStrategyImplementation.of(() -> "c").doSomething();
        System.out.println("-----------------");
        MyStrategyImplementation.of(() -> "d").doSomething();
    }

}
