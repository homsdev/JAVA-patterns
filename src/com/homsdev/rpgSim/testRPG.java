package com.homsdev.rpgSim;

import com.homsdev.rpgSim.characters.*;
import com.homsdev.rpgSim.characters.Character;

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
