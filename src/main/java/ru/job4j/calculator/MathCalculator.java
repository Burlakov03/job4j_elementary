package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDifferenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sumAndMultiply(first, second) + sumDifferenceAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы(сумма + умножение чисел) равен: "
                + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы(разность + деление чисел) равен: "
                + sumDifferenceAndDivision(10, 20));
        System.out.println("Результат расчета суммы(суммы всех основных операций над числами) равен: "
                + sumAllOperations(10, 20));
    }
}
