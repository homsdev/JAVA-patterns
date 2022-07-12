package com.homsdev.AditionalExercises;

public class Ex5 {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        swapsies(x, y);
        System.out.println("x" + x + "y:" + y);

        int a = 0;
        int b = 10;
        int c = b/a;
    }

    public static void swapsies(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
