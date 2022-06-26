package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int i) {
        return i - x;
    }

    public int divide(int i) {
        return i / x;
    }

    public int sumAllOperation(int i) {
        return sum(i) + this.multiply(i) + minus(i) + divide(i);
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(30);
        System.out.println(result);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(30);
        System.out.println(rsl);

        int resMin = minus(30);
        System.out.println(resMin);

        int divide = calculator.divide(30);
        System.out.println(divide);

        Calculator calcSumAll = new Calculator();
        double sumAll = calculator.sumAllOperation(30);
        System.out.println(sumAll);

    }

}
