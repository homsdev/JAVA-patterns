package com.homsdev.compositePattern.menuItemImpl;

import com.homsdev.compositePattern.MenuComponent;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        String ln = String.format("\nName: %s, Description: %s , Vegetarian: %s, $%.2f "
                , getName()
                , getDescription()
                , isVegetarian() ? "YES" : "NO"
                , getPrice());

        System.out.println(ln);
        System.out.println("------------------------");
    }
}
