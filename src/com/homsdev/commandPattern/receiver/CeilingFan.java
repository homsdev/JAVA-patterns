package com.homsdev.commandPattern.receiver;

public class CeilingFan {

    public static  final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    String location;


    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void on(){
        String line = String.format("%s Ceiling Fan is On",location);
        System.out.println(line);
    }

    public void off(){
        speed = OFF;
        String line = String.format("%s Ceiling Fan is on %d",location,speed);
        System.out.println(line);
    }

    public void high(){
        speed = HIGH;
        String line = String.format("%s Ceiling Fan is on %d",location,speed);
        System.out.println(line);
    }

    public void medium(){
        speed = MEDIUM;
        String line = String.format("%s Ceiling Fan is on %d",location,speed);
        System.out.println(line);
    }

    public void low(){
        speed = LOW;
        String line = String.format("%s Ceiling Fan is on %d",location,speed);
        System.out.println(line);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
