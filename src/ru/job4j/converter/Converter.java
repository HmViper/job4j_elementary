package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float inDollar = 120;
        float expectedEuro = 2;
        float expectedDollar = 2;
        float euro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = euro == expectedEuro;
        float dollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = dollar == expectedDollar;
        System.out.println("140 rubles are " + euro + " euro.Test result is: " + passedEuro);
        System.out.println("120 rubles are " + dollar + " dollar.Test result is: " + passedDollar);
    }
}
