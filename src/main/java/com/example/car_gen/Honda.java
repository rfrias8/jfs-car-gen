package com.example.car_gen;

public class Honda extends Car{
    private boolean isTurboCharged;

    //Getter and setter
    public boolean getIsTurboCharged() {
        return isTurboCharged;
    }
    public void setIsTurboCharged(boolean newIsTurboCharged) {
        isTurboCharged = newIsTurboCharged;
    }

//Honda constructor
    public Honda(String color, int year, int maxSpeed, boolean isElectric, boolean isTurboCharged) {
        super(color, year, maxSpeed);
        this.isTurboCharged = isTurboCharged;
    }
}


