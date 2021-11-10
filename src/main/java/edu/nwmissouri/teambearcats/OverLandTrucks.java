/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * OverLandTrucks class (derived subclass of the superclass RentalHeavyvehicles)
 * @author s545147(Pranay Bhargav reddy Bakaram)
 */

public class OverLandTrucks extends RentalHeavyVehicles {
        
      private int numOfWheels =8 ;
      private double Price_dollar = 25.0 ;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public double getPrice_dollar() {
        return Price_dollar;
    }

    public void setPrice_dollar(double ticketPrice) {
        this.Price_dollar = Price_dollar;
    }

    @Override
    public String toString() {
        return "OverLandTrucks{" + "numOfWheels=" + numOfWheels + ", ticketPrice=" + Price_dollar + '}';
    }
    /**
     * OverLandTrucks Constructor
     * 
     * @param vehicleName - This is the vehicle name of the BUS
     * @param carryHeavyLoad - Bus carries the heavy load
     * @param vehicleWeight - This is vehicle weight
     */
    public OverLandTrucks(String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
    }
      
      
    
   /**
    * return seatingCapacity
    * @return 
    */
      public int seatingCapacity(){
          return 10;
    }
    
       /**
    * return consumes fuel Type
    * @return 
    */
    public void consumes(){
         System.out.println("I takes large amount of fuel when compared to lightvehicles. I takes "+);
    } 
    /**
     * using move method
     */
      @Override
    public void move(){
     System.out.println("I move on road and Carries heavy load");
      
    }
    /**
     * using capacity method
     */
    @Override
    public void capacity() {
    System.out.println("My capacity is 10 ");    
    }
    /**
     * using price method
     */
    @Override
    public void price() {
           System.out.println("My price is 80$ per hour in zoo. I am very cheap when compared to electric cars");   
    }
    /**
     * using color() method.
     */
    public void color(){
        System.out.println("The color of the truck is "+VehicleColor.BROWN);
    }
}
