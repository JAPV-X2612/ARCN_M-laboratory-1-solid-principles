package edu.eci.arcn.solid.isp.good;

/**
 * Robot that only implements Workable interface.
 * Demonstrates ISP by not being forced to implement eating behavior.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
public class Robot implements Workable {

    /**
     * Performs automated work tasks.
     */
    @Override
    public void work() {
        System.out.println("Robot trabajando...");
    }
}
