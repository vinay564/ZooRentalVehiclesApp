/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import static edu.nwmissouri.teambearcats.HelicopterTest.instance;
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
           public static Airplane instance;

    public AirplaneTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
                          instance = new Airplane(2, 3.3, 3,"airplane", "Yes", 3.4);

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
        int expResult = 2;
        int result = instance.getDistanceTravelled_miles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDistanceTravelled method, of class Airplane.
     */
    @Test
    public void testSetDistanceTravelled() {
        System.out.println("setDistanceTravelled");
        int distanceTravelled = 0;
        instance.setDistanceTravelled_miles(distanceTravelled);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTicketPrice method, of class Airplane.
     */
    @Test
    public void testGetTicketPrice() {
        System.out.println("getTicketPrice");
        double expResult = 3.3;
        double result = instance.getTicketPrice_dollars();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTicketPrice method, of class Airplane.
     */
    @Test
    public void testSetTicketPrice() {
        System.out.println("setTicketPrice");
        double ticketPrice = 0.0;
        instance.setTicketPrice_dollars(ticketPrice);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNoOfWings method, of class Airplane.
     */
    @Test
    public void testGetNoOfWings() {
        System.out.println("getNoOfWings");
        int expResult = 3;
        int result = instance.getNoOfWings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNoOfWings method, of class Airplane.
     */
    @Test
    public void testSetNoOfWings() {
        System.out.println("setNoOfWings");
        int noOfWings = 0;
        instance.setNoOfWings(noOfWings);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Airplane.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        String expResult ="Airplane{ distanceTravelled_miles=2, ticketPrice_dollars=3.3, noOfWings=3}";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of move method, of class Airplane.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of capacity method, of class Airplane.
     */
    @Test
    public void testCapacity() {
        System.out.println("capacity");
        instance.capacity();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of price method, of class Airplane.
     */
    @Test
    public void testPrice() {
        System.out.println("price");
        instance.price();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of foodMenu method, of class Airplane.
     */
    @Test
    public void testFoodMenu() {
        System.out.println("foodMenu");
        instance.foodMenu();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}