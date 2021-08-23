package ModernJava.BehaviorParameterization.predicate;

import ModernJava.BehaviorParameterization.model.Apple;

/**
 * Selects only "heavy" apples
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
