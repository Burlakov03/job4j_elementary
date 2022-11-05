package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        Max max = new Max();
        int results = max.maxTwo(left, right);
        int expected = 2;
        assertThat(results).isEqualTo(expected);
    }

    @Test
    public void whenMax3To5Then5() {
        int left = 3;
        int right = 5;
        Max max = new Max();
        int results = max.maxTwo(left, right);
        int expected = 5;
        assertThat(results).isEqualTo(expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        Max max = new Max();
        int results = max.maxTwo(left, right);
        int expected = 4;
        assertThat(results).isEqualTo(expected);
    }

    @Test
    public void whenMax9To4Then9() {
        int left = 9;
        int right = 4;
        Max max = new Max();
        int results = max.maxTwo(left, right);
        int expected = 9;
        assertThat(results).isEqualTo(expected);
    }

    @Test
    public void whenMax1To4To8Then8() {
        int first = 1;
        int second = 4;
        int three = 8;
        Max max = new Max();
        int results = max.maxThree(first, second, three);
        int expected = 8;
        assertThat(results).isEqualTo(expected);
    }

    @Test
    public void whenMax6To4To9To7Then9() {
        int first = 6;
        int second = 4;
        int three = 9;
        int four = 7;
        Max max = new Max();
        int results = max.maxFour(first, second, three, four);
        int expected = 9;
        assertThat(results).isEqualTo(expected);
    }

    @Test
    public void whenMax7To4To5Then7() {
        int first = 7;
        int second = 4;
        int three = 5;
        Max max = new Max();
        int results = max.maxThree(first, second, three);
        int expected = 7;
        assertThat(results).isEqualTo(expected);
    }

    @Test
    public void whenMax1To14To2To4Then14() {
        int first = 1;
        int second = 14;
        int three = 2;
        int four = 4;
        Max max = new Max();
        int results = max.maxFour(first, second, three, four);
        int expected = 14;
        assertThat(results).isEqualTo(expected);
    }

    @Test
    public void whenMax7To4To7Then7() {
        int first = 7;
        int second = 4;
        int three = 7;
        Max max = new Max();
        int results = max.maxThree(first, second, three);
        int expected = 7;
        assertThat(results).isEqualTo(expected);
    }

    @Test
    public void whenMax1To8To8To4Then8() {
        int first = 1;
        int second = 8;
        int three = 8;
        int four = 4;
        Max max = new Max();
        int results = max.maxFour(first, second, three, four);
        int expected = 8;
        assertThat(results).isEqualTo(expected);
    }

}