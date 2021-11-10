/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import static edu.nwmissouri.teambearcats.SpeedBoatTest.instance;
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
      public static JetBoat instance;

    public JetBoatTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
                instance = new JetBoat("NewBoat","online",1224,55.2);

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
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of speed method, of class JetBoat.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of safetyMeasures method, of class JetBoat.
     */
    @Test
    public void testSafetyMeasures() {
        System.out.println("safetyMeasures");
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of experience method, of class JetBoat.
     */
    @Test
    public void testExperience() {
        System.out.println("experience");
        instance.experience();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTicketPrice method, of class JetBoat.
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
     * Test of setTicketPrice method, of class JetBoat.
     */
    @Test
    public void testSetTicketPrice() {
        System.out.println("setTicketPrice");
        double ticketPrice = 0.0;
        instance.setTicketPrice(ticketPrice);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDistanceTravelled method, of class JetBoat.
     */
    @Test
    public void testGetDistanceTravelled() {
        System.out.println("getDistanceTravelled");
        double expResult = 0.0;
        double result = instance.getDistanceTravelled();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDistanceTravelled method, of class JetBoat.
     */
    @Test
    public void testSetDistanceTravelled() {
        System.out.println("setDistanceTravelled");
        double distanceTravelled = 0.0;
        instance.setDistanceTravelled(distanceTravelled);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class JetBoat.
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
