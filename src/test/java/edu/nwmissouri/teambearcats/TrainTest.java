/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import static edu.nwmissouri.teambearcats.JetBoatTest.instance;
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
          public static Train instance;

    public TrainTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
          instance = new Train(2.4, 5, 3.9, "train", "Yes", 2.3);

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
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of capacity method, of class Train.
     */
    @Test
    public void testCapacity() {
        System.out.println("capacity");
        instance.capacity();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of price method, of class Train.
     */
    @Test
    public void testPrice() {
        System.out.println("price");
        instance.price();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDistanceTravelled method, of class Train.
     */
    @Test
    public void testGetDistanceTravelled() {
        System.out.println("getDistanceTravelled");
        double expResult = 0.0;
        double result = instance.getDistanceTravelled_miles();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDistanceTravelled method, of class Train.
     */
    @Test
    public void testSetDistanceTravelled() {
        System.out.println("setDistanceTravelled");
        double distanceTravelled = 0.0;
        instance.setDistanceTravelled_miles(distanceTravelled);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumOfCoaches method, of class Train.
     */
    @Test
    public void testGetNumOfCoaches() {
        System.out.println("getNumOfCoaches");
        int expResult = 0;
        int result = instance.getNumOfCoaches();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumOfCoaches method, of class Train.
     */
    @Test
    public void testSetNumOfCoaches() {
        System.out.println("setNumOfCoaches");
        int numOfCoaches = 0;
        instance.setNumOfCoaches(numOfCoaches);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTicketPrice method, of class Train.
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
     * Test of setTicketPrice method, of class Train.
     */
    @Test
    public void testSetTicketPrice() {
        System.out.println("setTicketPrice");
        double ticketPrice = 0.0;
        instance.setTicketPrice(ticketPrice);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Train.
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
