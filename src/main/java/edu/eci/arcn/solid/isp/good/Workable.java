package edu.eci.arcn.solid.isp.good;

/**
 * Interface for entities that can perform work.
 * Segregated from eating behavior following ISP.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public interface Workable {

    /**
     * Performs work tasks.
     */
    void work();
}
