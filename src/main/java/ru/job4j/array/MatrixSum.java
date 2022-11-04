package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] numbers : array) {
            for (int number : numbers) {
                rsl += number;
            }
        }
        return rsl;
    }
}
