package com.homsdev.strategyPattern.ducks.rpgSim;

import com.homsdev.strategyPattern.ducks.rpgSim.characters.*;
import com.homsdev.strategyPattern.ducks.rpgSim.characters.Character;

public class testRPG {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();

        king.fight();
        queen.fight();
        knight.fight();
        troll.fight();
    }
}
