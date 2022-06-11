package com.homsdev.strategyPattern.ducks;

import com.homsdev.strategyPattern.ducks.behaviour.DuckCaller;
import com.homsdev.strategyPattern.ducks.behaviour.QuackBehaviour;

public class Hunter {

    QuackBehaviour quackBehaviour = new DuckCaller();

    public void useDuckCall(){
            quackBehaviour.quack();
    }
}
