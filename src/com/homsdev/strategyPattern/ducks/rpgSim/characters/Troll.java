package com.homsdev.strategyPattern.ducks.rpgSim.characters;

import com.homsdev.strategyPattern.ducks.rpgSim.weaponsBehaviour.AxeBehaviour;

public class Troll extends Character {

    public Troll() {
        weaponBehaviour = new AxeBehaviour();
    }

    @Override
    public void fight() {
        System.out.println("<<Troll is now fighting>>");
        executeAttack();
    }

}
