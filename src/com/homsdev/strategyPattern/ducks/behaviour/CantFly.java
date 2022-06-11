package com.homsdev.strategyPattern.ducks.behaviour;

public class CantFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("This can not fly");
    }
}
