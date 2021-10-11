package com.homsdev.ducks;

import com.homsdev.ducks.behaviour.CantFly;
import com.homsdev.ducks.behaviour.FlyBehaviour;
import com.homsdev.ducks.behaviour.Squak;

public class RubbishDuck extends Duck{

    public RubbishDuck() {
        flyBehaviour = new CantFly();
        quackBehaviour = new Squak();
    }

    @Override
    public void display() {
        System.out.println("looks like rubbish");
    }

}
