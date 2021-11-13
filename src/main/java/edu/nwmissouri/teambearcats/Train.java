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

    private double distanceTravelled_miles;
    private int numOfCoaches;
    private double ticketPrice_dollar;

    /**
     * train constructor
     *
     * @param vehicleName is determines the train
     * @param carryHeavyLoad it can carry many goods
     * @param vehicleWeight it is Heavy Vehicles
     */
    public Train(double distanceTravelled_miles, int numOfCoaches, double ticketPrice_dollar, String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
        this.distanceTravelled_miles = distanceTravelled_miles;
        this.numOfCoaches = numOfCoaches;
        this.ticketPrice_dollar = ticketPrice_dollar;
    }

    public double getDistanceTravelled_miles() {
        return distanceTravelled_miles;
    }

    public void setDistanceTravelled_miles(double distanceTravelled_miles) {
        this.distanceTravelled_miles = distanceTravelled_miles;
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
     * move() - general method for vehicle movement
     */
    @Override
    public void move() {
        System.out.println("I  have travelled " + distanceTravelled_miles);
    }

    /**
     * capacity() - general method for vehicle capacity
     */
    @Override
    public void capacity() {
        System.out.println("I have capacity of " + numOfCoaches);
    }

    /**
     * price() - general method for vehicle price
     */
    @Override
    public void price() {
        System.out.println("My cost is " + ticketPrice_dollar);
    }

    public static void main(String[] args) {

        Train trainObj = new Train(2.4, 5, 3.9, "train", "Yes", 2.3);

        trainObj.move();
        trainObj.capacity();
        trainObj.price();

    }

    /**
     * toString of train
     *
     * @return
     */

    @Override
    public String toString() {
        return "Train{" + "distanceTravelled_miles=" + distanceTravelled_miles + ", numOfCoaches=" + numOfCoaches + ", ticketPrice_dollar=" + ticketPrice_dollar + '}';
    }

}
