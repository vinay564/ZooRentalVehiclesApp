/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import java.util.Arrays;

/**
 * Airplane class (derived subclass of the superclass RentalHeavyVehicles)
 *
 * @author Satish Vagulapuram
 */
public class Airplane extends RentalHeavyVehicles {

    /**
     * Declaration of private variables
     */
    private int distanceTravelled_miles;
    private double ticketPrice_dollars;
    private int noOfWings;

    /**
     * Constructor
     *
     * @param distanceTravelled_miles
     * @param ticketPrice_dollars
     * @param noOfWings
     * @param vehicleName
     * @param carryHeavyLoad
     * @param vehicleWeight
     */
    public Airplane(int distanceTravelled_miles, double ticketPrice_dollars, int noOfWings, String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
        this.distanceTravelled_miles = distanceTravelled_miles;
        this.ticketPrice_dollars = ticketPrice_dollars;
        this.noOfWings = noOfWings;
    }

    /**
     * getter method for DistanceTravelled_miles
     *
     * @return
     */
    public int getDistanceTravelled_miles() {
        return distanceTravelled_miles;
    }

    /**
     * setter method for DistanceTravelled_miles
     *
     * @return
     */
    public void setDistanceTravelled_miles(int distanceTravelled) {
        this.distanceTravelled_miles = distanceTravelled_miles;
    }

    /**
     * getter method for ticketPrice_dollars
     *
     * @return
     */
    public double getTicketPrice_dollars() {
        return ticketPrice_dollars;
    }

    /**
     * setter method
     *
     * @param ticketPrice_dollars
     */
    public void setTicketPrice_dollars(double ticketPrice_dollars) {
        this.ticketPrice_dollars = ticketPrice_dollars;
    }

    /**
     * getter method for getOfWings
     *
     * @return
     */
    public int getNoOfWings() {
        return noOfWings;
    }

    /**
     * setter method
     *
     * @param noOfWings
     */
    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    /**
     * Overriding the move method
     */
    @Override
    public void move() {
        System.out.println("I  have " + noOfWings + " wheels to move on air");
    }

    /**
     * Overriding the capacity method
     */
    @Override
    public void capacity() {
        System.out.println("I have 8 seats capacity");
    }

    /**
     * Overriding the price
     */
    @Override
    public void price() {
        System.out.println("My Ticket Price is $" + this.ticketPrice_dollars);
    }

    /**
     * foodMenu method
     */
    public void foodMenu() {
        System.out.println("I provide food while travelling");
    }

    public static void main(String[] args) {

        Airplane airplaneObj = new Airplane(2, 3.3, 3, "airplane", "Yes", 3.4);

        airplaneObj.move();
        airplaneObj.capacity();
        airplaneObj.price();
        airplaneObj.foodMenu();

    }
    /*
    exceptionMethod()-for exceptions
    */
    public static void exceptionMethod(){
    int p= 1;
    int q= 0;
   

     try {
            System.out.printf("About to divide %d by %d...", p, q);
             var result = p/q;
            System.out.println();
           // var result = p / q;

        } catch (ArithmeticException ex) {
            System.out.println("ERROR toString():       " + ex.toString());
            System.out.println("ERROR class:            " + ex.getClass());
            System.out.println("ERROR localized message:" + ex.getClass());
            System.out.println("ERROR message:          " + ex.getMessage());
            System.out.println("ERROR stacktrace:     \n" + Arrays.toString(ex.getStackTrace()));
        }

    }

    /**
     * toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "Airplane{" + "distanceTravelled_miles=" + distanceTravelled_miles + ", ticketPrice_dollars=" + ticketPrice_dollars + ", noOfWings=" + noOfWings + '}';
    }
}
