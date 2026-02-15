package edu.eci.arcn.solid.dip.good;

/**
 * Database abstraction interface.
 * High-level modules depend on this abstraction instead of concrete implementations.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public interface Database {

    /**
     * Saves an order to the database.
     */
    void saveOrder();
}
