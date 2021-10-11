package com.homsdev.ducksim.ducks;

import com.homsdev.ducksim.ducks.behaviour.FlyWithWings;
import com.homsdev.ducksim.ducks.behaviour.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println("looks like a redhead");

    }
}
