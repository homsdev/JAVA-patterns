package com.homsdev.strategyPattern.ducks;

import com.homsdev.strategyPattern.ducks.behaviour.FlyWithWings;
import com.homsdev.strategyPattern.ducks.behaviour.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println("looks like a redhead");

    }
}
