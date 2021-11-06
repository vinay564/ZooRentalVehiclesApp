/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.teambearcats;

/**
 *
 * @author S545147 Pranay Bhargav Reddy Bakaram
 */
public class OpenTopVehicles extends RentalLightVehicles {
    

    

/*
    overiding speed() from RentalLightVehicles class.
    */
    @Override
    public void speed(){
        System.out.printf("I'm %s. I'm an Okapi!");
    }
/*
    overiding move() from Animal Class.
    */
    @Override
    public void move() {
        System.out.println("hop hop hop");
    }
    
    public void eat(){
        System.out.println("I eat plants");
    }
    /*
    This method will initialize the values and calls the addition method.
    */
    public void addition() {
        double a = 2.5;
        int b = 2;
        double c = getOkapiAddition(a, b);
        System.out.printf("I know OkapiAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }
    /**
   * This method will calculate the sum of two numbers
   * @param x double value which is passed from addition() 
   * @param y int value which is passed from addition()
   * @return it returns the sum of two numbers
   */
    public double getOkapiAddition(double x, int y) {
        return x + y;
    }

    public static void main(String[] args)
    {
    /**
     * The application's entry point
     * This is the main method which makes use of addition,speak,move method and enumerated types.
     * @param args an array of command-line arguments for the application
    */

        OpenTopVehicles a;
        a = new OpenTopVehicles("Pranay Bhargav Reddy Bakaram");
        a.speak();
        a.move();
        a.eat();
        a.addition();
    }
}
