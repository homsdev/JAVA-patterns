package com.homsdev.templatePattern.templateImpl;

import com.homsdev.templatePattern.template.CaffeineBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }


    @Override//Hook method could be overrided but is not necessary
    public boolean customerWantsCondiments() {
        if (getUserInput().toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n) ?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO Error trying to read your answer");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
