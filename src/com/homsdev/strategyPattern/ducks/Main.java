package com.homsdev.strategyPattern.ducks;

import com.homsdev.strategyPattern.ducks.behaviour.FlyRocketPowered;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck model = new ModelDuck();
        model.display();
        model.perfomFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.perfomFly();

        Hunter hunter = new Hunter();
        hunter.useDuckCall();

    }

}
