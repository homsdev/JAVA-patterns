package com.homsdev.AditionalExercises;

public class Berries {
    String berry = "blue";

    void juicy(String berry){
        this.berry = "rasp";
        System.out.println(berry + "berry");
    }

    public static void main(String[] args) {
        new Berries().juicy("Straw");
    }
}
