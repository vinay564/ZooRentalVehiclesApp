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
 * Test using Bicycle using JUnit5
 * @author Vinay Manavarthi
 */
public class BicycleTest {
    
    public BicycleTest() {
    }
        public static Bicycle instance;
    
    @BeforeAll
    public static void setUpClass() {      
        instance = new Bicycle(2,4.5,"Bicycle","Online Booking",1,2.3);
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
     * Test of getNumOfWheels method, of class Bicycle.
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
     * Test of setNumOfWheels method, of class Bicycle.
     */
    @Test
    public void testSetNumOfWheels() {
        System.out.println("setNumOfWheels");
        int numOfWheels = 0;
        
        instance.setNumOfWheels(numOfWheels);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPriceIn_dollars method, of class Bicycle.
     */
//    @Test
//    public void testGetPriceIn_dollars() {
//        System.out.println("getPriceIn_dollars");
//      
//        double expResult = 0.0;
//        double result = instance.getPriceIn_dollars();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of setPriceIn_dollars method, of class Bicycle.
     */
    @Test
    public void testSetPriceIn_dollars() {
        System.out.println("setPriceIn_dollars");
        double priceIn_dollars = 0.0;
        instance.setPriceIn_dollars(priceIn_dollars);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Bicycle.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of move method, of class Bicycle.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of speed method, of class Bicycle.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of gear method, of class Bicycle.
     */
    @Test
    public void testGear() {
        System.out.println("gear");
        instance.gear();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
