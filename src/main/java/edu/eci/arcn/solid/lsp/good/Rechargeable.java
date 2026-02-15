package edu.eci.arcn.solid.lsp.good;

/**
 * Interface for vehicles that can be recharged electrically.
 * Only electric vehicles should implement this.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public interface Rechargeable {

    /**
     * Recharges the vehicle's battery.
     */
    void recharge();
}
