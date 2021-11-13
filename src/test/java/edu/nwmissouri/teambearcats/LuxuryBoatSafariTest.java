/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import static edu.nwmissouri.teambearcats.AirplaneTest.instance;
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
               public static LuxuryBoatSafari instance;

    public LuxuryBoatSafariTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    instance = new LuxuryBoatSafari(2.4, 5, 3.9, "LuxuryBoatSafari", "Yes", 2.3);

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
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of capacity method, of class LuxuryBoatSafari.
     */
    @Test
    public void testCapacity() {
        System.out.println("capacity");
        instance.capacity();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of price method, of class LuxuryBoatSafari.
     */
    @Test
    public void testPrice() {
        System.out.println("price");
        instance.price();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTicketPrice method, of class LuxuryBoatSafari.
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
     * Test of setTicketPrice method, of class LuxuryBoatSafari.
     */
    @Test
    public void testSetTicketPrice() {
        System.out.println("setTicketPrice");
        double ticketPrice = 0.0;
        instance.setTicketPrice(ticketPrice);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumOfPassengers method, of class LuxuryBoatSafari.
     */
    @Test
    public void testGetNumOfPassengers() {
        System.out.println("getNumOfPassengers");
        int expResult = 0;
        int result = instance.getNumOfPassengers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumOfPassengers method, of class LuxuryBoatSafari.
     */
    @Test
    public void testSetNumOfPassengers() {
        System.out.println("setNumOfPassengers");
        int numOfPassengers = 0;
        instance.setNumOfPassengers(numOfPassengers);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDistanceTraveled method, of class LuxuryBoatSafari.
     */
    @Test
    public void testGetDistanceTraveled() {
        System.out.println("getDistanceTraveled");
        double expResult = 0.0;
        double result = instance.getDistanceTraveled();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDistanceTraveled method, of class LuxuryBoatSafari.
     */
    @Test
    public void testSetDistanceTraveled() {
        System.out.println("setDistanceTraveled");
        double distancetraveled = 0.0;
        instance.setDistanceTraveled(distancetraveled);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class LuxuryBoatSafari.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
