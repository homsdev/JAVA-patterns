package com.homsdev.factoryPattern.ingredientsImpl;

import com.homsdev.factoryPattern.ingredients.Dough;

public class ThinCrustDough implements Dough {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
