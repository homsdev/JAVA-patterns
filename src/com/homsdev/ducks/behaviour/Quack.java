package com.homsdev.ducks.behaviour;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Ducks quacking sounds");
    }
}
