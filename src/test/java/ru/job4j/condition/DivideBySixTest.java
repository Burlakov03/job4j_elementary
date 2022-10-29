package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int number = 6;
        String result = DivideBySix.checkNumber(number);
        String expected = "Исходное число делится на 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int number = 9;
        String result = DivideBySix.checkNumber(number);
        String expected = "Исходное число делится на 3, но не является четным.";
        assertThat(result).isEqualTo(expected);
     }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int number = 14;
        String result = DivideBySix.checkNumber(number);
        String expected = "Исходное число не делится на 3, но является четным.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int number = 25;
        String result = DivideBySix.checkNumber(number);
        String expected = "Исходное число не делится на 3 и не является четным.";
        assertThat(result).isEqualTo(expected);
    }
}