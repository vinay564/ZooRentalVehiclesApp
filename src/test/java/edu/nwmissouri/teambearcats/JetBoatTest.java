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
 *  Test using JetBoatTest using JUnit5
 *  @author Rajashekhar Kota
 */
public class JetBoatTest {
    
    public JetBoatTest() {
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
     * Test of move method, of class JetBoat.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        JetBoat instance = null;
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of speed method, of class JetBoat.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        JetBoat instance = null;
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of safetyMeasures method, of class JetBoat.
     */
    @Test
    public void testSafetyMeasures() {
        System.out.println("safetyMeasures");
        JetBoat instance = null;
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of experience method, of class JetBoat.
     */
    @Test
    public void testExperience() {
        System.out.println("experience");
        JetBoat instance = null;
        instance.experience();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketPrice method, of class JetBoat.
     */
    @Test
    public void testGetTicketPrice() {
        System.out.println("getTicketPrice");
        JetBoat instance = null;
        double expResult = 0.0;
        double result = instance.getTicketPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketPrice method, of class JetBoat.
     */
    @Test
    public void testSetTicketPrice() {
        System.out.println("setTicketPrice");
        double ticketPrice = 0.0;
        JetBoat instance = null;
        instance.setTicketPrice(ticketPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistanceTravelled method, of class JetBoat.
     */
    @Test
    public void testGetDistanceTravelled() {
        System.out.println("getDistanceTravelled");
        JetBoat instance = null;
        double expResult = 0.0;
        double result = instance.getDistanceTravelled();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistanceTravelled method, of class JetBoat.
     */
    @Test
    public void testSetDistanceTravelled() {
        System.out.println("setDistanceTravelled");
        double distanceTravelled = 0.0;
        JetBoat instance = null;
        instance.setDistanceTravelled(distanceTravelled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class JetBoat.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        JetBoat instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
