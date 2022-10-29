package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to39Then5dot09() {
        int x1 = 2;
        int y1 = 4;
        int x2 = 3;
        int y2 = 9;
        double expected = 5.09;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to99Then8dot48() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 9;
        int y2 = 9;
        double expected = 8.48;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when17to84Then7dot61() {
        int x1 = 1;
        int y1 = 7;
        int x2 = 8;
        int y2 = 4;
        double expected = 7.61;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when59to30Then9dot21() {
        int x1 = 5;
        int y1 = 9;
        int x2 = 3;
        int y2 = 0;
        double expected = 9.21;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}