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
 * Test using ElectricCars using JUnit5
 *
 * @author Nikhil Porika
 */
public class FuelCarsTest {

    public static FuelCars instance;

    public FuelCarsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        instance = new FuelCars("audi", "Offline Booking", 6, 65.6);
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
     * Test of getNumOfPassengers method, of class FuelCars.
     */
    @Test
    public void testGetNumOfPassengers() {
        System.out.println("getNumOfPassengers");
        int expResult = 6;
        int result = instance.getNumOfPassengers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumOfPassengers method, of class FuelCars.
     */
    @Test
    public void testSetNumOfPassengers() {
        System.out.println("setNumOfPassengers");
        int numOfPassengers = 0;
        instance.setNumOfPassengers(numOfPassengers);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumOfMiles method, of class FuelCars.
     */
    @Test
    public void testGetNumOfMiles() {
        System.out.println("getNumOfMiles");
        double expResult = 0.0;
        double result = instance.getNumOfMiles();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumOfMiles method, of class FuelCars.
     */
    @Test
    public void testSetNumOfMiles() {
        System.out.println("setNumOfMiles");
        double numOfMiles = 0.0;
        instance.setNumOfMiles(numOfMiles);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of move method, of class FuelCars.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of speed method, of class FuelCars.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of carModel method, of class FuelCars.
     */
    @Test
    public void testCarModel() {
        System.out.println("carModel");
        instance.carModel();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class FuelCars.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FuelCars.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class FuelCars.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "FuelCars{numOfPassengers=6, numOfMiles=0.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
