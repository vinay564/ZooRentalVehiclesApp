/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * Helicopter class (derived subclass of the superclass RentalHeavyVehicles)
 *
 * @author Satish Vagulapuram
 */
public class Helicopter extends RentalHeavyVehicles {

    private int numOfBlades;
    private String nameOfPillots;
    private int distanceTravelled_miles;
    private double ticketPrice_dollars;

    public Helicopter(int numOfBlades, String nameOfPillots, int distanceTravelled_miles, double ticketPrice_dollars, String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
        this.numOfBlades = numOfBlades;
        this.nameOfPillots = nameOfPillots;
        this.distanceTravelled_miles = distanceTravelled_miles;
        this.ticketPrice_dollars = ticketPrice_dollars;
    }

    /**
     * getter method for getNumOfBlades
     *
     * @return
     */
    public int getNumOfBlades() {
        return numOfBlades;
    }

    /**
     * setter method
     *
     * @param numOfBlades
     */
    public void setNumOfBlades(int numOfBlades) {
        this.numOfBlades = numOfBlades;
    }

    /**
     * getter method for getNameOfPillots
     *
     * @return
     */
    public String getNameOfPillots() {
        return nameOfPillots;
    }

    /**
     * setter method
     *
     * @param nameOfPillots
     */
    public void setNameOfPillots(String nameOfPillots) {
        this.nameOfPillots = nameOfPillots;
    }

    /**
     * getter method for getDistanceTravelled
     *
     * @return
     */
    public int getDistanceTravelled_miles() {
        return distanceTravelled_miles;
    }

    /**
     * setter method
     *
     * @param distanceTravelled_miles
     */
    public void setDistanceTravelled_miles(int distanceTravelled_miles) {
        this.distanceTravelled_miles = distanceTravelled_miles;
    }

    /**
     * Overriding the move method
     */
    @Override
    public void move() {
        System.out.println("I Have " + this.numOfBlades + " blades to move on air");
    }

    /**
     * Overriding the capacity method
     */
    @Override
    public void capacity() {
        System.out.println("I have 4 seats capacity");
    }

    /**
     * Overriding the price
     */
    @Override
    public void price() {
        System.out.println("My Ticket Price is $" + this.ticketPrice_dollars);
    }

    /**
     * duration method
     */
    public void duration() {

        System.out.println("My duration varies on ticketPrice");
    }

    public static void main(String[] args) {

        Helicopter helicopterObj = new Helicopter(4, "Jerry", 4, 55.0, "Heli", "Yes", 50.0);

        helicopterObj.capacity();
        helicopterObj.duration();
        helicopterObj.price();
        helicopterObj.move();

    }

    /**
     * ToString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Helicopter{" + "numOfBlades=" + numOfBlades + ", nameOfPillots=" + nameOfPillots + ", distanceTravelled_miles=" + distanceTravelled_miles + ", ticketPrice_dollars=" + ticketPrice_dollars + '}';
    }

}
