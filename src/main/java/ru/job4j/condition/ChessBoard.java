package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(y1)
                && isValid(x2) && isValid(y2)) {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                rsl = Math.abs(x1 - x2);
            }
        }
        return rsl;
    }

    public static int wayRook(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(y1)
                && isValid(x2) && isValid(y2)) {
            if (x1 == x2 || y1 == y2) {
                rsl = Math.abs(x1 - x2);
                rsl = rsl == 0 ? Math.abs(y1 - y2) : rsl;
            }
        }
        return rsl;
    }

    public static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
