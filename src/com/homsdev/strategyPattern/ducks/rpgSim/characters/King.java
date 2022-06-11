package com.homsdev.strategyPattern.ducks.rpgSim.characters;

import com.homsdev.strategyPattern.ducks.rpgSim.weaponsBehaviour.KnifeBehaviour;

public class King extends Character {
    public King() {
        weaponBehaviour = new KnifeBehaviour();
    }

    @Override
    public void fight() {
        System.out.println("<<King is now fighting>>");
        executeAttack();
    }
}
