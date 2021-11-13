/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import static edu.nwmissouri.teambearcats.BicycleTest.instance;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test using OverLandTrucks using JUnit5
 * @author Pranay Bhargav Reddy Bakaram (S545147)
 */
public class OverLandTrucksTest {
    
    public OverLandTrucksTest() {
    }
    
     public static OverLandTrucks instance;
    
    @BeforeAll
    public static void setUpClass() {     
                instance = new OverLandTrucks(8,4.5,"Volvo","Carrying heavy load",4.6);
     
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNumOfWheels method, of class OverLandTrucks.
     */
    @Test
    public void testGetNumOfWheels() {
        System.out.println("getNumOfWheels");
     
        int expResult = 0;
        int result = instance.getNumOfWheels();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumOfWheels method, of class OverLandTrucks.
     */
    @Test
    public void testSetNumOfWheels() {
        System.out.println("setNumOfWheels");
        int numOfWheels = 0;
        instance.setNumOfWheels(numOfWheels);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTicketPrice method, of class OverLandTrucks.
     */
    @Test
    public void testGetTicketPrice() {
        System.out.println("getTicketPrice");
        double expResult = 0.0;
        double result = instance.getTicketPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setTicketPrice method, of class OverLandTrucks.
     */
    @Test
    public void testSetTicketPrice() {
        System.out.println("setTicketPrice");
        double ticketPrice = 0.0;
        instance.setTicketPrice(ticketPrice);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class OverLandTrucks.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of seatingCapacity method, of class OverLandTrucks.
     */
    @Test
    public void testSeatingCapacity() {
        System.out.println("seatingCapacity");
        int expResult = 0;
        int result = instance.seatingCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consumes method, of class OverLandTrucks.
     */
    @Test
    public void testConsumes() {
        System.out.println("consumes");
      
        instance.consumes();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of move method, of class OverLandTrucks.
     */
    @Test
    public void testMove() {
        System.out.println("move");
      
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of capacity method, of class OverLandTrucks.
     */
    @Test
    public void testCapacity() {
        System.out.println("capacity");
        instance.capacity();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of price method, of class OverLandTrucks.
     */
    @Test
    public void testPrice() {
        System.out.println("price");
  
        instance.price();
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
