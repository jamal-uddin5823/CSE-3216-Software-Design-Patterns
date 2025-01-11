package org.example.decorator.basic;

public class ConcreteComponent extends AbstractComponent {
    @Override
    public void methodA() {
        System.out.println("ConcreteComponent methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteComponent methodB");
    }
}
