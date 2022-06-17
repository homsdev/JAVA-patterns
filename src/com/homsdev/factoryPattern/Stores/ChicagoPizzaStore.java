package com.homsdev.factoryPattern.Stores;

import com.homsdev.factoryPattern.PizzaImp.NYCheesePizza;
import com.homsdev.factoryPattern.factory.PizzaIngredientFactory;
import com.homsdev.factoryPattern.factory.PizzaStore;
import com.homsdev.factoryPattern.factoryImpl.ChicagoIngredientFactory;
import com.homsdev.factoryPattern.factoryImpl.NYPizzaIngredientFactory;
import com.homsdev.factoryPattern.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza pizzaFactory(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if (item.equals("Cheese")) pizza = new NYCheesePizza(ingredientFactory);
        return pizza;
    }
}
