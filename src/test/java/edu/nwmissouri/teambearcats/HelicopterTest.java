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
 *  Test using HelicopterTest using JUnit5
 * @author Satish Vagulapuram
 */
public class HelicopterTest {
    
    public HelicopterTest() {
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
     * Test of getNumOfBlades method, of class Helicopter.
     */
    @Test
    public void testGetNumOfBlades() {
        System.out.println("getNumOfBlades");
        Helicopter instance = null;
        int expResult = 0;
        int result = instance.getNumOfBlades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfBlades method, of class Helicopter.
     */
    @Test
    public void testSetNumOfBlades() {
        System.out.println("setNumOfBlades");
        int numOfBlades = 0;
        Helicopter instance = null;
        instance.setNumOfBlades(numOfBlades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNameOfPillots method, of class Helicopter.
     */
    @Test
    public void testGetNameOfPillots() {
        System.out.println("getNameOfPillots");
        Helicopter instance = null;
        String expResult = "";
        String result = instance.getNameOfPillots();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNameOfPillots method, of class Helicopter.
     */
    @Test
    public void testSetNameOfPillots() {
        System.out.println("setNameOfPillots");
        String nameOfPillots = "";
        Helicopter instance = null;
        instance.setNameOfPillots(nameOfPillots);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistanceTravelled method, of class Helicopter.
     */
    @Test
    public void testGetDistanceTravelled() {
        System.out.println("getDistanceTravelled");
        Helicopter instance = null;
        int expResult = 0;
        int result = instance.getDistanceTravelled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistanceTravelled method, of class Helicopter.
     */
    @Test
    public void testSetDistanceTravelled() {
        System.out.println("setDistanceTravelled");
        int distanceTravelled = 0;
        Helicopter instance = null;
        instance.setDistanceTravelled(distanceTravelled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Helicopter.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Helicopter instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Helicopter.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Helicopter instance = null;
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capacity method, of class Helicopter.
     */
    @Test
    public void testCapacity() {
        System.out.println("capacity");
        Helicopter instance = null;
        instance.capacity();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of price method, of class Helicopter.
     */
    @Test
    public void testPrice() {
        System.out.println("price");
        Helicopter instance = null;
        instance.price();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of duration method, of class Helicopter.
     */
    @Test
    public void testDuration() {
        System.out.println("duration");
        Helicopter instance = null;
        instance.duration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
