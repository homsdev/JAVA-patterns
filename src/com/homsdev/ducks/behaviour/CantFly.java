package com.homsdev.ducks.behaviour;

import com.homsdev.ducks.behaviour.FlyBehaviour;

public class CantFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("This can not fly");
    }
}
