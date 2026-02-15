package edu.eci.arcn.solid.isp.bad;

/**
 * Worker interface that violates the Interface Segregation Principle.
 * Forces all implementations to implement methods they might not need.
 *
 * @author Iván Sánchez
 * @version 1.0
 * @since 2026-02-07
 */
public interface Worker {

    /**
     * Performs work tasks.
     */
    void work();

    /**
     * Takes a meal break.
     * Violates ISP by forcing all workers to implement eating behavior.
     */
    void eat();
}
