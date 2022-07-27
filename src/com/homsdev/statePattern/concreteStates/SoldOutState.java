package com.homsdev.statePattern.concreteStates;

import com.homsdev.statePattern.Context.GumballMachine;
import com.homsdev.statePattern.state.State;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("The machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You cant eject, you have not inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You tuned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed, machine is sold out");
    }
}
