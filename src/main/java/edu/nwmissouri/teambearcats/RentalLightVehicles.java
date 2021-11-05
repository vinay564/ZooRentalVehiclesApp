/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *
 * @author Sai Kaushik Beeram
 */
public abstract class RentalLightVehicles {

    /**
     * Every animal has a name. Class variable name is not private, but
     * protected - only subclasses can use it.
     */
    protected String vehicleName;
    protected String booking;
    protected int numOfPassengers;
    protected Double numOfMiles;

    public RentalLightVehicles(String vehicleName, String booking, int numOfPassengers, Double numOfMiles) {
        this.vehicleName = vehicleName;
        this.booking = booking;
        this.numOfPassengers = numOfPassengers;
        this.numOfMiles = numOfMiles;
    }

    

    /**
     * move() - general method for vehicle movement
     */
    public void move() {
        System.out.println("Generic animal movement");
    }

    /**
     * speak() - general method for vehicle speed
     */
    public void speed() {
        System.out.println("Generic animal sound");
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public Double getNumOfMiles() {
        return numOfMiles;
    }

    public void setNumOfMiles(Double numOfMiles) {
        this.numOfMiles = numOfMiles;
    }


    
}
