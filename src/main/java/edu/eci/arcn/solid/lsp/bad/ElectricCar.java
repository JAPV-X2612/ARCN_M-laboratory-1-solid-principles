package edu.eci.arcn.solid.lsp.bad;

/**
 * Electric car that violates LSP by throwing an exception for inherited behavior.
 * Cannot be properly substituted for the base Car class.
 *
 * @author Iván Sánchez
 * @version 1.0
 * @since 2026-02-07
 */
public class ElectricCar extends Car {

    /**
     * Throws UnsupportedOperationException because electric cars don't use fuel.
     *
     * @throws UnsupportedOperationException always thrown
     */
    @Override
    public void refuel() {
        throw new UnsupportedOperationException("Los coches eléctricos no usan combustible.");
    }
}
