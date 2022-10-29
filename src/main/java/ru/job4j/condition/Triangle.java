package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc
                && ac + bc > ab
                && ab + bc > ac;
    }

    public static void main(String[] args) {
        System.out.println(Triangle.exist(6, 10, 5));
        System.out.println(Triangle.exist(5, 10, 5));
        System.out.println(Triangle.exist(5, 10, 6));
        System.out.println(Triangle.exist(6, 1, 12));
    }
}
