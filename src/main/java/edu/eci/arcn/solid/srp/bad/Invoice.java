package edu.eci.arcn.solid.srp.bad;

/**
 * Invoice class that violates the Single Responsibility Principle by handling multiple
 * responsibilities: calculation, presentation, and persistence.
 *
 * @author Iván Sánchez
 * @version 1.0
 * @since 2026-02-07
 */
public class Invoice {
    private String customer;
    private double amount;

    /**
     * Constructs an Invoice with customer name and amount.
     *
     * @param customer the customer name
     * @param amount the invoice amount before tax
     */
    public Invoice(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    /**
     * Calculates the total amount including 21% tax.
     *
     * @return the total amount with tax applied
     */
    public double calculateTotal() {
        return amount * 1.21;
    }

    /**
     * Prints the invoice details to console.
     * Violates SRP by mixing business logic with presentation logic.
     */
    public void printInvoice() {
        System.out.println("Factura para: " + customer);
        System.out.println("Total: " + calculateTotal());
    }

    /**
     * Saves the invoice to database.
     * Violates SRP by mixing business logic with persistence logic.
     */
    public void saveToDatabase() {
        System.out.println("Guardando factura...");
    }
}
