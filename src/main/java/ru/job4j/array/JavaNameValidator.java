package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean result = !name.isEmpty() && isLowerLatinLetter(name.charAt(0));
        if (result) {
            for (int index = 1; index < name.length(); index++) {
                if (isSpecialSymbol(name.charAt(index))  || isUpperLatinLetter(name.charAt(index))
                        || isLowerLatinLetter(name.charAt(index)) || Character.isDigit(name.charAt(index))) {
                    continue;
                }
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
