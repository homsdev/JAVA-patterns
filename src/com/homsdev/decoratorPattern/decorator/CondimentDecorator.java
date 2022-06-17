package com.homsdev.decoratorPattern.decorator;

import com.homsdev.decoratorPattern.concreteComponents.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
