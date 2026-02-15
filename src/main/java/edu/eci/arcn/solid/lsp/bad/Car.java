package edu.eci.arcn.solid.lsp.bad;

/**
 * Base Car class that violates the Liskov Substitution Principle.
 * Assumes all cars can be refueled, which is not true for electric cars.
 *
 * @author Iván Sánchez
 * @version 1.0
 * @since 2026-02-07
 */
public class Car {

    /**
     * Drives the car.
     */
    public void drive() {
        System.out.println("Conduciendo...");
    }

    /**
     * Refuels the car with gasoline.
     * This method assumes all cars use fuel, violating LSP.
     */
    public void refuel() {
        System.out.println("Repostando...");
    }
}
