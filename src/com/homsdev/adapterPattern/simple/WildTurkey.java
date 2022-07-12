package com.homsdev.adapterPattern.simple;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I´m flying a short distance");
    }
}
