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
 * Test using FuelCars using JUnit5
 * @author Nikhil Porika
 */
public class FuelCarsTest {
    
    public FuelCarsTest() {
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
     * Test of getNumOfWheels method, of class FuelCars.
     */
    @Test
    public void testGetNumOfWheels() {
        System.out.println("getNumOfWheels");
        FuelCars instance = null;
        int expResult = 0;
        int result = instance.getNumOfWheels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfWheels method, of class FuelCars.
     */
    @Test
    public void testSetNumOfWheels() {
        System.out.println("setNumOfWheels");
        int numOfWheels = 0;
        FuelCars instance = null;
        instance.setNumOfWheels(numOfWheels);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class FuelCars.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        FuelCars instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class FuelCars.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        FuelCars instance = null;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsHavingAirBags method, of class FuelCars.
     */
    @Test
    public void testIsIsHavingAirBags() {
        System.out.println("isIsHavingAirBags");
        FuelCars instance = null;
        boolean expResult = false;
        boolean result = instance.isIsHavingAirBags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsHavingAirBags method, of class FuelCars.
     */
    @Test
    public void testSetIsHavingAirBags() {
        System.out.println("setIsHavingAirBags");
        boolean IsHavingAirBags = false;
        FuelCars instance = null;
        instance.setIsHavingAirBags(IsHavingAirBags);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FuelCars.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FuelCars instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class FuelCars.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        FuelCars instance = null;
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of speed method, of class FuelCars.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        FuelCars instance = null;
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carModel method, of class FuelCars.
     */
    @Test
    public void testCarModel() {
        System.out.println("carModel");
        FuelCars instance = null;
        instance.carModel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
