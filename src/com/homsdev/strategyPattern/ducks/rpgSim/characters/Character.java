package com.homsdev.strategyPattern.ducks.rpgSim.characters;

import com.homsdev.strategyPattern.ducks.rpgSim.weaponsBehaviour.WeaponBehaviour;

public abstract class Character {

    WeaponBehaviour weaponBehaviour;

    public abstract void fight();

    protected void executeAttack(){
        weaponBehaviour.useWeapon();
    }
}
