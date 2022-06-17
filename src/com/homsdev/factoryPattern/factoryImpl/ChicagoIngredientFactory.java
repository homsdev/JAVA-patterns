package com.homsdev.factoryPattern.factoryImpl;

import com.homsdev.factoryPattern.factory.PizzaIngredientFactory;
import com.homsdev.factoryPattern.ingredients.Cheese;
import com.homsdev.factoryPattern.ingredients.Clams;
import com.homsdev.factoryPattern.ingredients.Dough;
import com.homsdev.factoryPattern.ingredients.Sauce;
import com.homsdev.factoryPattern.ingredientsImpl.FreshClams;
import com.homsdev.factoryPattern.ingredientsImpl.ParmesanMozzarella;
import com.homsdev.factoryPattern.ingredientsImpl.PlumTomatoSauce;
import com.homsdev.factoryPattern.ingredientsImpl.ThinCrustDough;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ParmesanMozzarella();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
