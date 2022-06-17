package com.homsdev.factoryPattern.PizzaImp;

import com.homsdev.factoryPattern.factory.PizzaIngredientFactory;
import com.homsdev.factoryPattern.factoryImpl.NYPizzaIngredientFactory;
import com.homsdev.factoryPattern.pizza.Pizza;

public class NYCheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public String prepare() {
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
        sauce = pizzaIngredientFactory.createSauce();
        return String.format("1.-%s \n2.-%s \n3.-%s \n4.-%s", dough.toString(), cheese.toString(), clams.toString(), sauce.toString());
    }
}
