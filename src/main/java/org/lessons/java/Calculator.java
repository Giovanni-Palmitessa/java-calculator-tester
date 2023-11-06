package org.lessons.java;

public class Calculator {
    //Metodi
    //Add
    public static float add(float num1, float num2){
        return num1 + num2;
    }
    //Subtract
    public static float subtract(float num1, float num2){
        return num1 - num2;
    }
    //Divide
    public static float divide(float num1, float num2){
        if (num2 == 0) {
            throw new IllegalArgumentException("Il dividendo non può essere 0!");
        }
        return num1 / num2;
    }
    //Divide
    public static float multiply(float num1, float num2){
        return num1 * num2;
    }
}
