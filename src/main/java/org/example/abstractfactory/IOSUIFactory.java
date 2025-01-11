package org.example.abstractfactory;

public class IOSUIFactory implements UIFactory{
    @Override
    public AlertInterface createAlert() {
        return new IOSAlert();
    }

    @Override
    public ButtonInterface createButton() {
        return new IOSButton();
    }
}
