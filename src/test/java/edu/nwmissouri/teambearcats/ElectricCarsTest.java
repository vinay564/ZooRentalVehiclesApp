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
 * Test using ElectricCars using JUnit5
 * @author Nikhil Porika
 */
public class ElectricCarsTest {
    
   public static ElectricCars instance;
    public ElectricCarsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
          instance = new ElectricCars("audi","Online Booking",4,5.6);
  
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
     * Test of getNumOfWheels method, of class ElectricCars.
     */
    @Test
    public void testGetNumOfWheels() {
        System.out.println("getNumOfWheels");
        int expResult = 0;
        int result = instance.getNumOfWheels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfWheels method, of class ElectricCars.
     */
    @Test
    public void testSetNumOfWheels() {
        System.out.println("setNumOfWheels");
        int numOfWheels = 0;
        instance.setNumOfWheels(numOfWheels);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ElectricCars.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 25.7;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class ElectricCars.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMile method, of class ElectricCars.
     */
    @Test
    public void testGetMile() {
        System.out.println("getMile");
        double expResult = 15.4;
        double result = instance.getMile();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMile method, of class ElectricCars.
     */
    @Test
    public void testSetMile() {
        System.out.println("setMile");
        double mile = 0.0;
        instance.setMile(mile);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ElectricCars.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "ElectricCars{numOfWheels=0, price=25.7, mile=15.4}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class ElectricCars.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of speed method, of class ElectricCars.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of safetyMeasures method, of class ElectricCars.
     */
    @Test
    public void testSafetyMeasures() {
        System.out.println("safetyMeasures");
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
