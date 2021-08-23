package ModernJava.BehaviorParameterization.predicate;

import ModernJava.BehaviorParameterization.model.Apple;

/**
 * Apple Predicate encapsulates a strategy for selecting an apple
 */
public interface ApplePredicate {
    boolean test(Apple apple);
}
