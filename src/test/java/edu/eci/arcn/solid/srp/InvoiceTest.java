package edu.eci.arcn.solid.srp;

import edu.eci.arcn.solid.srp.good.Invoice;
import edu.eci.arcn.solid.srp.good.InvoicePrinter;
import edu.eci.arcn.solid.srp.good.InvoiceRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Single Responsibility Principle implementation.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-15
 */
class InvoiceTest {

    private Invoice invoice;
    private InvoicePrinter printer;
    private InvoiceRepository repository;

    @BeforeEach
    void setUp() {
        invoice = new Invoice("John Doe", 100.0);
        printer = new InvoicePrinter();
        repository = new InvoiceRepository();
    }

    @Test
    void testInvoiceCalculatesCorrectTotal() {
        assertEquals(121.0, invoice.calculateTotal(), 0.01);
    }

    @Test
    void testInvoiceStoresCustomerName() {
        assertEquals("John Doe", invoice.getCustomer());
    }

    @Test
    void testInvoiceStoresAmount() {
        assertEquals(100.0, invoice.getAmount(), 0.01);
    }

    @Test
    void testInvoicePrinterOutputsCorrectFormat() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        printer.print(invoice);

        String output = outputStream.toString();
        assertTrue(output.contains("John Doe"));
        assertTrue(output.contains("121.0"));

        System.setOut(System.out);
    }

    @Test
    void testInvoiceRepositorySavesSuccessfully() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        repository.save(invoice);

        String output = outputStream.toString();
        assertTrue(output.contains("Guardando factura"));
        assertTrue(output.contains("John Doe"));

        System.setOut(System.out);
    }

    @Test
    void testSeparationOfConcerns() {
        assertNotNull(invoice);
        assertNotNull(printer);
        assertNotNull(repository);
    }
}
