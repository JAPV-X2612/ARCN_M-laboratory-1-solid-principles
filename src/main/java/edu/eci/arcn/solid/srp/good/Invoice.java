package edu.eci.arcn.solid.srp.good;

/**
 * Invoice class that follows the Single Responsibility Principle. This class is responsible only
 * for representing invoice data and calculating totals.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
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

    public String getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public double calculateTotal() {
        return amount * 1.21;
    }
}
