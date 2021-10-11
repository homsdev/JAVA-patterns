package com.homsdev.ducks;

import com.homsdev.ducks.Duck;
import com.homsdev.ducks.behaviour.FlyBehaviour;
import com.homsdev.ducks.behaviour.FlyWithWings;
import com.homsdev.ducks.behaviour.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println("looks like a redhead");

    }
}
