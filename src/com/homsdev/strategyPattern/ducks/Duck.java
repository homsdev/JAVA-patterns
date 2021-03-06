package com.homsdev.strategyPattern.ducks;

import com.homsdev.strategyPattern.ducks.behaviour.FlyBehaviour;
import com.homsdev.strategyPattern.ducks.behaviour.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void swim(){
        System.out.println("Floating");
    }

    public abstract void display();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    //Other dick methods
    public void perfomQuack(){
        quackBehaviour.quack();
    }

    public  void perfomFly(){
        flyBehaviour.fly();
    }
}
