package com.homsdev.ducksim.ducks;

import com.homsdev.ducksim.ducks.behaviour.CantFly;
import com.homsdev.ducksim.ducks.behaviour.Quack;

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
