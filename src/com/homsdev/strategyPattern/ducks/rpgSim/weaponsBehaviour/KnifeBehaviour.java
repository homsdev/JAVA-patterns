package com.homsdev.strategyPattern.ducks.rpgSim.weaponsBehaviour;

public class KnifeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("<<uses a knife>>");
    }
}
