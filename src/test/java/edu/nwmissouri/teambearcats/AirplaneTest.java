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
 * Test using AirplaneTest using JUnit5
 * @author Satish Vagulapuram
 */
public class AirplaneTest {
    
    public AirplaneTest() {
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
     * Test of getDistanceTravelled method, of class Airplane.
     */
    @Test
    public void testGetDistanceTravelled() {
        System.out.println("getDistanceTravelled");
        Airplane instance = null;
        int expResult = 0;
        int result = instance.getDistanceTravelled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistanceTravelled method, of class Airplane.
     */
    @Test
    public void testSetDistanceTravelled() {
        System.out.println("setDistanceTravelled");
        int distanceTravelled = 0;
        Airplane instance = null;
        instance.setDistanceTravelled(distanceTravelled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketPrice method, of class Airplane.
     */
    @Test
    public void testGetTicketPrice() {
        System.out.println("getTicketPrice");
        Airplane instance = null;
        double expResult = 0.0;
        double result = instance.getTicketPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketPrice method, of class Airplane.
     */
    @Test
    public void testSetTicketPrice() {
        System.out.println("setTicketPrice");
        double ticketPrice = 0.0;
        Airplane instance = null;
        instance.setTicketPrice(ticketPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoOfWings method, of class Airplane.
     */
    @Test
    public void testGetNoOfWings() {
        System.out.println("getNoOfWings");
        Airplane instance = null;
        int expResult = 0;
        int result = instance.getNoOfWings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoOfWings method, of class Airplane.
     */
    @Test
    public void testSetNoOfWings() {
        System.out.println("setNoOfWings");
        int noOfWings = 0;
        Airplane instance = null;
        instance.setNoOfWings(noOfWings);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Airplane.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Airplane instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Airplane.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Airplane instance = null;
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capacity method, of class Airplane.
     */
    @Test
    public void testCapacity() {
        System.out.println("capacity");
        Airplane instance = null;
        instance.capacity();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of price method, of class Airplane.
     */
    @Test
    public void testPrice() {
        System.out.println("price");
        Airplane instance = null;
        instance.price();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of foodMenu method, of class Airplane.
     */
    @Test
    public void testFoodMenu() {
        System.out.println("foodMenu");
        Airplane instance = null;
        instance.foodMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
