package edu.eci.arcn.solid.lsp.good;

/**
 * Base Vehicle interface that all vehicles must implement.
 * Contains only common behavior shared by all vehicle types.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public interface Vehicle {

    /**
     * Drives the vehicle.
     */
    void drive();
}
