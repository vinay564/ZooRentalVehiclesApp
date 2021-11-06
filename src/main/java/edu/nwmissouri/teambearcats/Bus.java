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
        
       int numOfWheels ;
       double ticketPrice ;
    
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
