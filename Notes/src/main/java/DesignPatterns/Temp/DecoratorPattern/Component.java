package DesignPatterns.Temp.DecoratorPattern;

/**
 * This is the object we don't want to modify and want to add additional behavior to.
 */
public abstract class Component {

    public abstract void doJob();

}

class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println("I am the object we want to decorate but I am closed for modification");
    }
}
