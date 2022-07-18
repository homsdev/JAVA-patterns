package com.homsdev.iteratorPattern.iteratorImpl;

import com.homsdev.iteratorPattern.iterator.Iterator;
import com.homsdev.iteratorPattern.menus.MenuItem;

import java.util.List;

public class PancakeHouseIterator implements Iterator {

    List<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position < items.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }
}
