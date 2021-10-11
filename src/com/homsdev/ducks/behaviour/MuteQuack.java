package com.homsdev.ducks.behaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("can´t quack");
    }
}
