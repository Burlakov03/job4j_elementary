package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rs = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rs = i;
                break;
            }
        }
        return rs;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rs = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rs = i;
                break;
            }
        }
        return rs;
    }
}
