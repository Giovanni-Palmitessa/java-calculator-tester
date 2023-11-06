package org.lessons.java;

public class Ticket {
    // Attributi
    private int kmToTravel;
    private int age;

    // Costruttore
    public Ticket(int kmToTravel, int age) {
        if (kmToTravel <= 0 || age <= 0) {
            throw new IllegalArgumentException("Inserire un valore valido maggiore di 0!");
        }
        this.kmToTravel = kmToTravel;
        this.age = age;
    }
    // Metodi
    public double getTicketPrice() {
        double ticketPrice = 0.21;
        double total = kmToTravel * ticketPrice;
        double discountJunior = 0.2;
        double discountSenior = 0.4;

        if (age < 18) {
            total -= total * discountJunior;
        } else if (age > 65) {
            total -= total * discountSenior;
        }
        return total;
    }
}
