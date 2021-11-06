/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *Airplane class (derived subclass of the superclass RentalHeavyVehicles)
 * @author Satish Vagulapuram
 */
public class Airplane extends RentalHeavyVehicles {

/**
 * Declaration of private variables
 */
    private int distanceTravelled = 4;
    private double ticketPrice = 0.0;
    private int noOfWings = 2;
/**
 * getter method for DistanceTravelled
 * @return 
 */
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
/**
 * setter method for DistanceTravelled
 * @return 
 */
    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
/**
 * getter method for ticketPrice
 * @return 
 */
    public double getTicketPrice() {
        return ticketPrice;
    }
/**
 * setter method
 * @param ticketPrice 
 */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
/**
 * getter method for getOfWings
 * @return 
 */
    public int getNoOfWings() {
        return noOfWings;
    }
/**
 * setter method
 * @param noOfWings 
 */

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }
/**
 * toString method
 * @return 
 */
    @Override
    public String toString() {
        return "Airplane{" + "distanceTravelled=" + distanceTravelled + ", ticketPrice=" + ticketPrice + ", noOfWings=" + noOfWings + '}';
    }
/**
 * Constructor
 * @param vehicleName
 * @param carryHeavyLoad
 * @param vehicleWeight 
 */
    public Airplane(String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
    }
/**
 * Overriding the move method 
 */
    @Override
    public void move() {
        System.out.println("I move on air");
    }
/**
 * Overriding the capacity method
 */
    @Override
    public void capacity() {
        System.out.println("I have more passenger capacity");
    }
/**
 * Overriding the price
 */
    @Override
    public void price() {
        System.out.println("I'm costly");
    }
/**
 * Overriding the foodMenu
 */
    public void foodMenu() {
        System.out.println("I provide food while travelling");
    }

}
