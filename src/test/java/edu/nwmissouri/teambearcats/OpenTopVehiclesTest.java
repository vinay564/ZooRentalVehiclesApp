/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import static edu.nwmissouri.teambearcats.OverLandTrucksTest.instance;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author S545147
 */
public class OpenTopVehiclesTest {

    public static OpenTopVehicles instance;

    public OpenTopVehiclesTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        instance = new OpenTopVehicles("audi", "Online Booking", 8, 5.6);

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
     * Test of getNumOfWheels method, of class OpenTopVehicles.
     */
    @Test
    public void testGetNumOfWheels() {
        System.out.println("getNumOfWheels");
        int expResult = 0;
        int result = instance.getNumOfWheels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumOfWheels method, of class OpenTopVehicles.
     */
    @Test
    public void testSetNumOfWheels() {
        System.out.println("setNumOfWheels");
        int numOfWheels = 0;
        instance.setNumOfWheels(numOfWheels);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPrice method, of class OpenTopVehicles.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPrice method, of class OpenTopVehicles.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMile method, of class OpenTopVehicles.
     */
    @Test
    public void testGetMile() {
        System.out.println("getMile");
        double expResult = 0.0;
        double result = instance.getMile();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMile method, of class OpenTopVehicles.
     */
    @Test
    public void testSetMile() {
        System.out.println("setMile");
        double mile = 0.0;
        instance.setMile(mile);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class OpenTopVehicles.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of move method, of class OpenTopVehicles.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of speed method, of class OpenTopVehicles.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
    }

}
