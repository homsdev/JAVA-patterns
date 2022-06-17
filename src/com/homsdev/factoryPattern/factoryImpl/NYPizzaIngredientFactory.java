package com.homsdev.factoryPattern.factoryImpl;

import com.homsdev.factoryPattern.factory.PizzaIngredientFactory;
import com.homsdev.factoryPattern.ingredients.*;
import com.homsdev.factoryPattern.ingredientsImpl.FreshClams;
import com.homsdev.factoryPattern.ingredientsImpl.MarinaraSauce;
import com.homsdev.factoryPattern.ingredientsImpl.ReggianoCheese;
import com.homsdev.factoryPattern.ingredientsImpl.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
