package DesignPatterns.FactoryMethod.AbstractCreator;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("This is the draw method coming from Square.");
    }
}
