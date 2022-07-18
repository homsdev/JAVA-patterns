package com.homsdev.iteratorPattern.iteratorImpl;

import com.homsdev.iteratorPattern.menus.MenuItem;

import java.util.Calendar;
import java.util.Iterator;

public class AlternationgDinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position;

    public AlternationgDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 2;
        return menuItem;
    }

}
