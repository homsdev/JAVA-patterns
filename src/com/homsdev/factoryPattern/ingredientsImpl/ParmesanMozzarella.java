package com.homsdev.factoryPattern.ingredientsImpl;

import com.homsdev.factoryPattern.ingredients.Cheese;

public class ParmesanMozzarella implements Cheese {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
