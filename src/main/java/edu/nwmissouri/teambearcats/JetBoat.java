/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *JetBoat (derived subclass from the superclass RentalLightVehicles)
 * @author Rajashekhar Kota
 */
public class JetBoat extends RentalLightVehicles {
    private double ticketPrice = 65.56;
    private double distanceTravelled = 55.76;
    
    /**
     * used constructor for JetBoat
     * @param vehicleName
     * @param booking
     * @param numOfPassengers
     * @param numOfMiles 
     */

    public JetBoat(String vehicleName, String booking, int numOfPassengers, Double numOfMiles) {
        super(vehicleName, booking, numOfPassengers, numOfMiles);
        this.ticketPrice = ticketPrice;
        this.distanceTravelled = distanceTravelled;
    }
    
    /**
     * getter method is used for TicketPrice
     * @return 
     */
    public double getTicketPrice() {
        return ticketPrice;
    }
    
    /**
     * setter method is used for TicketPrice
     * @param ticketPrice 
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
    /**
     * getter method is used for DistanceTravelled
     * @return 
     */
    public double getDistanceTravelled() {
        return distanceTravelled;
    }
    
    /**
     * setter method is used for DistanceTravelled
     * @param distanceTravelled 
     */
    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }



    /**
     * move() - general method for vehicle movement
     */
    @Override
    public void move() {
        System.out.println("jetboat moves faster than speedboat");
    }
    
    /**
     * speed() - general method for vehicle speed
     */
    @Override
    public void speed() {
        System.out.println("The Average speed of the jetboat is 80km/hr");
    }
    
    /**
     * safetyMeasures() - general method for passengers safety
     */
    
    public void safetyMeasures(){
        System.out.println("SfetyMeasures must be included");
    } 
    /**
     * experience() - general method for experience
     */
    public void experience(){
        System.out.println("operator must have experience");
    }

    public static void main(String[] args){
    JetBoat jetboatObj = new JetBoat("jetboat", "yes", 6, 75.44);
    jetboatObj.move();
    jetboatObj.speed();
    jetboatObj.safetyMeasures();
    jetboatObj.experience();
    }
    
    @Override
    public String toString() {
        return "JetBoat{" + "ticketPrice=" + ticketPrice + ", distanceTravelled=" + distanceTravelled + '}';
    }
    
    
    
}
