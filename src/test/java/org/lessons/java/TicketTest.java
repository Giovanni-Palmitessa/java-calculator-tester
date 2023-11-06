package org.lessons.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    @DisplayName("Calculate Ticket price for Junior")
    void getTicketPriceJ() {
        Ticket ticket = new Ticket(50, 15);
        double price = ticket.getTicketPrice();
        assertEquals(8.4, price, 0.01);
        assertNotEquals(25,price,0.01);
    }
    @Test
    @DisplayName("Calculate Ticket price for Senior")
    void getTicketPriceS() {
        Ticket ticket = new Ticket(150, 70);
        double price = ticket.getTicketPrice();
        assertEquals(18.9, price, 0.01);
        assertNotEquals(67,price,0.01);
    }
    @Test
    @DisplayName("Calculate Ticket price for Adult")
    void getTicketPriceA() {
        Ticket ticket = new Ticket(78, 42);
        double price = ticket.getTicketPrice();
        assertEquals(16.38, price, 0.01);
        assertNotEquals(152,price,0.01);
    }
}