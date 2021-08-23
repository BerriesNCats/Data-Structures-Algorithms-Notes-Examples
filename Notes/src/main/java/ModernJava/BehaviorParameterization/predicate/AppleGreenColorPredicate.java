package ModernJava.BehaviorParameterization.predicate;

import ModernJava.BehaviorParameterization.model.Apple;

/**
 * Selects only green apples
 */
public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return Apple.Color.GREEN.equals(apple.getColor());
    }
}
