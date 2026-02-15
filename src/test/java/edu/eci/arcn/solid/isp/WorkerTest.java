package edu.eci.arcn.solid.isp;

import edu.eci.arcn.solid.isp.good.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Interface Segregation Principle implementation.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
class WorkerTest {

    @Test
    void testDeveloperCanWork() {
        Workable developer = new Developer();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        developer.work();

        assertTrue(outputStream.toString().contains("Escribiendo código"));
        System.setOut(System.out);
    }

    @Test
    void testDeveloperCanEat() {
        Developer developer = new Developer();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        developer.eat();

        assertTrue(outputStream.toString().contains("almorzar"));
        System.setOut(System.out);
    }

    @Test
    void testRobotCanWork() {
        Workable robot = new Robot();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        robot.work();

        assertTrue(outputStream.toString().contains("Robot trabajando"));
        System.setOut(System.out);
    }

    @Test
    void testRobotDoesNotImplementEatable() {
        Robot robot = new Robot();
        assertFalse(robot instanceof Eatable);
    }

    @Test
    void testDeveloperImplementsBothInterfaces() {
        Developer developer = new Developer();
        assertTrue(developer instanceof Workable);
        assertTrue(developer instanceof Eatable);
    }

    @Test
    void testWorkablePolymorphism() {
        Workable[] workers = {
            new Developer(),
            new Robot()
        };

        for (Workable worker : workers) {
            assertDoesNotThrow(() -> worker.work());
        }
    }

    @Test
    void testInterfaceSegregation() {
        Robot robot = new Robot();
        assertNotNull(robot);
        assertTrue(robot instanceof Workable);
        assertFalse(robot instanceof Eatable);
    }
}
