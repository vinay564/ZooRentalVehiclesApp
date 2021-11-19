/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import static edu.nwmissouri.teambearcats.FuelCars.exceptionMethod;
import java.util.Arrays;

/**
 * Electric class (derived subclass of the superclass RentalLightvehicles)
 *
 * @author Nikhil Porika
 */
public class ElectricCars extends RentalLightVehicles {

    private String vehicleName;
    private int numOfPassengers;
    //  private double mile;

    /*
    exceptionMethod()-for exceptions
     */
    public static void exceptionMethod() {
        int i = 1;
        int j = 0;

        try {
            System.out.printf("About to divide %d by %d...", i, j);
            var result = i / j;
            System.out.println();
            // var result = i / j;

        } catch (ArithmeticException ex) {
            System.out.println("ERROR toString():       " + ex.toString());
            System.out.println("ERROR class:            " + ex.getClass());
            System.out.println("ERROR localized message:" + ex.getClass());
            System.out.println("ERROR message:          " + ex.getMessage());
            System.out.println("ERROR stacktrace:     \n" + Arrays.toString(ex.getStackTrace()));
        }

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
        this.vehicleName = vehicleName;
        this.numOfPassengers = numOfPassengers;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    /*
    safetyMeasures() cars provides safety measures
     */
    public void safetyMeasures() {
        System.out.println("Electric cars has more safety by provding airbags");
    }

    @Override
    public void move() {
        System.out.println("I have " + this.vehicleName + " to move");
    }

    @Override
    public void speed() {
        System.out.println("This Electric car travels with good amount of speed by giving a good milage ");
    }

    public static void main(String[] args) {

        ElectricCars elec_Obj = new ElectricCars("Telsa", "Online Bookin", 5, 43.343);

        elec_Obj.move();
        elec_Obj.speed();
        exceptionMethod();

    }

    /*
    toString method for the fuelcars vehicle class
     */
    @Override
    public String toString() {
        return "ElectricCars{" + "vehicleName=" + vehicleName + ", numOfPassengers=" + numOfPassengers + '}';
    }

}
