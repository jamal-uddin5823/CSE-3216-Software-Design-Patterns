package org.example.decorator.basic;

public class ConcreteDecorator1 extends Decorator {
    AbstractComponent component;

    public ConcreteDecorator1(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void methodA() {
        component.methodA();
        System.out.println("ConcreteDecorator1 MethodA");
    }

    @Override
    public void methodB() {
        component.methodB();
        System.out.println("ConcreteDecorator1 MethodB");
    }
}
