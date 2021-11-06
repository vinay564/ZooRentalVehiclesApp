/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * This train class defines RentalHeavyVehicles
 *
 * @author Sai Kaushik Beeram
 */
public class Train extends RentalHeavyVehicles {

    private double distanceTravelled_miles = 12.24;
    private int numOfCoaches = 12;
    private double ticketPrice_dollar = 15.55;

    /**
     * move() - general method for vehicle movement
     */
    @Override
    public void move() {
        System.out.println("Vehicle moves on different platforms");
    }

    /**
     * capacity() - general method for vehicle capacity
     */
    @Override
    public void capacity() {
        System.out.println("Vehicle passenger capacity");
    }

    /**
     * price() - general method for vehicle price
     */
    @Override
    public void price() {
        System.out.println("Price of the Vehicle ");
    }

    public double getDistanceTravelled() {
        return distanceTravelled_miles;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled_miles = distanceTravelled;
    }

    public int getNumOfCoaches() {
        return numOfCoaches;
    }

    public void setNumOfCoaches(int numOfCoaches) {
        this.numOfCoaches = numOfCoaches;
    }

    public double getTicketPrice() {
        return ticketPrice_dollar;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice_dollar = ticketPrice;
    }

    /**
     * tostring of train
     *
     * @return
     */
    @Override
    public String toString() {
        return "Train{" + "distanceTravelled=" + distanceTravelled_miles + ", numOfCoaches=" + numOfCoaches + ", ticketPrice=" + ticketPrice_dollar + '}';
    }

    /**
     * train constructor
     *
     * @param vehicleName
     * @param carryHeavyLoad
     * @param vehicleWeight
     */
    public Train(String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
    }

}
