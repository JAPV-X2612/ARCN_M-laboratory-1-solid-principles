package edu.eci.arcn.solid.ocp;

import edu.eci.arcn.solid.ocp.good.DiscountCalculator;
import edu.eci.arcn.solid.ocp.good.DiscountStrategy;
import edu.eci.arcn.solid.ocp.good.RegularCustomerDiscount;
import edu.eci.arcn.solid.ocp.good.VIPCustomerDiscount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Open/Closed Principle implementation.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
class DiscountCalculatorTest {

    private DiscountCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new DiscountCalculator(new RegularCustomerDiscount());
    }

    @Test
    void testRegularCustomerDiscountCalculation() {
        double discount = calculator.calculateDiscount(100.0);
        assertEquals(10.0, discount, 0.01);
    }

    @Test
    void testVIPCustomerDiscountCalculation() {
        calculator.setDiscountStrategy(new VIPCustomerDiscount());
        double discount = calculator.calculateDiscount(100.0);
        assertEquals(20.0, discount, 0.01);
    }

    @Test
    void testStrategyCanBeChangedAtRuntime() {
        assertEquals(10.0, calculator.calculateDiscount(100.0), 0.01);

        calculator.setDiscountStrategy(new VIPCustomerDiscount());
        assertEquals(20.0, calculator.calculateDiscount(100.0), 0.01);
    }

    @Test
    void testCustomDiscountStrategy() {
        DiscountStrategy customStrategy = price -> price * 0.15;
        calculator.setDiscountStrategy(customStrategy);

        double discount = calculator.calculateDiscount(100.0);
        assertEquals(15.0, discount, 0.01);
    }

    @Test
    void testZeroDiscountForZeroPrice() {
        double discount = calculator.calculateDiscount(0.0);
        assertEquals(0.0, discount, 0.01);
    }

    @Test
    void testRegularDiscountForLargeAmount() {
        double discount = calculator.calculateDiscount(1000.0);
        assertEquals(100.0, discount, 0.01);
    }
}
