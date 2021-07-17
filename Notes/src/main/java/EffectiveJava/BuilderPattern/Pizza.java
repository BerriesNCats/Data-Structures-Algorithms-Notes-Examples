package EffectiveJava.BuilderPattern;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {

        // Creates an empty set of Toppings
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add((Objects.requireNonNull(topping)));
            return self();
        }

        abstract Pizza build();
        protected abstract T self();

        @Override
        public String toString() {
            return "Builder{" +
                    "toppings=" + toppings +
                    '}';
        }
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
