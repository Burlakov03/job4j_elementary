package ru.job4j.condition;

public class SwitchWeek {
    public static String numberOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default: name = "Ошибка";
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay(5));
        System.out.println(numberOfDay(8));
        System.out.println(numberOfDay(7));
        System.out.println(numberOfDay(1));
    }
}
