package com.homsdev.rpgSim.characters;

import com.homsdev.rpgSim.weaponsBehaviour.BowAndArrowBehaviour;

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
