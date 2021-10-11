package com.homsdev.ducks;

import com.homsdev.ducks.Duck;
import com.homsdev.ducks.behaviour.FlyBehaviour;
import com.homsdev.ducks.behaviour.FlyWithWings;
import com.homsdev.ducks.behaviour.Quack;

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
