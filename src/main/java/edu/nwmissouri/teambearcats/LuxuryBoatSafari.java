/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import java.util.Arrays;

/**
 *This class defines RentalHeavyVehicles 
 * @author Sai Kaushik Beeram
 */
public class LuxuryBoatSafari extends RentalHeavyVehicles{
    
    private double ticketPrice_dollars;
    private int numOfPassengers;
    private double distanceTravelled_miles;
   
    /**
 * LuxuryBoatSafari constructor
 * @param vehicleName is LuxuaryBoatSafari
 * @param carryHeavyLoad it carries large number of passengers
 * @param vehicleWeight LuxuarBoat is of HeavyWeight 
 */
   

    
   

    public LuxuryBoatSafari(double ticketPrice_dollars, int numOfPassengers, double distanceTravelled_miles, String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
        this.ticketPrice_dollars = ticketPrice_dollars;
        this.numOfPassengers = numOfPassengers;
        this.distanceTravelled_miles = distanceTravelled_miles;
    }

    public double getTicketPrice() {
        return ticketPrice_dollars;
    }

    public void setTicketPrice(double ticketPrice_dollars) {
        this.ticketPrice_dollars = ticketPrice_dollars;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
    
    public double getDistanceTraveled() {
        return distanceTravelled_miles;
    }
    
    public void setDistanceTraveled(double distanceTravelled_miles) {
        this.distanceTravelled_miles = distanceTravelled_miles;
    }
    /**
     * move() - general method for vehicle movement 
     */
    @Override
    public void move(){
        System.out.println("I  have travelled "+distanceTravelled_miles);
    }

    /**
     * capacity() - general method for vehicle capacity
     */
    @Override
    public void capacity() {
        System.out.println("I have capacity of " +numOfPassengers);
    }

    /**
     * price() - general method for vehicle price
     */
    @Override
    public void price() {
        System.out.println("My cost is " + ticketPrice_dollars);
    }

    public static void main(String[] args) {

        LuxuryBoatSafari luxuryBoatSafariObj = new LuxuryBoatSafari(2.4, 5, 3.9, "LuxuryBoatSafari", "Yes", 2.3);

        luxuryBoatSafariObj.move();
        luxuryBoatSafariObj.capacity();
        luxuryBoatSafariObj.price();

    }
    /*
    exceptionMethod()-for exceptions
    */
    public static void exceptionMethod(){
    int x= 1;
    int y= 0;
   

     try {
            System.out.printf("About to divide %d by %d...", x, y);
             var result = x/y;
            System.out.println();

        } catch (ArithmeticException ex) {
            System.out.println("ERROR toString():       " + ex.toString());
            System.out.println("ERROR class:            " + ex.getClass());
            System.out.println("ERROR localized message:" + ex.getClass());
            System.out.println("ERROR message:          " + ex.getMessage());
            System.out.println("ERROR stacktrace:     \n" + Arrays.toString(ex.getStackTrace()));
        }

    }

    /**
     * toString() of LuxuryBoatSafari 
     * @return 
     */
    @Override
    public String toString() {
        return "LuxuryBoatSafari{" + "ticketPrice_dollars=" + ticketPrice_dollars + ", numOfPassengers=" + numOfPassengers + ", distanceTravelled_miles=" + distanceTravelled_miles + '}';
    }
    
  
      
}
