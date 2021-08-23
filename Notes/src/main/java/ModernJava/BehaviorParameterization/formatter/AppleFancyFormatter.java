package ModernJava.BehaviorParameterization.formatter;

import ModernJava.BehaviorParameterization.model.Apple;

import java.util.Locale;

public class AppleFancyFormatter implements AppleFormatter {

    @Override
    public String format(Apple apple) {
        String weight = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + weight + " " + apple.getColor().toString().toLowerCase(Locale.ROOT) + " apple.";
    }
}
