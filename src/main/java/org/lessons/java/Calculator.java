package org.lessons.java;

public class Calculator {
    // Attributi
    private float num1;
    private float num2;

    //Getter e Setter

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    //Metodi
    //Add
    public float add(float num1, float num2){
        return num1 + num2;
    }
    //Subtract
    public float subtract(float num1, float num2){
        return num1 - num2;
    }
    //Divide
    public float divide(float num1, float num2){
        return num1 / num2;
    }
    //Divide
    public float multiply(float num1, float num2){
        return num1 * num2;
    }
}
