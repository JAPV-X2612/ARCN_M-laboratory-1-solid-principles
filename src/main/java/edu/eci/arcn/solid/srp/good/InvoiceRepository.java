package edu.eci.arcn.solid.srp.good;

/**
 * Handles the persistence logic for invoices.
 * Responsible only for saving invoices to the database.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class InvoiceRepository {

    /**
     * Saves the invoice to the database.
     *
     * @param invoice the invoice to save
     */
    public void save(Invoice invoice) {
        System.out.println("Guardando factura para " + invoice.getCustomer() + "...");
    }
}
