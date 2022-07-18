package com.homsdev.iteratorPattern;

import com.homsdev.iteratorPattern.menus.DinerMenu;
import com.homsdev.iteratorPattern.menus.Menu;
import com.homsdev.iteratorPattern.menus.PancakeHouseMenu;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void display() {
        Iterator breakfastItems = pancakeHouseMenu.createIterator();
        Iterator lunchItems = dinerMenu.createIterator();
        Iterator cafeItems = cafeMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(breakfastItems);
        System.out.println("MENU\n----\nLUNCH");
        printMenu(lunchItems);
        System.out.println("MENU\n----\nCAFE");
        printMenu(cafeItems);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

