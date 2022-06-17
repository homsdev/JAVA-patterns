package com.homsdev.factoryPattern.factory;

import com.homsdev.factoryPattern.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = pizzaFactory(type);
        System.out.println(pizza.prepare());
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza pizzaFactory(String type);//Factory Method
}
