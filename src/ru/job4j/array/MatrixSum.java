package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int index = 0; index < array.length; index++) {
            for (int indexInner = 0; indexInner < array[index].length; indexInner++) {
                rsl += array[index][indexInner];
            }

        }
        return rsl;
    }
}