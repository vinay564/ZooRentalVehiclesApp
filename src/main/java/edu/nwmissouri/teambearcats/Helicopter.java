/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *
 * @author Satish Vagulapuram
 */
public class Helicopter extends RentalHeavyVehicles {

    private int numOfBlades = 4;
    private String nameOfPillots = "jerry";
    private int distanceTravelled = 5;

    public int getNumOfBlades() {
        return numOfBlades;
    }

    public void setNumOfBlades(int numOfBlades) {
        this.numOfBlades = numOfBlades;
    }

    public String getNameOfPillots() {
        return nameOfPillots;
    }

    public void setNameOfPillots(String nameOfPillots) {
        this.nameOfPillots = nameOfPillots;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    @Override
    public String toString() {
        return "Helicopter{" + "numOfBlades=" + numOfBlades + ", nameOfPillots=" + nameOfPillots + ", distanceTravelled=" + distanceTravelled + '}';
    }

    public Helicopter(int numOfBlades, String nameOfPillots, int distanceTravelled, String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
        this.numOfBlades = numOfBlades;
        this.nameOfPillots = nameOfPillots;
        this.distanceTravelled = distanceTravelled;
    }

    @Override
    public void move() {
        System.out.println("I move on air less than airplane height");
    }

    @Override
    public void capacity() {
        System.out.println("I have less capacity");
    }

    @Override
    public void price() {
        System.out.println("I'm cheaper than plane");
    }

    public void duration() {

        System.out.println("My duration varies on cost");
    }
}
