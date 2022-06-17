package com.homsdev.factoryPattern;

import com.homsdev.factoryPattern.Stores.ChicagoPizzaStore;
import com.homsdev.factoryPattern.Stores.NYPizzaStore;
import com.homsdev.factoryPattern.factory.PizzaStore;

public class TestFactoryPattern {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("Cheese");

        store = new ChicagoPizzaStore();
        store.orderPizza("Cheese");
    }
}
