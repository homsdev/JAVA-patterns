package com.homsdev.commandPattern.receiver;

public class Light {

    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on(){
        String line = String.format("%s Light is On",location);
        System.out.println(line);
    }

    public void off(){
        String line = String.format("%s Light is Off",location);
        System.out.println(line);
    }
}
