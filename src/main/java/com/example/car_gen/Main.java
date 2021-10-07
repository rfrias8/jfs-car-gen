package com.example.car_gen;

public class Main {
    public static void main(String[] args) {
    Honda civic = new Honda("red",2018,140,true, true);
    Lexus rx350 = new Lexus("silver",2019,120,true, true);
    Toyota supra = new Toyota("black",2020, 120,false, false);

    System.out.println(civic.getColor());
    System.out.println(rx350.getColor());
    System.out.println(supra.getColor());
    System.out.println(civic.accelerateSpeed());
    System.out.println(supra.deccelerateSpeed());
    System.out.println(rx350.convertToElectric());
    System.out.println(supra.convertToElectric());
    }
}
