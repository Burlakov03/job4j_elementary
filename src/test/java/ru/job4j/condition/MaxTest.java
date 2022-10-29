package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int results = Max.max(left, right);
        int expected = 2;
        assertThat(results).isEqualTo(expected);
    }

    @Test
    public void whenMax3To5Then5() {
        int left = 3;
        int right = 5;
        int results = Max.max(left, right);
        int expected = 5;
        assertThat(results).isEqualTo(expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int results = Max.max(left, right);
        int expected = 4;
        assertThat(results).isEqualTo(expected);
    }
}