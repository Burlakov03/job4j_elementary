package ru.job4j;

import java.util.Calendar;

public class Info2 {
    public static void main(String[] args){
        final Calendar currentDate = Calendar.getInstance();
        System.out.println(currentDate.get(Calendar.DAY_OF_MONTH) +
                "." + currentDate.get(Calendar.MONTH) +
                "." + currentDate.get(Calendar.YEAR));
    }
}
