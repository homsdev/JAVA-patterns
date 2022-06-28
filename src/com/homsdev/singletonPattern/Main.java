package com.homsdev.singletonPattern;

import com.homsdev.singletonPattern.singletonClass.Singleton;
import com.homsdev.singletonPattern.singletonClass.SingletonChocolateBoiler;
import com.homsdev.singletonPattern.singletonClass.SingletonChocolateBoilerEnum;

public class Main {

    public static String getStatus(SingletonChocolateBoilerEnum singleton) {
        return String.format(" %s status Filled: %s Boiled: %s Drained: %s",
                singleton.getClass().getSimpleName(),
                !singleton.isEmpty(),
                singleton.isBoiled(),
                singleton.isEmpty());
    }

    public static void main(String[] args) {
        //Call to Singleton class
        SingletonChocolateBoiler singletonClass1 = SingletonChocolateBoiler.getInstance();
        SingletonChocolateBoiler singletonClass2 = SingletonChocolateBoiler.getInstance();

        String l1 = String.format("SingletonClass 1 hashcode is: %s", singletonClass1.hashCode());
        String l2 = String.format("SingletonClass 2 hashcode is: %s", singletonClass2.hashCode());

        System.out.println(l1);
        System.out.println(l2);

        System.out.println("Singleton using enums");

        SingletonChocolateBoilerEnum singletonEnum1 = SingletonChocolateBoilerEnum.INSTANCE.getInstance();
        SingletonChocolateBoilerEnum singletonEnum2 = SingletonChocolateBoilerEnum.INSTANCE.getInstance();

        String l3 = String.format("SingletonClassEnum 1 hashcode is: %s", singletonEnum1.hashCode());
        String l4 = String.format("SingletonClassEnum 2 hashcode is: %s", singletonEnum2.hashCode());

        System.out.println(l3);
        System.out.println(l4);

        System.out.println(getStatus(singletonEnum1));
        singletonEnum1.fill();
        System.out.println(String.format("1.- %s",getStatus(singletonEnum1)));
        singletonEnum1.boil();
        System.out.println(String.format("2.- %s",getStatus(singletonEnum1)));
        singletonEnum1.drain();
        System.out.println(String.format("3.- %s",getStatus(singletonEnum1)));

        System.out.println(String.format("Other singleton %s",getStatus(singletonEnum2)));
    }
}
