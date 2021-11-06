/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *OpenTopVehicles class (derived subclass of the superclass RentalLightvehicles)
 * 
 * @author Pranay Bhargav Reddy Bakaram (s545147)
 */
public class OpenTopVehicles extends RentalLightVehicles {
    private int numOfWheels = 4;
    private double price=0.0;
    private double mile=0.0;

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

    public double getMile() {
        return mile;
    }

    public void setMile(double mile) {
        this.mile = mile;
    }

    @Override
    public String toString() {
        return "OpenTopVechiles{" + "numOfWheels=" + numOfWheels + ", price=" + price + ", mile=" + mile + '}';
    }

    /**
     * OpenTopVehicles constructor
     * @param vehicleName - The Name of the vehicle
     * @param booking -  The Different booking systems
     * @param numOfPassengers - Number of Passengers who travel
     * @param numOfMiles - Number of Miles car travels
     */
    public OpenTopVehicles(String vehicleName, String booking, int numOfPassengers, Double numOfMiles) {
        super(vehicleName, booking, numOfPassengers, numOfMiles);
    }
   /**
    * using move() method.
    */
    @Override
    public void move() {
        System.out.println("The OpenTopvehicles which is available in the Zoo moves on road. By using them visitors can enjoy the natural air ");
    }
    /*
    using Speed() method.
    */
    @Override
    public void speed() {
        System.out.println("The Top speed of the OpenTopvechiles is 240kmph");
    }
    
    
    }