/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import static edu.nwmissouri.teambearcats.ElectricCarsTest.instance;
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
       public static Helicopter instance;

    public HelicopterTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
                  instance = new Helicopter(4, "Jerry", 4, 55.0, "Heli", "Yes", 50.0);

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
        int expResult = 4;
        int result = instance.getNumOfBlades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumOfBlades method, of class Helicopter.
     */
    @Test
    public void testSetNumOfBlades() {
        System.out.println("setNumOfBlades");
        int numOfBlades = 0;
        instance.setNumOfBlades(numOfBlades);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNameOfPillots method, of class Helicopter.
     */
    @Test
    public void testGetNameOfPillots() {
        System.out.println("getNameOfPillots");
        String expResult = "";
        String result = instance.getNameOfPillots();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNameOfPillots method, of class Helicopter.
     */
    @Test
    public void testSetNameOfPillots() {
        System.out.println("setNameOfPillots");
        String nameOfPillots = "";
        instance.setNameOfPillots(nameOfPillots);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDistanceTravelled method, of class Helicopter.
     */
    @Test
    public void testGetDistanceTravelled() {
        System.out.println("getDistanceTravelled");
        int expResult = 0;
        int result = instance.getDistanceTravelled_miles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDistanceTravelled method, of class Helicopter.
     */
    @Test
    public void testSetDistanceTravelled() {
        System.out.println("setDistanceTravelled");
        int distanceTravelled = 0;
        instance.setDistanceTravelled_miles(distanceTravelled);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Helicopter.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        String expResult ="Helicopter{numOfBlades=4, nameOfPillots=, distanceTravelled_miles=4 ,ticketPrice_dollars=55.0}";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of move method, of class Helicopter.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of capacity method, of class Helicopter.
     */
    @Test
    public void testCapacity() {
        System.out.println("capacity");
        instance.capacity();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of price method, of class Helicopter.
     */
    @Test
    public void testPrice() {
        System.out.println("price");
        instance.price();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of duration method, of class Helicopter.
     */
    @Test
    public void testDuration() {
        System.out.println("duration");
        instance.duration();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
