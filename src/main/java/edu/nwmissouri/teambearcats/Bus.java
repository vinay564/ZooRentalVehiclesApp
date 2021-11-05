/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *
 * @author Vinay Manavarthi
 */
public class Bus extends RentalHeavyVehicles {
        
       int numOfWheels = 6;
       double ticketPrice = 5.5;
    
   
      public int seatingCapacity(){
          return 1;
    }
    
    public void consumes(){
         System.out.println("I consumes more fuel");
    } 
        @Override
    public void move(){
     System.out.println("I wan to move move! move!");
      
    }

    @Override
    public void capacity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void price() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
