package ru.job4j.condition;

public class MathAbsUsage {
    public static void main(String[] args) {
        int numb1 = 10;
        int numb2 = 3;
        int rsl = numb2 - numb1;
        System.out.println("j - i = " + rsl);
        int abs = Math.abs(rsl);
        System.out.println("|j - i| = " + abs);
    }
}
