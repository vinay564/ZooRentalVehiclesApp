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
 * Test using LuxuryBoatSafariTest using JUnit5
 *  @author Sai Kaushik Beeram
 */
public class LuxuryBoatSafariTest {
    
    public LuxuryBoatSafariTest() {
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
     * Test of move method, of class LuxuryBoatSafari.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        LuxuryBoatSafari instance = null;
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capacity method, of class LuxuryBoatSafari.
     */
    @Test
    public void testCapacity() {
        System.out.println("capacity");
        LuxuryBoatSafari instance = null;
        instance.capacity();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of price method, of class LuxuryBoatSafari.
     */
    @Test
    public void testPrice() {
        System.out.println("price");
        LuxuryBoatSafari instance = null;
        instance.price();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketPrice method, of class LuxuryBoatSafari.
     */
    @Test
    public void testGetTicketPrice() {
        System.out.println("getTicketPrice");
        LuxuryBoatSafari instance = null;
        double expResult = 0.0;
        double result = instance.getTicketPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketPrice method, of class LuxuryBoatSafari.
     */
    @Test
    public void testSetTicketPrice() {
        System.out.println("setTicketPrice");
        double ticketPrice = 0.0;
        LuxuryBoatSafari instance = null;
        instance.setTicketPrice(ticketPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfPassengers method, of class LuxuryBoatSafari.
     */
    @Test
    public void testGetNumOfPassengers() {
        System.out.println("getNumOfPassengers");
        LuxuryBoatSafari instance = null;
        int expResult = 0;
        int result = instance.getNumOfPassengers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfPassengers method, of class LuxuryBoatSafari.
     */
    @Test
    public void testSetNumOfPassengers() {
        System.out.println("setNumOfPassengers");
        int numOfPassengers = 0;
        LuxuryBoatSafari instance = null;
        instance.setNumOfPassengers(numOfPassengers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistanceTraveled method, of class LuxuryBoatSafari.
     */
    @Test
    public void testGetDistanceTraveled() {
        System.out.println("getDistanceTraveled");
        LuxuryBoatSafari instance = null;
        double expResult = 0.0;
        double result = instance.getDistanceTraveled();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistanceTraveled method, of class LuxuryBoatSafari.
     */
    @Test
    public void testSetDistanceTraveled() {
        System.out.println("setDistanceTraveled");
        double distancetraveled = 0.0;
        LuxuryBoatSafari instance = null;
        instance.setDistanceTraveled(distancetraveled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LuxuryBoatSafari.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LuxuryBoatSafari instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
