package com.homsdev.statePattern;

import com.homsdev.statePattern.Context.GumballMachine;

public class GumballMonitor {
    private GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        String location = gumballMachine.getLocation();
        String totalGumballs = Integer.toString(gumballMachine.getTotalGumballs());
        String state = gumballMachine.getCurrentState().getClass().getSimpleName();

        System.out.println(String.format("\nGumball Machine: %s\nCurrent Inventory: %s\nCurrent state: %s", location, totalGumballs, state));
    }
}
