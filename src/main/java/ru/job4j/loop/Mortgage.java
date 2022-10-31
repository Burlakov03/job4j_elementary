package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int countYear = 0;
        while (amount > 0) {
            amount += amount / 100 * percent;
            amount -= salary;
            countYear++;
        }
        return countYear;
    }
}
