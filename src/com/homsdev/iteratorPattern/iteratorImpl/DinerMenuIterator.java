package com.homsdev.iteratorPattern.iteratorImpl;

import com.homsdev.iteratorPattern.menus.MenuItem;

import java.util.Iterator;
import java.util.List;

public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position < menuItems.length && menuItems[position] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems[position];
        position += 1;
        return item;
    }
}
