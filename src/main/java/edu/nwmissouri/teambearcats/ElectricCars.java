/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * Electric class (derived subclass of the superclass RentalLightvehicles)
 *
 * @author Nikhil Porika
 */
public class ElectricCars extends RentalLightVehicles {

    private int numOfWheels = 4;
    private double price_dollar = 25.70;
    private double mile = 15.40;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public double getPrice() {
        return price_dollar;
    }

    public void setPrice(double price) {
        this.price_dollar = price;
    }

    public double getMile() {
        return mile;
    }

    public void setMile(double mile) {
        this.mile = mile;
    }

    /*
    toString method for the fuelcars vehicle class
     */
    @Override
    public String toString() {
        return "ElectricCars{" + "numOfWheels=" + numOfWheels + ", price=" + price_dollar + ", mile=" + mile + '}';
    }

    /**
     * Electric Cars constructor
     *
     * @param vehicleName - The Name of the vehicle
     * @param booking - The Different booking systems
     * @param numOfPassengers - Number of Passengers who travel
     * @param numOfMiles - Number of Miles car travels
     */
    public ElectricCars(String vehicleName, String booking, int numOfPassengers, Double numOfMiles) {
        super(vehicleName, booking, numOfPassengers, numOfMiles);
    }

    /*
    move method definest the vehicle move type
     */
    @Override
    public void move() {
        System.out.println("The Electric car which is available in the Zoo can move in differe climatic conditions of zoo");
    }

    /*
    speed method defines the vehicle speed type
     */
    @Override
    public void speed() {
        System.out.println("In the Zoo the electric car can travel with a certain speed which is for the suitable to the zoo situations");
    }
    /*
    safetyMeasures() cars provides safety measures
    */
    public void safetyMeasures() {
        System.out.println("Electric cars has more safety by provding airbags");
    }
}
