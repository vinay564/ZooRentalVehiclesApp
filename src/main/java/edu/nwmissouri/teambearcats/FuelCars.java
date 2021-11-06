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

    private int numOfWheels = 4;
    private double price_dollar = 15.75;
    private boolean IsHavingAirBags = true;

    /*
      get method for number of wheels
     */
    public int getNumOfWheels() {
        return numOfWheels;
    }

    /*
    set method for number of wheels
     */
    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    /*
    get method for vehicle price
     */
    public double getPrice() {
        return price_dollar;
    }

    /*
    set method for vehicle price
     */
    public void setPrice(double price) {
        this.price_dollar = price;
    }

    public boolean isIsHavingAirBags() {
        return IsHavingAirBags;
    }

    public void setIsHavingAirBags(boolean IsHavingAirBags) {
        this.IsHavingAirBags = IsHavingAirBags;
    }

    /*
    toString method for the vehicle class
     */
    @Override
    public String toString() {
        return "FuelCars{" + "numOfWheels=" + numOfWheels + ", price=" + price_dollar + ", IsHavingAirBags=" + IsHavingAirBags + '}';
    }

    /**
     * FuelCars Constructor
     *
     * @param vehicleName - This the name of the vehicle
     * @param booking - Need to book a fuel cars
     * @param numOfPassengers - Passengers number in the car
     * @param numOfMiles - Miles of the car
     */
    public FuelCars(String vehicleName, String booking, int numOfPassengers, Double numOfMiles) {
        super(vehicleName, booking, numOfPassengers, numOfMiles);
    }

    /*
    move() - method for the vehicle fuelcars
     */
    @Override
    public void move() {
        System.out.println("Fuelcars move in the zoo for the passengers to travel");
    }

    /*
    speed() - method for vechile fuelcars
     */
    @Override
    public void speed() {
        System.out.println("The fuelcars mantains the average speed of the fuelcars ");
    }
       
    /*
     carModel() -  has different carddmodels
    */
    public void carModel() {
        System.out.println("The fuelcars has provides so many car models");
    }
}
