package com.homsdev.adapterPattern.simple;

public class TestSimpleAdapter {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says..");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe duck says...");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("\nThe turkey adapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
