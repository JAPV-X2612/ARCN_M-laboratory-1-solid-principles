package edu.eci.arcn.solid.dip.good;

/**
 * PostgreSQL implementation of the Database interface.
 * Demonstrates extensibility following DIP.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class PostgreSQLDatabase implements Database {

    /**
     * Saves an order to PostgreSQL database.
     */
    @Override
    public void saveOrder() {
        System.out.println("Guardando pedido en PostgreSQL...");
    }
}
