package edu.eci.arcn.solid.isp.bad;

/**
 * Developer implementation that violates ISP by being forced to implement
 * an eat() method that doesn't make sense for its context.
 *
 * @author Iván Sánchez
 * @version 1.0
 * @since 2026-02-07
 */
public class Developer implements Worker {

    /**
     * Performs development work.
     */
    @Override
    public void work() {
        System.out.println("Escribiendo código...");
    }

    /**
     * Throws UnsupportedOperationException because developers don't have fixed lunch schedules.
     * Violates ISP by being forced to implement an irrelevant method.
     *
     * @throws UnsupportedOperationException always thrown
     */
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Sin horario fijo de almuerzo.");
    }
}
