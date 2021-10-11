package com.homsdev.ducksim.ducks.behaviour;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("using a rocket to fly");
    }
}
