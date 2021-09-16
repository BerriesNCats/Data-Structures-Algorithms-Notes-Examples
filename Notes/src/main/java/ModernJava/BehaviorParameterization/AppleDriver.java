package ModernJava.BehaviorParameterization;

import ModernJava.BehaviorParameterization.formatter.AppleFancyFormatter;
import ModernJava.BehaviorParameterization.formatter.AppleSimpleFormatter;
import ModernJava.BehaviorParameterization.predicate.FilteringApples;
import ModernJava.BehaviorParameterization.model.Apple;
import ModernJava.BehaviorParameterization.model.Apple.Color;
import ModernJava.BehaviorParameterization.predicate.AppleGreenColorPredicate;

import java.util.Arrays;
import java.util.List;

import static ModernJava.BehaviorParameterization.formatter.PrintApples.printApples;
import static ModernJava.BehaviorParameterization.predicate.FilteringApples.filterApples;
import static ModernJava.BehaviorParameterization.predicate.FilteringApples.filterApplesByColor;

public class AppleDriver {

  public static void main(String... args) {
    List<Apple> inventory =
        Arrays.asList(
            new Apple(80, Color.GREEN), new Apple(155, Color.GREEN), new Apple(120, Color.RED));

    // Print the apples in Inventory using the FancyFormatter
    printApples(inventory, new AppleFancyFormatter());

    printApples(inventory, new AppleSimpleFormatter());

    List<Apple> greenApples4 = filterApples(inventory, new AppleGreenColorPredicate());
    System.out.println(greenApples4);

    // Filter apples in inventory using the predicate method isGreenApple that takes in an Apple
    // through the
    // filterApples method that takes in a List<Apple> (inventory) and a Predicate<Apple>
    // (isGreenApple)
    List<Apple> greenApples = filterApples(inventory, FilteringApples::isGreenApple);
    System.out.println(greenApples);

    // Using filter apples we can also directly pass the predicate
    List<Apple> greenApples2 =
        filterApples(inventory, (Apple apple) -> Color.GREEN.equals(apple.getColor()));
    System.out.println(greenApples2);

    List<Apple> greenApples3 = filterApplesByColor(inventory, Color.GREEN);
    List<Apple> redApples = filterApplesByColor(inventory, Color.RED);
    System.out.println(greenApples3);
    System.out.println(redApples);

    // [Apple{color='green', weight=155}]
    // Filter apples in inventory using the predicate method isHeavyApple
    List<Apple> heavyApples = filterApples(inventory, FilteringApples::isHeavyApple);
    System.out.println(heavyApples);

    // [Apple{color='green', weight=155}]
    // Filter apples in inventory if they weigh more than 150
    List<Apple> heavyApples2 = filterApples(inventory, (Apple apple) -> apple.getWeight() > 150);
    System.out.println(heavyApples2);

    // []
    // Filter apples in inventory if they weigh less than 80 or are brown
    List<Apple> weirdApples =
        filterApples(
            inventory,
            (Apple apple) -> apple.getWeight() < 80 || Color.BROWN.equals(apple.getColor()));
    System.out.println(weirdApples);
  }
}
