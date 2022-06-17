package com.homsdev.decoratorPattern.decorator;

import com.homsdev.decoratorPattern.concreteComponents.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Whip";
    }
}
