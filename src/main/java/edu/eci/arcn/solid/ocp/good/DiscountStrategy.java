package edu.eci.arcn.solid.ocp.good;

/**
 * Strategy interface for calculating discounts.
 * Allows new discount strategies to be added without modifying existing code.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public interface DiscountStrategy {

    /**
     * Calculates the discount for a given price.
     *
     * @param price the original price
     * @return the discount amount
     */
    double calculateDiscount(double price);
}
