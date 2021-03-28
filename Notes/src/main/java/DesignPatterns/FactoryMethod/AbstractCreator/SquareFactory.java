package DesignPatterns.FactoryMethod.AbstractCreator;

public class SquareFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
