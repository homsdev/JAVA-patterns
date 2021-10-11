package com.homsdev;

import com.homsdev.ducks.behaviour.DuckCaller;
import com.homsdev.ducks.behaviour.FlyBehaviour;
import com.homsdev.ducks.behaviour.QuackBehaviour;

public class Hunter {

    QuackBehaviour quackBehaviour = new DuckCaller();

    public void useDuckCall(){
            quackBehaviour.quack();
    }
}
