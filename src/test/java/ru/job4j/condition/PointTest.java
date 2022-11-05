package ru.job4j.condition;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

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
        Assertions.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when33to99Then8dot48() {
        Point a = new Point(3, 3);
        Point b = new Point(9, 9);
        double expected = 8.48;
        Assertions.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when17to84Then7dot61() {
        Point a = new Point(1, 7);
        Point b = new Point(8, 4);
        double expected = 7.61;
        Assertions.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when59to30Then9dot21() {
        Point a = new Point(5, 9);
        Point b = new Point(3, 0);
        double expected = 9.21;
        Assertions.assertEquals(expected, a.distance(b), 0.01);
    }
}