package com.homsdev.ducksim.ducks;

import com.homsdev.ducksim.ducks.behaviour.DuckCaller;
import com.homsdev.ducksim.ducks.behaviour.QuackBehaviour;

public class Hunter {

    QuackBehaviour quackBehaviour = new DuckCaller();

    public void useDuckCall(){
            quackBehaviour.quack();
    }
}
