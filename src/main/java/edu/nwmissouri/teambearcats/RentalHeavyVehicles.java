/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 * RentalHeavyVehicles class (derived subclass of the superclass
 * ZooRentalVehiclesApp)
 *
 * @author Sai Kaushik Beeram
 */
public abstract class RentalHeavyVehicles {

    protected String vehicleName = "HeavyVehicles";
    protected String carryHeavyLoad = "carryingHeavyLoad";
    protected double vehicleWeight = 2000.50;

    public RentalHeavyVehicles(String vehicleName, String carryHeavyLoad, double vehicleWeight) {
        this.vehicleName = vehicleName;
        this.carryHeavyLoad = carryHeavyLoad;
        this.vehicleWeight = vehicleWeight;
    }

    /**
     * move() - general method for vehicle movement
     */
    public abstract void move();

    /**
     * capacity() - general method for vehicle capacity
     */
    public abstract void capacity();

    /**
     * price() - general method for vehicle price
     */
    public abstract void price();

    public String getVehicleName() {
        return vehicleName;
    }

    public String getCarryHeavyLoad() {
        return carryHeavyLoad;
    }

    public double getVehicleWeight() {
        return vehicleWeight;
    }

}
