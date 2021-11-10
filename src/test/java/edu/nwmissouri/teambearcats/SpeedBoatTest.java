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
 *
 * @author Vinay Manavarthi
 */
public class SpeedBoatTest {
    
    public SpeedBoatTest() {
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
     * Test of move method, of class SpeedBoat.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        SpeedBoat instance = null;
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of speed method, of class SpeedBoat.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        SpeedBoat instance = null;
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NumberOfSeats method, of class SpeedBoat.
     */
    @Test
    public void testNumberOfSeats() {
        System.out.println("NumberOfSeats");
        SpeedBoat instance = null;
        instance.NumberOfSeats();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketprice method, of class SpeedBoat.
     */
    @Test
    public void testGetTicketprice() {
        System.out.println("getTicketprice");
        SpeedBoat instance = null;
        double expResult = 0.0;
        double result = instance.getTicketprice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketprice method, of class SpeedBoat.
     */
    @Test
    public void testSetTicketprice() {
        System.out.println("setTicketprice");
        double ticketprice = 0.0;
        SpeedBoat instance = null;
        instance.setTicketprice(ticketprice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistanceTravelled method, of class SpeedBoat.
     */
    @Test
    public void testGetDistanceTravelled() {
        System.out.println("getDistanceTravelled");
        SpeedBoat instance = null;
        double expResult = 0.0;
        double result = instance.getDistanceTravelled();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistanceTravelled method, of class SpeedBoat.
     */
    @Test
    public void testSetDistanceTravelled() {
        System.out.println("setDistanceTravelled");
        double distanceTravelled = 0.0;
        SpeedBoat instance = null;
        instance.setDistanceTravelled(distanceTravelled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfPassengers method, of class SpeedBoat.
     */
    @Test
    public void testGetNumOfPassengers() {
        System.out.println("getNumOfPassengers");
        SpeedBoat instance = null;
        int expResult = 0;
        int result = instance.getNumOfPassengers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfPassengers method, of class SpeedBoat.
     */
    @Test
    public void testSetNumOfPassengers() {
        System.out.println("setNumOfPassengers");
        int numOfPassengers = 0;
        SpeedBoat instance = null;
        instance.setNumOfPassengers(numOfPassengers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SpeedBoat.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SpeedBoat instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
