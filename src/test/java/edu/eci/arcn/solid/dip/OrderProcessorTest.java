package edu.eci.arcn.solid.dip;

import edu.eci.arcn.solid.dip.good.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Dependency Inversion Principle implementation.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
class OrderProcessorTest {

    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testOrderProcessorWithMySQLDatabase() {
        Database database = new MySQLDatabase();
        OrderProcessor processor = new OrderProcessor(database);

        processor.processOrder();

        String output = outputStream.toString();
        assertTrue(output.contains("Procesando pedido"));
        assertTrue(output.contains("MySQL"));

        System.setOut(System.out);
    }

    @Test
    void testOrderProcessorWithPostgreSQLDatabase() {
        Database database = new PostgreSQLDatabase();
        OrderProcessor processor = new OrderProcessor(database);

        processor.processOrder();

        String output = outputStream.toString();
        assertTrue(output.contains("Procesando pedido"));
        assertTrue(output.contains("PostgreSQL"));

        System.setOut(System.out);
    }

    @Test
    void testDatabaseAbstractionAllowsSwapping() {
        Database mysqlDb = new MySQLDatabase();
        Database postgresDb = new PostgreSQLDatabase();

        OrderProcessor processor1 = new OrderProcessor(mysqlDb);
        OrderProcessor processor2 = new OrderProcessor(postgresDb);

        assertNotNull(processor1);
        assertNotNull(processor2);
    }

    @Test
    void testCustomDatabaseImplementation() {
        Database customDb = () -> System.out.println("Guardando en base de datos personalizada...");
        OrderProcessor processor = new OrderProcessor(customDb);

        processor.processOrder();

        String output = outputStream.toString();
        assertTrue(output.contains("Procesando pedido"));
        assertTrue(output.contains("personalizada"));

        System.setOut(System.out);
    }

    @Test
    void testDependencyInjection() {
        Database database = new MySQLDatabase();
        OrderProcessor processor = new OrderProcessor(database);

        assertNotNull(processor);
        assertDoesNotThrow(() -> processor.processOrder());

        System.setOut(System.out);
    }

    @Test
    void testMySQLDatabaseImplementsInterface() {
        MySQLDatabase mysqlDb = new MySQLDatabase();
        assertTrue(mysqlDb instanceof Database);
    }

    @Test
    void testPostgreSQLDatabaseImplementsInterface() {
        PostgreSQLDatabase postgresDb = new PostgreSQLDatabase();
        assertTrue(postgresDb instanceof Database);
    }
}
