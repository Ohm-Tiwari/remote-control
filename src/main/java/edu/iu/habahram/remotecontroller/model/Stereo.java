package edu.iu.habahram.remotecontroller.model;

import edu.iu.habahram.remotecontroller.repository.RemoteLoader;

import java.rmi.Remote;

public class Stereo {

    String location = "";
    int volume = 0;

    public Stereo(String location) {
        this.location = location;
    }

    public String on() {
        String result = location + " stereo is on";
        result += setCd();
        return result;

    }

    public String off() {
        return location + " stereo is off";
    }

    public String setCd(){
        return "cd is set";

    }

    public String setDvd(){
        return "dvd is set";

    }

    public String setRadio(){
        return "radio is set";

    }
    public String setVolume(int volume){
        this.volume = volume;
        return "Volume is set to " + volume;
    }






}
