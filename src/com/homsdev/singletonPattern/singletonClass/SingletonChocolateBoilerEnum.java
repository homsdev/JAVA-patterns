package com.homsdev.singletonPattern.singletonClass;

public enum SingletonChocolateBoilerEnum {
    INSTANCE(false, false);
    private boolean empty;
    private boolean boiled;

    private SingletonChocolateBoilerEnum(Boolean empty, Boolean boiled) {
        this.empty = empty;
        this.boiled = boiled;
    }

    public SingletonChocolateBoilerEnum getInstance() {
        return INSTANCE;
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
