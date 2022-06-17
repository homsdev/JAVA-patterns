package com.homsdev.factoryPattern.ingredientsImpl;

import com.homsdev.factoryPattern.ingredients.Sauce;

public class MarinaraSauce implements Sauce {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
