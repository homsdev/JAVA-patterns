package com.homsdev.commandPattern.receiver;

public class Stereo {

    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        String line = String.format("%s Stereo is On", location);
        System.out.println(line);
    }

    public void Off() {
        String line = String.format("%s Stereo is Off", location);
        System.out.println(line);
    }

    public void setCd() {
        String line = String.format("%s Stereo is set for CD input", location);
        System.out.println(line);
    }

    public void setDvd() {
        String line = String.format("%s Stereo is set for DVD input", location);
        System.out.println(line);
    }

    public void setRadio() {
        String line = String.format("%s Stereo is set for Radio input", location);
        System.out.println(line);
    }

    public void setVolume(int volumeValue) {
        String line = String.format("%s Stereo Volume is set to %d", location, volumeValue);
        System.out.println(line);
    }

}
