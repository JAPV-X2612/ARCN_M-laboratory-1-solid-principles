package edu.eci.arcn.solid.lsp.good;

/**
 * Gasoline-powered car that implements Vehicle and Refuelable.
 * Follows LSP by only implementing applicable interfaces.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class GasolineCar implements Vehicle, Refuelable {

    /**
     * Drives the gasoline car.
     */
    @Override
    public void drive() {
        System.out.println("Conduciendo coche de gasolina...");
    }

    /**
     * Refuels the gasoline car.
     */
    @Override
    public void refuel() {
        System.out.println("Repostando gasolina...");
    }
}
