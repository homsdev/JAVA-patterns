package com.homsdev.templatePattern.template;

public abstract class CaffeineBeverage {

    //Template method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) addCondiments();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup");
    }

    //Hook method
    public boolean customerWantsCondiments() {
        return true;
    }

    public abstract void brew();

    public abstract void addCondiments();


}
