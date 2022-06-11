package com.homsdev.strategyPattern.ducks.rpgSim.weaponsBehaviour;

public class BowAndArrowBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("<<shoots arrow with bow>>");
    }
}
