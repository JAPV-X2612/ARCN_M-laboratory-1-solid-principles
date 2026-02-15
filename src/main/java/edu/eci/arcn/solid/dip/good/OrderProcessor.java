package edu.eci.arcn.solid.dip.good;

/**
 * Order processor that follows the Dependency Inversion Principle.
 * Depends on the Database abstraction instead of concrete implementations.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class OrderProcessor {
    private Database database;

    /**
     * Constructs an OrderProcessor with dependency injection.
     * Follows DIP by depending on an abstraction.
     *
     * @param database the database implementation to use
     */
    public OrderProcessor(Database database) {
        this.database = database;
    }

    /**
     * Processes an order and saves it to the database.
     */
    public void processOrder() {
        System.out.println("Procesando pedido...");
        database.saveOrder();
    }
}
