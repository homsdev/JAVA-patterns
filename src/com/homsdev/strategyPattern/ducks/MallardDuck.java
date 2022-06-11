package com.homsdev.strategyPattern.ducks;

import com.homsdev.strategyPattern.ducks.behaviour.FlyWithWings;
import com.homsdev.strategyPattern.ducks.behaviour.Quack;

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
