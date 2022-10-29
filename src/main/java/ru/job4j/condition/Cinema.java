package ru.job4j.condition;

public class Cinema {
    public static void access(boolean age) {
        System.out.println("The age of the customer is : " + age);
        if (age) {
            System.out.println("Welcome to cinema");
        } else {
            System.out.println("It is not for you");
        }
    }

    public static void main(String[] args) {
        Cinema.access(true);
        Cinema.access(false);
    }
}
