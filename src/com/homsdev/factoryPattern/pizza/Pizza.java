package com.homsdev.factoryPattern.pizza;

import com.homsdev.factoryPattern.ingredients.Cheese;
import com.homsdev.factoryPattern.ingredients.Clams;
import com.homsdev.factoryPattern.ingredients.Dough;
import com.homsdev.factoryPattern.ingredients.Sauce;

public abstract class Pizza {

    private String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Clams clams;

    public abstract String prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slides");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
