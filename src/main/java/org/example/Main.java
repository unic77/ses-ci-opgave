package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        int out = calc.add();
        System.out.println(out);
    }
}