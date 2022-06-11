package com.homsdev.strategyPattern.ducks;

import com.homsdev.strategyPattern.ducks.behaviour.CantFly;
import com.homsdev.strategyPattern.ducks.behaviour.Squak;

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
