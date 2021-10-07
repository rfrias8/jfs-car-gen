package com.example.car_gen;

public class Car {
   private String color;
   private int year;
   private int speed = 10;
   private int maxSpeed;
   private boolean isElectric;

//Getters and setters
   public String getColor() {
      return color;
   }
   public void setColor(String newColor) {
      color = newColor;
   }
      public int getYear() {
      return year;
   }
   public void setYear(int newYear) {
      year = newYear;
   }
   public int getSpeed() {
      return speed;
   }
   public void setSpeed(int newSpeed) {
      speed = newSpeed;
   }
   public int getMaxSpeed() {
      return maxSpeed;
   }
   public void setMaxSpeed(int newMaxSpeed) {
      maxSpeed = newMaxSpeed;
   }
   public boolean getIsElectric() {
      return isElectric;
   }
   public void setIsElectric(boolean newIsElectric) {
      isElectric = newIsElectric;
   }
   //This is the constructor
   public Car(String color, int year, int maxSpeed) {
      this.color = color;
      this.year = year;
      this.maxSpeed = maxSpeed;
   }

   //Accelerate speed method
   public int accelerateSpeed() {
      speed += 5;
      if(speed > maxSpeed) {
         return maxSpeed;
      } else {
         return speed;
      }

   }

   //deccelerate speed method
   public int deccelerateSpeed() {
      speed -= 5;
      if(speed < 0) {
         return 0;
      } else {
         return speed;
      }
   }

   //convert to electric method
   public boolean convertToElectric() {
      if(isElectric == false){
         return isElectric = true;
      } else {
         System.out.println("This car is already electric");
         return true;

      }

   }



}
