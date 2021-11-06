/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * RentalLightVehicles class (derived subclass of the superclass
 * ZooRentalVehiclesApp)
 *
 * @author Sai Kaushik Beeram
 */
public abstract class RentalLightVehicles {

    /**
     * Every animal has a name. Class variable name is not private, but
     * protected - only subclasses can use it.
     */
    protected String vehicleName = "Light Vehicles";
    protected String booking = "Number of seats";
    protected int numOfPassengers = 6;
    protected Double numOfMiles = 1200.50;

    public RentalLightVehicles(String vehicleName, String booking, int numOfPassengers, Double numOfMiles) {
        this.vehicleName = vehicleName;
        this.booking = booking;
        this.numOfPassengers = numOfPassengers;
        this.numOfMiles = numOfMiles;
    }

    /**
     * move() - general method for vehicle movement
     */
    public abstract void move();

    /**
     * speak() - general method for vehicle speed
     */
    public abstract void speed();

    public String getVehicleName() {
        return vehicleName;
    }

    public String getBooking() {
        return booking;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public Double getNumOfMiles() {
        return numOfMiles;
    }

}
