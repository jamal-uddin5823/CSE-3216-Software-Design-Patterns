package org.example.decorator.basic;

public class ConcreteDecorator2 extends Decorator {
    AbstractComponent component;

    public ConcreteDecorator2(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void methodA() {
        component.methodA();
        System.out.println("ConcreteDecorator2 methodA");
    }

    @Override
    public void methodB() {
        component.methodB();
        System.out.println("ConcreteDecorator2 methodB");

    }
}
