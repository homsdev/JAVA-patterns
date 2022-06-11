package com.homsdev.strategyPattern.ducks.behaviour;

public class Squak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("squeak sounds");
    }
}
