package edu.eci.arcn.solid.ocp.good;

/**
 * Discount calculator that follows the Open/Closed Principle.
 * Uses strategy pattern to allow extension without modification.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class DiscountCalculator {
    private DiscountStrategy discountStrategy;

    /**
     * Constructs a DiscountCalculator with a specific discount strategy.
     *
     * @param discountStrategy the strategy to use for calculating discounts
     */
    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    /**
     * Calculates the discount using the configured strategy.
     *
     * @param price the original price
     * @return the discount amount
     */
    public double calculateDiscount(double price) {
        return discountStrategy.calculateDiscount(price);
    }

    /**
     * Sets a new discount strategy.
     *
     * @param discountStrategy the new strategy to use
     */
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
