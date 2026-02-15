package edu.eci.arcn.solid.lsp.good;

/**
 * Interface for vehicles that can be refueled with gasoline.
 * Only gasoline-powered vehicles should implement this.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public interface Refuelable {

    /**
     * Refuels the vehicle with gasoline.
     */
    void refuel();
}
