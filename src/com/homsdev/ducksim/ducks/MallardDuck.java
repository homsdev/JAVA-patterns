package com.homsdev.ducksim.ducks;

import com.homsdev.ducksim.ducks.behaviour.FlyWithWings;
import com.homsdev.ducksim.ducks.behaviour.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display(){
        System.out.println("Looks like a mallard");
    }
}
