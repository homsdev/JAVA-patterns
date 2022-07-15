package com.homsdev.templatePattern;

import com.homsdev.templatePattern.template.CaffeineBeverage;
import com.homsdev.templatePattern.templateImpl.Coffee;
import com.homsdev.templatePattern.templateImpl.Tea;

public class Main {

    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        System.out.println("\n -------Coffee ordered------");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
