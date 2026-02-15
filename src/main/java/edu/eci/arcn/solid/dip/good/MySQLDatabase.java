package edu.eci.arcn.solid.dip.good;

/**
 * MySQL implementation of the Database interface.
 * Follows DIP by implementing an abstraction.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class MySQLDatabase implements Database {

    /**
     * Saves an order to MySQL database.
     */
    @Override
    public void saveOrder() {
        System.out.println("Guardando pedido en MySQL...");
    }
}
