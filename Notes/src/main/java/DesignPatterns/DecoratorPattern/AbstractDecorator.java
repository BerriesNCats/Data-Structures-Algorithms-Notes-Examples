package DesignPatterns.DecoratorPattern;

public abstract class AbstractDecorator extends Component{

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }
}

class ConcreteDecorator extends AbstractDecorator {

    @Override
    public void doJob() {
        super.doJob();
        // Add additional responsibilities while maintaining existing responsibilities by making the call to super first.
        System.out.println("I am the decorator and can add additional functionality dynamically");
    }
}
