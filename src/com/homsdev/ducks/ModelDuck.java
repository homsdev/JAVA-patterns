package com.homsdev.ducks;

import com.homsdev.ducks.behaviour.CantFly;
import com.homsdev.ducks.behaviour.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new CantFly();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("looks like a model duck");
    }
}
