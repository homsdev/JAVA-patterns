package com.homsdev.rpgSim.characters;

import com.homsdev.rpgSim.weaponsBehaviour.WeaponBehaviour;

public abstract class Character {

    WeaponBehaviour weaponBehaviour;

    public abstract void fight();

    protected void executeAttack(){
        weaponBehaviour.useWeapon();
    }
}
