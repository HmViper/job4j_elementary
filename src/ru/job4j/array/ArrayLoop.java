package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        for (int index = 0; index < 4; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int index = 0; index < 4; index++) {
            System.out.println(numbers[index]);
        }
    }
}
