/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * FuelCars class (derived subclass of the superclass RentalLightVehicles)
 *
 * @author Nikhil Porika
 */
public class FuelCars extends RentalLightVehicles {

    private int numOfPassengers;
    private double numOfMiles;
    // private boolean IsHavingAirBags;

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

    public static void main(String[] args) {

        FuelCars fuel_Obj = new FuelCars("Audio", "Offline Booking", 6, 79.19);

        fuel_Obj.move();
        fuel_Obj.speed();

    }

    /*
    toString method for the vehicle class
     */
    @Override
    public String toString() {
        return "FuelCars{" + "numOfPassengers=" + numOfPassengers + ", numOfMiles=" + numOfMiles + '}';
    }
}
