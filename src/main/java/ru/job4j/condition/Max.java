package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int three) {
        return max(first, max(second, three));
    }

    public static int max(int first, int second, int three, int four) {
        return max(first, max(second, three, four));
    }

}
