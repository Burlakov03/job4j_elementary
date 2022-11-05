package ru.job4j.condition;

public class Max {

    public int maxTwo(int first, int second) {
        return Math.max(first, second);
    }

    public int maxThree(int first, int second, int three) {
        return maxTwo(first, maxTwo(second, three));
    }

    public int maxFour(int first, int second, int three, int four) {
        return maxTwo(first, maxThree(second, three, four));
    }

}
