package com.homsdev.strategyPattern.ducks.rpgSim.weaponsBehaviour;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("<<uses an axe>>");
    }
}
