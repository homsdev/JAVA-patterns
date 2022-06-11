package com.homsdev.strategyPattern.ducks.behaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("can´t quack");
    }
}
