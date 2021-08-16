package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String answer = "none";
        int multiply = left * right;
        int divide = left / right;
        int addition = left + right;
        int subtraction = left - right;
        if (multiply == rsl) {
            answer = "multiplied";
        }
        if (divide == rsl) {
            answer = "divided";
        }
        if (addition == rsl) {
            answer = "added";
        }
        if (subtraction == rsl) {
            answer = "subtracted";
        }
        return answer;
    }
}