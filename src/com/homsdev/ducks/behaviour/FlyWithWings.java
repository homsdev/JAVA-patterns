package com.homsdev.ducks.behaviour;

import com.homsdev.ducks.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
