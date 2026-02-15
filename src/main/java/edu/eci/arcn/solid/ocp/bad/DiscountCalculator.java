package edu.eci.arcn.solid.ocp.bad;

/**
 * Discount calculator that violates the Open/Closed Principle.
 * Adding new customer types requires modifying this class.
 *
 * @author Iván Sánchez
 * @version 1.0
 * @since 2026-02-07
 */
public class DiscountCalculator {

    /**
     * Calculates discount based on customer type.
     *
     * @param customerType the type of customer
     * @param price the original price
     * @return the discount amount
     */
    public double calculateDiscount(String customerType, double price) {
        if (customerType.equals("Regular")) {
            return price * 0.10;
        } else if (customerType.equals("VIP")) {
            return price * 0.20;
        }
        return 0;
    }
}
