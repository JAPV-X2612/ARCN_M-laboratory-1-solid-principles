package edu.eci.arcn.solid.ocp.good;

/**
 * Discount strategy for VIP customers.
 * Applies a 20% discount.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class VIPCustomerDiscount implements DiscountStrategy {

    /**
     * Calculates 20% discount for VIP customers.
     *
     * @param price the original price
     * @return the discount amount (20% of price)
     */
    @Override
    public double calculateDiscount(double price) {
        return price * 0.20;
    }
}
