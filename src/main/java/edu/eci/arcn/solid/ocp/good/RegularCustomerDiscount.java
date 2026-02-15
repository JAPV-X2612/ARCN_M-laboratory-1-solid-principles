package edu.eci.arcn.solid.ocp.good;

/**
 * Discount strategy for regular customers.
 * Applies a 10% discount.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class RegularCustomerDiscount implements DiscountStrategy {

    /**
     * Calculates 10% discount for regular customers.
     *
     * @param price the original price
     * @return the discount amount (10% of price)
     */
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10;
    }
}
