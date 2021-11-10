/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import static edu.nwmissouri.teambearcats.ElectricCarsTest.instance;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author S545147
 */
public class OverLandTrucksTest {
      public static OverLandTrucks instance;
 
    public OverLandTrucksTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
           instance = new OverLandTrucks("OverLandTrucks"," Booking",5.6);

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
        // TODO review the generated test code and remove the default call to fail.
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
     * Test of getPrice_dollar method, of class OverLandTrucks.
     */
    @Test
    public void testGetPrice_dollar() {
        System.out.println("getPrice_dollar");
        double expResult = 0.0;
        double result = instance.getPrice_dollar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPrice_dollar method, of class OverLandTrucks.
     */
    @Test
    public void testSetPrice_dollar() {
        System.out.println("setPrice_dollar");
        double ticketPrice = 0.0;
        instance.setPrice_dollar(ticketPrice);
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

    /**
     * Test of color method, of class OverLandTrucks.
     */
    @Test
    public void testColor() {
        System.out.println("color");
        instance.color();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
