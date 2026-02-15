package edu.eci.arcn.solid.srp.good;

/**
 * Handles the presentation logic for invoices.
 * Responsible only for printing invoice information.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class InvoicePrinter {

    /**
     * Prints the invoice details to console.
     *
     * @param invoice the invoice to print
     */
    public void print(Invoice invoice) {
        System.out.println("Factura para: " + invoice.getCustomer());
        System.out.println("Total: " + invoice.calculateTotal());
    }
}
