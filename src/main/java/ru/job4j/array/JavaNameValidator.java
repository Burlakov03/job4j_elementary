package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean result = !name.isEmpty()
                && isNotUpperLatinLetter(name.charAt(0))
                && !Character.isDigit(name.charAt(0));
        if (result) {
            for (int index = 1; index < name.length(); index++) {
                int code = name.charAt(index);
                if (isNotSpecialSymbol(code)  && isNotUpperLatinLetter(code)
                        && isNotLowerLatinLetter(code) && !Character.isDigit(code)) {
                    result = false;
                    break;
                }

            }
        }
        return result;
    }

    public static boolean isNotSpecialSymbol(int code) {
        return code != 36 && code != 95;
    }

    public static boolean isNotUpperLatinLetter(int code) {
        return code < 65 || code > 90;
    }

    public static boolean isNotLowerLatinLetter(int code) {
        return code < 97 || code > 122;
    }
}
