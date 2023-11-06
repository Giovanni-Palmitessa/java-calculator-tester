package org.lessons.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    @DisplayName("Calculate Ticket price for Junior")
    void getTicketPrice() {
        Ticket ticket = new Ticket(50, 15);
        double price = ticket.getTicketPrice();
        assertEquals(8.4, price, 0.01);
        assertNotEquals(25,price,0.01);
    }
}