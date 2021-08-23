package ModernJava.BehaviorParameterization.formatter;

import ModernJava.BehaviorParameterization.model.Apple;

import java.util.List;

public class PrintApples {

    public static void printApples(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple: inventory) {
            String output = formatter.format(apple);
            System.out.println(output);
        }

    }
}
