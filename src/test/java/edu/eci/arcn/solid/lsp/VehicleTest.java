package edu.eci.arcn.solid.lsp;

import edu.eci.arcn.solid.lsp.good.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Liskov Substitution Principle implementation.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
class VehicleTest {

    @Test
    void testGasolineCarCanDrive() {
        Vehicle vehicle = new GasolineCar();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        vehicle.drive();

        assertTrue(outputStream.toString().contains("Conduciendo"));
        System.setOut(System.out);
    }

    @Test
    void testElectricCarCanDrive() {
        Vehicle vehicle = new ElectricCar();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        vehicle.drive();

        assertTrue(outputStream.toString().contains("Conduciendo"));
        System.setOut(System.out);
    }

    @Test
    void testGasolineCarCanRefuel() {
        GasolineCar gasolineCar = new GasolineCar();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        gasolineCar.refuel();

        assertTrue(outputStream.toString().contains("Repostando"));
        System.setOut(System.out);
    }

    @Test
    void testElectricCarCanRecharge() {
        ElectricCar electricCar = new ElectricCar();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        electricCar.recharge();

        assertTrue(outputStream.toString().contains("Recargando"));
        System.setOut(System.out);
    }

    @Test
    void testRefuelableInterface() {
        Refuelable refuelable = new GasolineCar();
        assertNotNull(refuelable);
    }

    @Test
    void testRechargeableInterface() {
        Rechargeable rechargeable = new ElectricCar();
        assertNotNull(rechargeable);
    }

    @Test
    void testVehiclePolymorphism() {
        Vehicle[] vehicles = {
            new GasolineCar(),
            new ElectricCar()
        };

        for (Vehicle vehicle : vehicles) {
            assertDoesNotThrow(() -> vehicle.drive());
        }
    }
}
