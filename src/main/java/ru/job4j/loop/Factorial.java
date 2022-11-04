package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int number = 2; number <= n; number++) {
            result *= number;
        }
        return result;
    }
}
