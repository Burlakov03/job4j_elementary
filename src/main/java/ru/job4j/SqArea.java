package ru.job4j;

public class SqArea {
    public static double[] square(double p, double k) {
        double[] parametersSquare = new double[3];
        parametersSquare[0] = p / (2 * (k + 1));
        parametersSquare[1] = parametersSquare[0] * k;
        parametersSquare[2] = parametersSquare[0] * parametersSquare[1];
        return parametersSquare;
    }

    public static void main(String[] args) {
        double[] myArray;
        myArray = SqArea.square(6, 2);
        System.out.println("p = 6, k = 2, h = " + myArray[0] + ", l = " + myArray[1] + ", s = " + myArray[2]);
    }
}
