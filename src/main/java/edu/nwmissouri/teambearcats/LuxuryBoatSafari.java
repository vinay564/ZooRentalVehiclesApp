/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *This class defines RentalHeavyVehicles 
 * @author Sai Kaushik Beeram
 */
public class LuxuryBoatSafari extends RentalHeavyVehicles{
    
    private double ticketPrice_dollar=15.75;
    private int numOfPassengers = 6;
    private double distancetraveled_miles = 2.2;
    
    
   
   /**
     * move() - general method for vehicle movement 
     */
    @Override
    public void move(){
        System.out.println("I travels on water");
    }

    /**
     * capacity() - general method for vehicle capacity
     */
    @Override
    public void capacity() {
        System.out.println("Vehicle passenger capacity");
    }

    /**
     * price() - general method for vehicle price
     */
    @Override
    public void price() {
        System.out.println("Price of the Vehicle ");
    }

    public double getTicketPrice() {
        return ticketPrice_dollar;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice_dollar = ticketPrice;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
    
    public double getDistanceTraveled() {
        return distancetraveled_miles;
    }
    
    public void setDistanceTraveled(double distancetraveled) {
        this.distancetraveled_miles = distancetraveled;
    }
    /**
     * tostring() of LuxuryBoatSafari 
     * @return 
     */
    @Override
    public String toString() {
        return "LuxuryBoatSafari{" + "ticketPrice=" + ticketPrice_dollar + ", numOfPassengers=" + numOfPassengers + '}';
    }
/**
 * LuxuryBoatSafari constructor
 * @param vehicleName is LuxuaryBoatSafari
 * @param carryHeavyLoad it carries large number of passengers
 * @param vehicleWeight LuxuarBoat is of HeavyWeight 
 */
    public LuxuryBoatSafari(String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        super(vehicleName, carryHeavyLoad, vehicleWeight);
    }
    
    
}
