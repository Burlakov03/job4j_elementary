package ru.job4j;

import java.util.Random;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void main(String[] args) {
        int x1, x2, y1, y2;
        Random random = new Random();

        for (byte i = 0; i < 5; i++) {
            x1 = random.nextInt(21) - 10;
            y1 = random.nextInt(21) - 10;
            x2 = random.nextInt(21) - 10;
            y2 = random.nextInt(21) - 10;
            System.out.println("result (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") " + Point.distance(x1, y1, x2, y2));
        }
    }
}
