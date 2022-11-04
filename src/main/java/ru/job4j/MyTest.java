package ru.job4j;

public class MyTest {

    public static void main(String[] args) {
        int number = 808;
        int num1 = number / 100;
        int num2 = number % 100 / 10;
        int num3 = number % 10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        if (num3 == num2 && num2 == num1) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");

        }
    }

}
