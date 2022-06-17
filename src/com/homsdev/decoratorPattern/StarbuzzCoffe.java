package com.homsdev.decoratorPattern;

import com.homsdev.decoratorPattern.concreteComponents.Beverage;
import com.homsdev.decoratorPattern.concreteComponents.DarkRoast;
import com.homsdev.decoratorPattern.concreteComponents.Expresso;
import com.homsdev.decoratorPattern.decorator.CondimentDecorator;
import com.homsdev.decoratorPattern.decorator.Mocha;
import com.homsdev.decoratorPattern.decorator.Soy;
import com.homsdev.decoratorPattern.decorator.Whip;

public class StarbuzzCoffe {

    private static String ticket;

    public static void main(String[] args) {
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        ticket = String.format("Order: %s | Cost: $%.2f", beverage1.getDescription(), beverage1.cost());

        System.out.println(ticket);

        System.out.println("=================================================");
        Beverage beverage2 = new Expresso();
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Soy(beverage2);

        ticket = String.format("Order: %s | Cost: $%.2f", beverage2.getDescription(), beverage2.cost());
        System.out.println(ticket);

        System.out.println("3rd Case");
        Beverage beverage3 = new Mocha(new Mocha(new Expresso()));
        ticket = String.format("Order: %s | Cost: $%.2f", beverage3.getDescription(), beverage3.cost());
        System.out.println(ticket);

    }


}
