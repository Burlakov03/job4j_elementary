package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int left = 4;
        int right = 43;
        System.out.println("Max number: " + Max.max(left, right));
    }
}
