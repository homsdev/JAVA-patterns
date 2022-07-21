package com.homsdev.compositePattern;

import com.homsdev.compositePattern.menuImpl.Menu;
import com.homsdev.compositePattern.menuItemImpl.MenuItem;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT Menu", "Dessert of course");

        MenuComponent allMenus = new Menu("All menus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with marinara sauce", true, 3.89));
        dinerMenu.add(new MenuItem("Vegetarian BLT", "Fake Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a slide of potato salad", false, 3.29));
        dinerMenu.add(new MenuItem("Hot dog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05));

        pancakeHouseMenu.add(new MenuItem("K&B´s Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular pancake breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry pancakes", "Pancakes made with fresh blueberries", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59));

        cafeMenu.add(new MenuItem("Veggie burger and air fries", "Veggie burger on a whole bun, lettuce, tomato, and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito", true, 4.29));

        dessertMenu.add(new MenuItem("Apple pie", "Apple pie description", true, 1.59));

        dinerMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printAll();
    }
}
