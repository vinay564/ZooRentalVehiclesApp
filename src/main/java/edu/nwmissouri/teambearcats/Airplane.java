/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *
 * @author Satish Vagulapuram
 */
public class Airplane extends RentalHeavyVehicles {

    private int distanceTravelled = 4;
    private double ticketPrice = 0.0;
    private int noOfWings = 2;

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNoOfWings() {
        return noOfWings;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    @Override
    public String toString() {
        return "Airplane{" + "distanceTravelled=" + distanceTravelled + ", ticketPrice=" + ticketPrice + ", noOfWings=" + noOfWings + '}';
    }

    public Airplane(String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
    }

    @Override
    public void move() {
        System.out.println("I move on air");
    }

    @Override
    public void capacity() {
        System.out.println("I have more passenger capacity");
    }

    @Override
    public void price() {
        System.out.println("I'm costly");
    }

    public void foodMenu() {
        System.out.println("I provide food while travelling");
    }

}
