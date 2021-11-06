/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *SpeedBoat (derived subclass from the superclass RentalLightVehicles)
 * @author Rajasheekhar Kota
 */
public class SpeedBoat extends RentalLightVehicles
{
private double ticketprice=45.75;
private double distanceTravelled=75.44;
private int numOfPassengers = 6;

     /**
     * move() - general method for vehicle movement
     */
    @Override
    public void move() {
        System.out.println("SpeedBoat moves on water");
    }
    
    /**
     * speed() - general method for vehicle speed
     */
    @Override
    public void speed() {
        System.out.println("The average speed of the speedboat is 55km/hr");
    }
    /**
     * NumberOfSeats() - general method for Seats in JetBoat
     */
    public void NumberOfSeats(){
        System.out.println("number of seats in a jetboat.");
    }

    /**
     * getter is used forTicketPrice
     * @return 
     */
    public double getTicketprice() {
        return ticketprice;
    }

    /**
     * setter is used TicketPrice
     * @param ticketprice 
     */
    public void setTicketprice(double ticketprice) {
        this.ticketprice = ticketprice;
    }

    /**
     * getter is used for DistanceTravelled
     * @return 
     */
    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    /**
     * setter is used for DistanceTravelled
     * @param distanceTravelled 
     */
    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
    
    /**
     * used constructor for SpeedBoat
     * @param vehicleName
     * @param booking
     * @param numOfPassengers
     * @param numOfMiles 
     */
    public SpeedBoat(String vehicleName, String booking, int numOfPassengers, Double numOfMiles) {
        super(vehicleName, booking, numOfPassengers, numOfMiles);
    }

    @Override
    public String toString() {
        return "SpeedBoat{" + "ticketprice=" + ticketprice + ", distanceTravelled=" + distanceTravelled + ", numOfPassengers=" + numOfPassengers + '}';
    }
}
