package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean results = Triangle.exist(ab, ac, bc);
        assertThat(results).isTrue();
    }

    @Test
    public void whenNoExist() {
        double ab = 5;
        double ac = 10;
        double bc = 5;
        boolean results = Triangle.exist(ab, ac, bc);
        assertThat(results).isFalse();
    }
}