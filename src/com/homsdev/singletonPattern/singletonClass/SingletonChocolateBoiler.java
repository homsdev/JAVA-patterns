package com.homsdev.singletonPattern.singletonClass;

public class SingletonChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    //private static SingletonChocolateBoiler uniqueStance;
    //First solution to multithreading
    private static SingletonChocolateBoiler uniqueStance = new SingletonChocolateBoiler();

    private SingletonChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static SingletonChocolateBoiler getInstance() {
        //if(uniqueStance == null) {
          //  uniqueStance = new SingletonChocolateBoiler();
        //}
        return uniqueStance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

