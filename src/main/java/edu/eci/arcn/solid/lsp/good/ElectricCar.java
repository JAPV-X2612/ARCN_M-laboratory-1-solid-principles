package edu.eci.arcn.solid.lsp.good;

/**
 * Electric car that implements Vehicle and Rechargeable.
 * Follows LSP by only implementing applicable interfaces.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class ElectricCar implements Vehicle, Rechargeable {

    /**
     * Drives the electric car.
     */
    @Override
    public void drive() {
        System.out.println("Conduciendo coche eléctrico...");
    }

    /**
     * Recharges the electric car's battery.
     */
    @Override
    public void recharge() {
        System.out.println("Recargando batería...");
    }
}
