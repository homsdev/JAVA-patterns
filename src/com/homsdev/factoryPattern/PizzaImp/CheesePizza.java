package com.homsdev.factoryPattern.PizzaImp;

import com.homsdev.factoryPattern.pizza.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public String prepare() {
        return String.format("Prepared %s", this.getClass().getSimpleName());
    }
}
