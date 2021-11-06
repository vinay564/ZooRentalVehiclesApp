/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *
 * @author Nikhil Porika
 */
public class FuelCars extends RentalLightVehicles {
    private int numOfWheels = 4;
    private double price = 0.0;
    private boolean IsHavingAirBags = true;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIsHavingAirBags() {
        return IsHavingAirBags;
    }

    public void setIsHavingAirBags(boolean IsHavingAirBags) {
        this.IsHavingAirBags = IsHavingAirBags;
    }

    @Override
    public String toString() {
        return "FuelCars{" + "numOfWheels=" + numOfWheels + ", price=" + price + ", IsHavingAirBags=" + IsHavingAirBags + '}';
    }
     
    /**
     * FuelCars Constructor
     * @param vehicleName - This the name of the vehicle 
     * @param booking - Need to book a fuel cars
     * @param numOfPassengers - Passengers number in the car
     * @param numOfMiles - Miles of the car
     */ 
    
    public FuelCars(String vehicleName, String booking, int numOfPassengers, Double numOfMiles) {
        super(vehicleName, booking, numOfPassengers, numOfMiles);
    }

     
    
    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void speed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
