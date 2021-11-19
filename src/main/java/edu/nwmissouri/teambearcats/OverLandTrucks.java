/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import java.util.Arrays;

/**
 * OverLandtrucks class (derived subclass of the superclass RentalHeavyVehicles)
 *
 * @author Pranay Bhargav reddy Bakaram (S545147)
 *
 */
public class OverLandTrucks extends RentalHeavyVehicles {

    private int numOfWheels;
    private double ticketPrice_dollars;

    /**
     * OverLandTrucks Constructor
     *
     * @param vehicleName - This is the vehicle name of the BUS
     * @param carryHeavyLoad - Bus carries the heavy load
     * @param vehicleWeight - This is vehicle weight
     */
    public OverLandTrucks(int numOfWheels, double ticketPrice_dollars, String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
        this.numOfWheels = numOfWheels;
        this.ticketPrice_dollars = ticketPrice_dollars;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public double getTicketPrice() {
        return ticketPrice_dollars;
    }

    public void setTicketPrice(double ticketPrice_dollars) {
        this.ticketPrice_dollars = ticketPrice_dollars;
    }


    /**
     * return seatingCapacity
     *
     * @return
     */
    public int seatingCapacity() {
        return 1;
    }

    //consumes method.
    public void consumes() {
        System.out.println("I consume more "+FuelType.DIESEL);
    }
    /*
    overriding move method
    */
    @Override
    public void move() {
        System.out.println("I Have "+ this.numOfWheels + " wheels to move");

    }
    /*
    overriding capacity method
    */
    @Override
    public void capacity() {
        System.out.println("I Carries Heavy Load");
    }
    /*
    overriding price method.
    */
    @Override
    public void price() {
        System.out.println("My Ticket Price is $" +this.ticketPrice_dollars );
    }
    
    

    public static void main(String[] args) {

        OverLandTrucks Obj = new OverLandTrucks(8,4.5,"BMW", "IM carrying Heavy load", 5000.00);

        Obj.capacity();
        Obj.consumes();
        Obj.price();
        Obj.move();

    }
    /*
    exceptionMethod()-for exceptions
    */
    public static void exceptionMethod(){
    int a= 1;
    int b= 0;
   

     try {
            System.out.printf("About to divide %d by %d...", a, b);
             var result = a/b;
            System.out.println();
           // var result = a / b;

        } catch (ArithmeticException ex) {
            System.out.println("ERROR toString():       " + ex.toString());
            System.out.println("ERROR class:            " + ex.getClass());
            System.out.println("ERROR localized message:" + ex.getClass());
            System.out.println("ERROR message:          " + ex.getMessage());
            System.out.println("ERROR stacktrace:     \n" + Arrays.toString(ex.getStackTrace()));
        }

    }
    /**
     * return String
     * @return 
     */
    
    @Override
    public String toString() {
        return "OverLandTrucks{" + "numOfWheels=" + numOfWheels + ", ticketPrice=" + ticketPrice_dollars + "}";
    }

}
