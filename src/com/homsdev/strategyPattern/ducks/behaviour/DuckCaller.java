package com.homsdev.strategyPattern.ducks.behaviour;

public class DuckCaller implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<<Using duck caller>>");
    }
}
