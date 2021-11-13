/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * Bicycle class (derived subclass of the superclass RentalLightVehicles)
 *
 * @author Vinay Manavarthi
 */
public class Bicycle extends RentalLightVehicles {

    private int numOfWheels ;
    private double priceIn_dollars ;

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
        System.out.println("I  have "+numOfWheels+ " wheels to move on road");
    }

    /**
     * The speed method
     */

    @Override
    public void speed() {
        System.out.println("My cost is $"+priceIn_dollars);
    }

    /**
     * The Gear method.
     *
     */
    public void gear() {
        System.out.println("Im a gear bicycle ");
    }

    public static void main(String[] args) {

        Bicycle bicycleObj = new Bicycle(2,3.3,"bicycle","Yes",1,3.4);
       
        bicycleObj.gear();
        bicycleObj.move();
        bicycleObj.speed();
     
    }

    @Override
    public String toString() {
        return "Bicycle{" + "numOfWheels=" + numOfWheels + ", priceIn_dollars=" + priceIn_dollars + '}';
    }

}
