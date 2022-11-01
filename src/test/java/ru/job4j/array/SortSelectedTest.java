package ru.job4j.array;

import  org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort5LengthArray() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3LengthArray() {
        int[] data = new int[] {-4, 8, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-4, 0, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort8LengthArray() {
        int[] data = new int[] {-4, 8, 0, -1, 10, 1, 0, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-4, -1, 0, 0, 1, 5, 8, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort4LengthArray() {
        int[] data = new int[] {10, 1, 0, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 5, 10};
        assertThat(result).containsExactly(expected);
    }
}