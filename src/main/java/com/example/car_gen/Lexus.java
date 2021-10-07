package com.example.car_gen;

public class Lexus extends Car{
    private boolean hasLeatherSeats;

    public boolean getHasLeatherSeats() {
        return hasLeatherSeats;
    }
    public void setHasLeatherSeats(boolean newHasLeatherSeat) {
    hasLeatherSeats = newHasLeatherSeat; }
    //constructor
    public Lexus(String color, int year, int maxSpeed, boolean isElectric , boolean hasLeatherSeats) {
        super(color, year, maxSpeed );
        this.hasLeatherSeats = hasLeatherSeats;
}
}
