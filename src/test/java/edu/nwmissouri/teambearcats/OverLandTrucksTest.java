/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

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
    
    public OverLandTrucksTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
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
        OverLandTrucks instance = null;
        int expResult = 0;
        int result = instance.getNumOfWheels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfWheels method, of class OverLandTrucks.
     */
    @Test
    public void testSetNumOfWheels() {
        System.out.println("setNumOfWheels");
        int numOfWheels = 0;
        OverLandTrucks instance = null;
        instance.setNumOfWheels(numOfWheels);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice_dollar method, of class OverLandTrucks.
     */
    @Test
    public void testGetPrice_dollar() {
        System.out.println("getPrice_dollar");
        OverLandTrucks instance = null;
        double expResult = 0.0;
        double result = instance.getPrice_dollar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice_dollar method, of class OverLandTrucks.
     */
    @Test
    public void testSetPrice_dollar() {
        System.out.println("setPrice_dollar");
        double ticketPrice = 0.0;
        OverLandTrucks instance = null;
        instance.setPrice_dollar(ticketPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class OverLandTrucks.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        OverLandTrucks instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seatingCapacity method, of class OverLandTrucks.
     */
    @Test
    public void testSeatingCapacity() {
        System.out.println("seatingCapacity");
        OverLandTrucks instance = null;
        int expResult = 0;
        int result = instance.seatingCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consumes method, of class OverLandTrucks.
     */
    @Test
    public void testConsumes() {
        System.out.println("consumes");
        OverLandTrucks instance = null;
        instance.consumes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class OverLandTrucks.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        OverLandTrucks instance = null;
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capacity method, of class OverLandTrucks.
     */
    @Test
    public void testCapacity() {
        System.out.println("capacity");
        OverLandTrucks instance = null;
        instance.capacity();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of price method, of class OverLandTrucks.
     */
    @Test
    public void testPrice() {
        System.out.println("price");
        OverLandTrucks instance = null;
        instance.price();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of color method, of class OverLandTrucks.
     */
    @Test
    public void testColor() {
        System.out.println("color");
        OverLandTrucks instance = null;
        instance.color();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
