package com.homsdev.ducksim.ducks;

import com.homsdev.ducksim.ducks.behaviour.CantFly;
import com.homsdev.ducksim.ducks.behaviour.Squak;

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
