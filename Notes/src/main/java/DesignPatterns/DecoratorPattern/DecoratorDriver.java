package DesignPatterns.DecoratorPattern;


/**
 * The Decorator pattern is used to add functionality to an existing class without disturbing the original base class.
 * It provides an alternate to subclassing for extending the behavior of an object dynamically.
 * The Decorator pattern creates a set of decorator classes that are used to wrap concrete components.
 */
public class DecoratorDriver {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecorator concreteDecorator = new ConcreteDecorator();

        // Wrap the concrete component inside the concrete decorator to gain the functionality of the decorator while
        // maintaining the functionality of the the component.
        concreteDecorator.setComponent(concreteComponent);

        // I will call doJob in the concrete decorator which will also call the concrete components doJob but add more
        // functionality
        concreteDecorator.doJob();
    }
}
