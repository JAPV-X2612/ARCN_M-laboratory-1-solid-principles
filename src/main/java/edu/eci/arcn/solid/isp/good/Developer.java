package edu.eci.arcn.solid.isp.good;

/**
 * Developer that implements both Workable and Eatable interfaces.
 * Follows ISP by implementing all relevant interfaces for a human worker.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class Developer implements Workable, Eatable {

    /**
     * Performs development work.
     */
    @Override
    public void work() {
        System.out.println("Escribiendo código...");
    }

    /**
     * Takes a meal break.
     */
    @Override
    public void eat() {
        System.out.println("Tomando descanso para almorzar...");
    }
}
