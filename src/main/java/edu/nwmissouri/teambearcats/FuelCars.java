/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import java.util.Arrays;

/**
 * FuelCars class (derived subclass of the superclass RentalLightVehicles)
 *
 * @author Nikhil Porika
 */
public class FuelCars extends RentalLightVehicles {
  public static void main(String[] args) {

        FuelCars fuel_Obj = new FuelCars("Audio", "Offline Booking", 6, 79.19);

        fuel_Obj.move();
        fuel_Obj.speed();
        
        exceptionMethod();

    }


    private int numOfPassengers;
    private double numOfMiles;
    // private boolean IsHavingAirBags;
    int i= 1;
    int j= 0;

    /**
     * FuelCars Constructor
     *
     * @param vehicleName - This the name of the vehicle
     * @param booking - Need to book a fuel cars
     * @param numOfPassengers - Passengers number in the car
     * @param numOfMiles - Miles of the car
     */
    public FuelCars(String vehicleName, String booking, int numOfPassengers, double numOfMiles) {
        super(vehicleName, booking, numOfPassengers, numOfMiles);
        this.numOfPassengers = numOfPassengers;
        this.numOfMiles = numOfMiles;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public double getNumOfMiles() {
        return numOfMiles;
    }

    public void setNumOfMiles(double numOfMiles) {
        this.numOfMiles = numOfMiles;
    }

    /*
    move() - method for the vehicle fuelcars
     */
    @Override
    public void move() {
        System.out.println("I have the" + this.numOfPassengers + "move in the zoo for the passengers to travel");
    }

    /*
    speed() - method for vechile fuelcars
     */
    @Override
    public void speed() {
        System.out.println("I have travel with the " + this.numOfMiles + "to travel by giving certain milage");
    }

    /*
     carModel() -  has different carddmodels
     */
    public void carModel() {
        System.out.println("The fuelcars has provides so many car models");
    }

  /*
    exceptionMethod()-for exceptions
    */
    public static void exceptionMethod(){
    int x= 1;
    int y= 0;
   

     try {
            System.out.printf("About to divide %d by %d...", x, y);
             var result = x/y;
            System.out.println();

        } catch (ArithmeticException ex) {
            System.out.println("ERROR toString():       " + ex.toString());
            System.out.println("ERROR class:            " + ex.getClass());
            System.out.println("ERROR localized message:" + ex.getClass());
            System.out.println("ERROR message:          " + ex.getMessage());
            System.out.println("ERROR stacktrace:     \n" + Arrays.toString(ex.getStackTrace()));
        }

    }
    /*
    toString method for the vehicle class
     */
    @Override
    public String toString() {
        return "FuelCars{" + "numOfPassengers=" + numOfPassengers + ", numOfMiles=" + numOfMiles + '}';
    }
}
     