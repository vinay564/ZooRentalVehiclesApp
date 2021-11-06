/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * Bus class (derived subclass of the superclass RentalHeavyVehicles)
 * @author Vinay Manavarthi
 * 
 */
public class Bus extends RentalHeavyVehicles {
        
      private int numOfWheels = 8 ;
      private double ticketPrice = 5.0;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Bus{" + "numOfWheels=" + numOfWheels + ", ticketPrice=" + ticketPrice + '}';
    }
    /**
     * Bus Constructor
     * 
     * @param vehicleName - This is the vehicle name of the BUS
     * @param carryHeavyLoad - Bus carries the heavy load
     * @param vehicleWeight - This is vehicle weight
     */
    public Bus(String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
    }
      
      
    
   /**
    * return seatingCapacity
    * @return 
    */
      public int seatingCapacity(){
          return 1;
    }
    
       /**
    * return consumes fuel Type
    * @return 
    */
    public void consumes(){
         System.out.println("I consumes more fuel");
    } 
      @Override
    public void move(){
     System.out.println("I wan to move move! move!");
      
    }

    @Override
    public void capacity() {
    System.out.println("My capacity is 2 ");    
    }

    @Override
    public void price() {
           System.out.println("My price is very less");   
    }

    
}
