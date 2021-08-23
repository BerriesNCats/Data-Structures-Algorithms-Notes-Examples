/*
 * Copyright David Amateau 2021.
 */

package ModernJava.BehaviorParameterization.predicate;

import ModernJava.BehaviorParameterization.model.Apple;
import ModernJava.BehaviorParameterization.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class FilteringApples {

    // Filter Apples by Strategy/Predicate
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) result.add(apple);
        }
        return result;
    }

//    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (p.test(apple)) result.add(apple);
//        }
//        return result;
//    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Apple.Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getColor().equals(color)) result.add(apple);
        }
        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getWeight() > weight) result.add(apple);
        }
        return result;
    }


    public static boolean isGreenApple(Apple apple) {
        return Apple.Color.GREEN.equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }


}
