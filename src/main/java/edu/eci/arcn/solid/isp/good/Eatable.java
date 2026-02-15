package edu.eci.arcn.solid.isp.good;

/**
 * Interface for entities that need to eat.
 * Segregated from work behavior following ISP.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public interface Eatable {

    /**
     * Takes a meal break.
     */
    void eat();
}
