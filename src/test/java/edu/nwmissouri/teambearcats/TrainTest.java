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
 *  Test using TrainTest using JUnit5
 *  @author Sai Kaushik Beeram
 */
public class TrainTest {
    
    public TrainTest() {
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
     * Test of move method, of class Train.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Train instance = null;
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capacity method, of class Train.
     */
    @Test
    public void testCapacity() {
        System.out.println("capacity");
        Train instance = null;
        instance.capacity();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of price method, of class Train.
     */
    @Test
    public void testPrice() {
        System.out.println("price");
        Train instance = null;
        instance.price();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistanceTravelled method, of class Train.
     */
    @Test
    public void testGetDistanceTravelled() {
        System.out.println("getDistanceTravelled");
        Train instance = null;
        double expResult = 0.0;
        double result = instance.getDistanceTravelled();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistanceTravelled method, of class Train.
     */
    @Test
    public void testSetDistanceTravelled() {
        System.out.println("setDistanceTravelled");
        double distanceTravelled = 0.0;
        Train instance = null;
        instance.setDistanceTravelled(distanceTravelled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfCoaches method, of class Train.
     */
    @Test
    public void testGetNumOfCoaches() {
        System.out.println("getNumOfCoaches");
        Train instance = null;
        int expResult = 0;
        int result = instance.getNumOfCoaches();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfCoaches method, of class Train.
     */
    @Test
    public void testSetNumOfCoaches() {
        System.out.println("setNumOfCoaches");
        int numOfCoaches = 0;
        Train instance = null;
        instance.setNumOfCoaches(numOfCoaches);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketPrice method, of class Train.
     */
    @Test
    public void testGetTicketPrice() {
        System.out.println("getTicketPrice");
        Train instance = null;
        double expResult = 0.0;
        double result = instance.getTicketPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketPrice method, of class Train.
     */
    @Test
    public void testSetTicketPrice() {
        System.out.println("setTicketPrice");
        double ticketPrice = 0.0;
        Train instance = null;
        instance.setTicketPrice(ticketPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Train.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Train instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
