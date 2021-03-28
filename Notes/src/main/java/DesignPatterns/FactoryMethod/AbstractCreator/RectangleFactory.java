package DesignPatterns.FactoryMethod.AbstractCreator;

public class RectangleFactory extends AbstractShapeFactory{

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
