/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * Bus class (derived subclass of the superclass RentalHeavyVehicles)
 *
 * @author Vinay Manavarthi
 *
 */
public class Bus extends RentalHeavyVehicles {

    private int numOfWheels;
    private double ticketPrice_dollars;

    /**
     * Bus Constructor
     *
     * @param vehicleName - This is the vehicle name of the BUS
     * @param carryHeavyLoad - Bus carries the heavy load
     * @param vehicleWeight - This is vehicle weight
     */
    public Bus(int numOfWheels, double ticketPrice_dollars, String vehicleName, String carryHeavyLoad, double vehicleWeight) {
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

    /**
     * return consumes fuel Type
     *
     * @return
     */
    public void consumes() {
        System.out.println("I consume more Diesel");
    }

    @Override
    public void move() {
        System.out.println("I Have "+ this.numOfWheels + " wheels to move");

    }

    @Override
    public void capacity() {
        System.out.println("Bus have 28 seats capacity");
    }

    @Override
    public void price() {
        System.out.println("My Ticket Price is $" +this.ticketPrice_dollars );
    }
    
    

    public static void main(String[] args) {

        Bus busObj = new Bus(8,4.5,"BMW", "IM carrying Heavy load", 5000.00);

        busObj.capacity();
        busObj.consumes();
        busObj.price();
        busObj.move();

    }
    /**
     * return String
     * @return 
     */
    
    @Override
    public String toString() {
        return "Bus{" + "numOfWheels=" + numOfWheels + ", ticketPrice=" + ticketPrice_dollars + "}";
    }

}
