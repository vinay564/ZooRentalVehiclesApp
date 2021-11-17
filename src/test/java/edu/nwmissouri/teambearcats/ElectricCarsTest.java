/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

//import static edu.nwmissouri.teambearcats.FuelCarsTest.instance;
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
public class ElectricCarsTest {

    public static ElectricCars instance;

    public ElectricCarsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        instance = new ElectricCars("Telsa", "Online Booking", 4, 5.6);
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
     * Test of getVehicleName method, of class ElectricCars.
     */
    @Test
    public void testGetVehicleName() {
        System.out.println("getVehicleName");
        String expResult = "Telsa";
        String result = instance.getVehicleName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setVehicleName method, of class ElectricCars.
     */
    @Test
    public void testSetVehicleName() {
        System.out.println("setVehicleName");
        String vehicleName = "";
        instance.setVehicleName(vehicleName);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumOfPassengers method, of class ElectricCars.
     */
    @Test
    public void testGetNumOfPassengers() {
        System.out.println("getNumOfPassengers");
        int expResult = 4;
        int result = instance.getNumOfPassengers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumOfPassengers method, of class ElectricCars.
     */
    @Test
    public void testSetNumOfPassengers() {
        System.out.println("setNumOfPassengers");
        int numOfPassengers = 0;
        instance.setNumOfPassengers(numOfPassengers);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of safetyMeasures method, of class ElectricCars.
     */
    @Test
    public void testSafetyMeasures() {
        System.out.println("safetyMeasures");
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of move method, of class ElectricCars.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of speed method, of class ElectricCars.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class ElectricCars.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ElectricCars.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class ElectricCars.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "ElectricCars{vehicleName=Telsa, numOfPassengers=4}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
