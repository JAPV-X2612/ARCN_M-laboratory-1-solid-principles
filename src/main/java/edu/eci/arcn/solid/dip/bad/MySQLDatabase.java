package edu.eci.arcn.solid.dip.bad;

/**
 * Concrete MySQL database implementation.
 * High-level modules depend directly on this low-level module, violating DIP.
 *
 * @author Iván Sánchez
 * @version 1.0
 * @since 2026-02-07
 */
public class MySQLDatabase {

    /**
     * Saves an order to MySQL database.
     */
    public void saveOrder() {
        System.out.println("Guardando pedido en MySQL...");
    }
}
