package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages: " + ages.length + System.lineSeparator()
                + "Размер массива surname: " + surnames.length + System.lineSeparator()
                + "Размер массива prices: " + prices.length);

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
