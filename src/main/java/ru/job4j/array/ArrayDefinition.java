package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Петр";
        names[1] = "Андрей";
        names[2] = "Иван";
        names[3] = "Олег";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
