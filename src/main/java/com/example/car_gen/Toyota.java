package com.example.car_gen;

public class Toyota extends Car{
    private boolean greatGasMilage;

    //getter and setter
    public boolean getGreatGasMilage() {
        return greatGasMilage;
    }
    public void setGreatGasMilage(boolean newGreatGasMilage) {
        greatGasMilage = newGreatGasMilage;
    }

    //This is the new constructor
    public Toyota(String color, int year, int maxSpeed, boolean isElectric, boolean greatGasMilage) {
        super(color, year, maxSpeed);
        this.greatGasMilage = greatGasMilage;
    }
}


