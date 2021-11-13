/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * OpenTopVehicles class (derived subclass of the superclass RentalLightVehicles)
 *
 * @author Pranay Bhargav Reddy Bakaram (S545147)
 */
public class OpenTopVehicles extends RentalLightVehicles {

    private int numOfWheels ;
    private double priceIn_dollars ;

    /**
     * OpenTopVehicles Constructor
     *
     * @param numOfWheels - This is the number of wheels for bicycles
     * @param priceIn_dollars - Bus carries the heavy load
     * @param vehicleName - This is vehicleName
     * * @param booking - This is for ticket booking
     * * @param numOfPassengers - This is numOfPassengers in the bus
     */
    public OpenTopVehicles(int numOfWheels, double priceIn_dollars, String vehicleName, String booking, int numOfPassengers, Double numOfMiles) {
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
        System.out.println("I  have "+numOfWheels+ " wheels to move on road");
    }

    /**
     * The speed method
     */

    @Override
    public void speed() {
        System.out.println("My Top speed is 200Mph.My cost is $"+priceIn_dollars);
    }

    /**
     * The color method.
     *
     */
    public void color() {
        System.out.println("The color of the vehicle is "+VehicleColor.SILVER);
    }

    public static void main(String[] args) {

        OpenTopVehicles Obj = new OpenTopVehicles(4,10.3,"OpenTopVehicle","Yes",1,3.4);
       
        Obj.color();
        Obj.move();
        Obj.speed();
     
    }

    @Override
    public String toString() {
        return "OpenTopVehicles{" + "numOfWheels=" + numOfWheels + ", priceIn_dollars=" + priceIn_dollars + '}';
    }

}
