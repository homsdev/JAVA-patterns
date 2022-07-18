package com.homsdev.iteratorPattern.iterator;

import com.homsdev.iteratorPattern.menus.MenuItem;

public interface Iterator {
    boolean hasNext();

    MenuItem next();
}
