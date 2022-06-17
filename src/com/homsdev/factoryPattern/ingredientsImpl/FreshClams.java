package com.homsdev.factoryPattern.ingredientsImpl;

import com.homsdev.factoryPattern.ingredients.Clams;

public class FreshClams implements Clams {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
