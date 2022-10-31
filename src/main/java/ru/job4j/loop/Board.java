package ru.job4j.loop;

public class Board {
    public static void paint(int weight, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < weight; cell++) {
                if ((row % 2 == 0 && cell % 2 != 0) || (row % 2 != 0 && cell % 2 == 0)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}