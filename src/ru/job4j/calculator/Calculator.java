package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static int sum(int a) {
        return x + a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public double divide(double a) {
        return a / x;
    }

    public double sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        System.out.println(Calculator.sum(five));
        System.out.println(Calculator.minus(five));
        System.out.println(Calculator.minus(five));
        System.out.println(calc.multiply(five));
        System.out.println(calc.divide(five));
        System.out.println(calc.sumAllOperation(five));
    }
}
