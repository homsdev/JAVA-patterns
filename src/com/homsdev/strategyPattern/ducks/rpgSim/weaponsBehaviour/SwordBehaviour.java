package com.homsdev.strategyPattern.ducks.rpgSim.weaponsBehaviour;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("<<uses a sword>>");
    }
}
