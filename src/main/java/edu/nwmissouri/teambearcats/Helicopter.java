/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *Helicopter class (derived subclass of the superclass RentalHeavyVehicles)
 * @author Satish Vagulapuram
 */
public class Helicopter extends RentalHeavyVehicles {

    private int numOfBlades = 4;
    private String nameOfPillots = "jerry";
    private int distanceTravelled = 5;
/**
 * getter method for getNumOfBlades
 * @return 
 */
    public int getNumOfBlades() {
        return numOfBlades;
    }
/**
 * setter method
 * @param numOfBlades 
 */
    public void setNumOfBlades(int numOfBlades) {
        this.numOfBlades = numOfBlades;
    }
/**
 * getter method for getNameOfPillots
 * @return 
 */
    public String getNameOfPillots() {
        return nameOfPillots;
    }
/**
 * setter method
 * @param nameOfPillots 
 */
    public void setNameOfPillots(String nameOfPillots) {
        this.nameOfPillots = nameOfPillots;
    }
/**
 * getter method for getDistanceTravelled
 * @return 
 */
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
/**
 * setter method
 * @param distanceTravelled 
 */
    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
/**
 * ToString 
 * @return 
 */
    @Override
    public String toString() {
        return "Helicopter{" + "numOfBlades=" + numOfBlades + ", nameOfPillots=" + nameOfPillots + ", distanceTravelled=" + distanceTravelled + '}';
    }
/**
 * Constructor
 * @param numOfBlades
 * @param nameOfPillots
 * @param distanceTravelled
 * @param vehicleName
 * @param carryHeavyLoad
 * @param vehicleWeight 
 */
    public Helicopter(int numOfBlades, String nameOfPillots, int distanceTravelled, String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
        this.numOfBlades = numOfBlades;
        this.nameOfPillots = nameOfPillots;
        this.distanceTravelled = distanceTravelled;
    }
/**
 * Overriding the move method
 */
    @Override
    public void move() {
        System.out.println("I move on air less than airplane height");
    }
/**
 * Overriding the capacity method
 */
    @Override
    public void capacity() {
        System.out.println("I have less capacity");
    }
/**
 * Overriding the price
 */
    @Override
    public void price() {
        System.out.println("I'm cheaper than plane");
    }
/**
 * duration method
 */
    public void duration() {

        System.out.println("My duration varies on cost");
    }
}
