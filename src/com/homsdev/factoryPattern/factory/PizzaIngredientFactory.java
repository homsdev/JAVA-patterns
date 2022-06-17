package com.homsdev.factoryPattern.factory;

import com.homsdev.factoryPattern.ingredients.*;
//Abstract Factory
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClams();
}
