/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import static edu.nwmissouri.teambearcats.LuxuryBoatSafariTest.instance;
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
                   public static SpeedBoat instance;

    public SpeedBoatTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        instance = new SpeedBoat("NewBoat","online",1224,55.2);

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
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of speed method, of class SpeedBoat.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of NumberOfSeats method, of class SpeedBoat.
     */
    @Test
    public void testNumberOfSeats() {
        System.out.println("NumberOfSeats");
        instance.NumberOfSeats();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTicketprice method, of class SpeedBoat.
     */
    @Test
    public void testGetTicketprice() {
        System.out.println("getTicketprice");
        double expResult = 0.0;
        double result = instance.getTicketprice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTicketprice method, of class SpeedBoat.
     */
    @Test
    public void testSetTicketprice() {
        System.out.println("setTicketprice");
        double ticketprice = 0.0;
        instance.setTicketprice(ticketprice);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDistanceTravelled method, of class SpeedBoat.
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
     * Test of setDistanceTravelled method, of class SpeedBoat.
     */
    @Test
    public void testSetDistanceTravelled() {
        System.out.println("setDistanceTravelled");
        double distanceTravelled = 0.0;
        instance.setDistanceTravelled(distanceTravelled);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumOfPassengers method, of class SpeedBoat.
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
     * Test of setNumOfPassengers method, of class SpeedBoat.
     */
    @Test
    public void testSetNumOfPassengers() {
        System.out.println("setNumOfPassengers");
        int numOfPassengers = 0;
        instance.setNumOfPassengers(numOfPassengers);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class SpeedBoat.
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
