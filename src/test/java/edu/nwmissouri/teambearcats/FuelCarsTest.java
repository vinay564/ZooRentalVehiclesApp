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
 * Test using FuelCars using JUnit5
 * @author Nikhil Porika
 */
public class FuelCarsTest {
       public static FuelCars instance;

    public FuelCarsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
         instance = new FuelCars("audi","Online Booking",4,5.6);
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
        int expResult = 0;
        int result = instance.getNumOfWheels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumOfWheels method, of class FuelCars.
     */
    @Test
    public void testSetNumOfWheels() {
        System.out.println("setNumOfWheels");
        int numOfWheels = 0;
        instance.setNumOfWheels(numOfWheels);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPrice method, of class FuelCars.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
         double expResult = 15.75;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPrice method, of class FuelCars.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isIsHavingAirBags method, of class FuelCars.
     */
    @Test
    public void testIsIsHavingAirBags() {
        System.out.println("isIsHavingAirBags");
        boolean expResult = false;
        boolean result = instance.isIsHavingAirBags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIsHavingAirBags method, of class FuelCars.
     */
    @Test
    public void testSetIsHavingAirBags() {
        System.out.println("setIsHavingAirBags");
        boolean IsHavingAirBags = false;
        instance.setIsHavingAirBags(IsHavingAirBags);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class FuelCars.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "FuelCars{numOfWheels=0, price=15.75, IsHavingAirBags=false}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of move method, of class FuelCars.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of speed method, of class FuelCars.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of carModel method, of class FuelCars.
     */
    @Test
    public void testCarModel() {
        System.out.println("carModel");
        instance.carModel();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
