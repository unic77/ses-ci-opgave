package org.example;

public class Calculator {
    int secondNumber;
    int firstNumber;

    public Calculator(int secondNumber, int firstNumber) {
        this.secondNumber = secondNumber;
        this.firstNumber = firstNumber;
    }

    public int add(){
        int returnWaarde = secondNumber + firstNumber;
        return returnWaarde;
    }
}
