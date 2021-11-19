/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import java.util.Arrays;

/**
 * Bicycle class (derived subclass of the superclass RentalLightVehicles)
 *
 * @author Vinay Manavarthi
 */
public class Bicycle extends RentalLightVehicles {

    private int numOfWheels;
    private double priceIn_dollars;

    /**
     * Bicycle Constructor
     *
     * @param numOfWheels - This is the number of wheels for bicycles
     * @param priceIn_dollars - Bus carries the heavy load
     * @param vehicleName - This is vehicleName
     * * @param booking - This is for ticket booking
     * * @param numOfPassengers - This is numOfPassengers in the bus
     */
    public Bicycle(int numOfWheels, double priceIn_dollars, String vehicleName, String booking, int numOfPassengers, Double numOfMiles) {
        super(vehicleName, booking, numOfPassengers, numOfMiles);
        this.numOfWheels = numOfWheels;
        this.priceIn_dollars = priceIn_dollars;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public double getPriceIn_dollars() {
        return priceIn_dollars;
    }

    public void setPriceIn_dollars(double priceIn_dollars) {
        this.priceIn_dollars = priceIn_dollars;
    }

    /**
     * The move method
     */
    @Override
    public void move() {
        System.out.println("I  have " + numOfWheels + " wheels to move on road");
    }

    /**
     * The speed method
     */
    @Override
    public void speed() {
        System.out.println("My cost is $" + priceIn_dollars);
    }

    /**
     * The Gear method.
     *
     */
    public void gear() {
        System.out.println("Im a gear bicycle ");
    }
    
    
  /*
    exceptionMethod()-for exceptions
    */
    public static void exceptionMethod(){
    int num1= 1;
    int num2= 0;
   

     try {
            System.out.printf("About to divide %d by %d...", num2, num1);
             var result = num1/num2;
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
    
    

    public static void main(String[] args) {

        Bicycle bicycleObj = new Bicycle(2, 3.3, "bicycle", "Yes", 1, 3.4);

        bicycleObj.gear();
        bicycleObj.move();
        bicycleObj.speed();

    }

    @Override
    public String toString() {
        return "Bicycle{" + "numOfWheels=" + numOfWheels + ", priceIn_dollars=" + priceIn_dollars + '}';
    }

}
