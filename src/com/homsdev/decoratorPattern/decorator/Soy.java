package com.homsdev.decoratorPattern.decorator;

import com.homsdev.decoratorPattern.concreteComponents.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (beverage.getSize() == Size.TALL) return beverage.cost() + .10;
        if (beverage.getSize() == Size.GRANDE) return beverage.cost() + .15;
        if (beverage.getSize() == Size.VENTI) return beverage.cost() + .20;
        else return 0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Soy";
    }
}
