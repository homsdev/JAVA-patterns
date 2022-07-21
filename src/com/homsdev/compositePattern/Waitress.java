package com.homsdev.compositePattern;

public class Waitress {
    MenuComponent menus;

    public Waitress(MenuComponent menus) {
        this.menus = menus;
    }

    public void printAll(){
        menus.print();
    }
}
