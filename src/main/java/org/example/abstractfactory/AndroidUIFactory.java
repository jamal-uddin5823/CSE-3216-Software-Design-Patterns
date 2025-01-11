package org.example.abstractfactory;

public class AndroidUIFactory implements UIFactory {
    @Override
    public AlertInterface createAlert() {
        return new AndroidAlert();
    }

    @Override
    public ButtonInterface createButton() {
        return new AndroidButton();
    }
}
