package ru.job4j;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        System.out.println("p = 6, k = 2, s = " + SqArea.square(6, 2));
    }
}
