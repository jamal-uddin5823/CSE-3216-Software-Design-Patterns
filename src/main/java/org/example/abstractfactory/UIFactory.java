package org.example.abstractfactory;

public interface UIFactory {
    public AlertInterface createAlert();
    public ButtonInterface createButton();
}
