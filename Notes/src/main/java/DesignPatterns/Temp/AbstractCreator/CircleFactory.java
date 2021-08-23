package DesignPatterns.Temp.AbstractCreator;

public class CircleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
