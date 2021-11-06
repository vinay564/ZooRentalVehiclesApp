/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *
 * @author Vinay Manavarthi
 */
public class Bicycle extends RentalLightVehicles {
    public int numOfWheels = 2;
    public double priceIn_dollars = 200;
    
     public void timeLimit(){
         System.out.println("I Have to move quick");
    } 

    @Override
    public void move() {
       System.out.println("I wan to move move! move!");
    }

    @Override
    public void speed() {
          System.out.println("I am moving overspeed!");
    }
    
  
   
   
    
}
