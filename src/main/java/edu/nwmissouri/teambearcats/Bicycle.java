/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * Bicycle class (derived subclass of the superclass RentalLightVehicles)
 * @author Vinay Manavarthi
 */
public class Bicycle extends RentalLightVehicles {
    private int numOfWheels = 2 ;
    private double priceIn_dollars = 5.5;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public double getPriceIn_dollars() {
        return priceIn_dollars;
    }

    public void setPriceIn_dollars(double priceIn_dollars) {
        this.priceIn_dollars = priceIn_dollars;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "numOfWheels=" + numOfWheels + ", priceIn_dollars=" + priceIn_dollars + '}';
    }
 /**
     * Bicycle Constructor
     * 
     * @param numOfWheels - This is the number of wheels for bicycles
     * @param priceIn_dollars - Bus carries the heavy load
     * @param vehicleName - This is vehicleName
     * * @param booking - This is for ticket booking
     * * @param numOfPassengers - This is numOfPassengers in the bus
     */
    public Bicycle(int numOfWheels, double priceIn_dollars, String vehicleName, String booking, int numOfPassengers, Double numOfMiles) {
        super(vehicleName, booking, numOfPassengers, numOfMiles);
        this.numOfWheels = numOfWheels;
        this.priceIn_dollars = priceIn_dollars;
    }
    
    
    
    @Override
    public void move() {
          System.out.println("I move on road");
    }

    @Override
    public void speed() {
          System.out.println("I go with more speed on road");
    }

    

  
   
   
    
}
