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
}
