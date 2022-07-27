package com.homsdev.statePattern.Context;

import com.homsdev.statePattern.concreteStates.*;
import com.homsdev.statePattern.state.State;

public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldOutState;
    private State soldState;
    private State winnerstate;

    private State currentState;
    private int totalGumballs;
    private String location;

    public GumballMachine(int totalGumballs, String location) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerstate = new WinnerState(this);

        this.totalGumballs = totalGumballs;
        this.location = location;

        if (this.totalGumballs > 0) {
            currentState = noQuarterState;
        } else {
            currentState = null;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (totalGumballs > 0) {
            totalGumballs -= 1;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerstate() {
        return winnerstate;
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getTotalGumballs() {
        return totalGumballs;
    }

    public String getLocation() {
        return location;
    }

    public void setState(State currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return String.format("Inventory: %d Gumballs Location: %s ", totalGumballs, location);
    }
}
