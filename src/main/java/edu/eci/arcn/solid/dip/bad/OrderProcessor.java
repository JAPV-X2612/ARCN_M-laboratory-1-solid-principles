package edu.eci.arcn.solid.dip.bad;

/**
 * Order processor that violates the Dependency Inversion Principle.
 * Depends directly on a concrete implementation (MySQLDatabase) instead of an abstraction.
 *
 * @author Iván Sánchez
 * @version 1.0
 * @since 2026-02-07
 */
public class OrderProcessor {
    private MySQLDatabase database;

    /**
     * Constructs an OrderProcessor with a hardcoded MySQL dependency.
     * Violates DIP by depending on a concrete class.
     */
    public OrderProcessor() {
        this.database = new MySQLDatabase();
    }

    /**
     * Processes an order and saves it to the database.
     */
    public void processOrder() {
        System.out.println("Procesando pedido...");
        database.saveOrder();
    }
}
