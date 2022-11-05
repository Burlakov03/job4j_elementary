package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {

    @Test
    public void when00to20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when24to39Then5dot09() {
        Point a = new Point(2, 4);
        Point b = new Point(3, 9);
        double expected = 5.09;
        assertThat(a.distance(b)).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when33to99Then8dot48() {
        Point a = new Point(3, 3);
        Point b = new Point(9, 9);
        double expected = 8.48;
        assertThat(a.distance(b)).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when17to84Then7dot61() {
        Point a = new Point(1, 7);
        Point b = new Point(8, 4);
        double expected = 7.61;
        assertThat(a.distance(b)).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when59to30Then9dot21() {
        Point a = new Point(5, 9);
        Point b = new Point(3, 0);
        double expected = 9.21;
        assertThat(a.distance(b)).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when590to301Then9dot27() {
        Point a = new Point(5, 9, 0);
        Point b = new Point(3, 0, 1);
        double expected = 9.27;
        assertThat(a.distance3d(b)).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when614to217Then5() {
        Point a = new Point(6, 1, 4);
        Point b = new Point(2, 1, 7);
        double expected = 5;
        assertThat(a.distance3d(b)).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenMinus33Minus3to947Then15dot65() {
        Point a = new Point(-3, 3, -3);
        Point b = new Point(9, 4, 7);
        double expected = 15.65;
        assertThat(a.distance3d(b)).isCloseTo(expected, offset(0.01));
    }
}