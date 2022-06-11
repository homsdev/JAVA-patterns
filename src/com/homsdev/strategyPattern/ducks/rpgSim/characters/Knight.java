package com.homsdev.strategyPattern.ducks.rpgSim.characters;

import com.homsdev.strategyPattern.ducks.rpgSim.weaponsBehaviour.SwordBehaviour;

public class Knight extends Character {
    public Knight() {
        weaponBehaviour = new SwordBehaviour();
    }

    @Override
    public void fight() {
        System.out.println("<<Knight is now fighting>>");
        executeAttack();
    }
}
