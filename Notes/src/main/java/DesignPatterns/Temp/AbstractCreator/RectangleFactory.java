package DesignPatterns.Temp.AbstractCreator;

public class RectangleFactory extends AbstractShapeFactory{

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
