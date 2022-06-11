package com.homsdev.strategyPattern.ducks.rpgSim.characters;

import com.homsdev.strategyPattern.ducks.rpgSim.weaponsBehaviour.BowAndArrowBehaviour;

public class Queen extends Character {
    public Queen() {
        weaponBehaviour = new BowAndArrowBehaviour();
    }

    @Override
    public void fight() {
        System.out.println("<<Queen is now fighting>>");
        executeAttack();
    }
}
