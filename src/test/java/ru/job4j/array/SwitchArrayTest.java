package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] array = new int[] {1, 2, 3, 4};
        int source = 0;
        int dest = array.length - 1;
        int[] expected = new int[] {4, 2, 3, 1};
        int[] result = SwitchArray.swap(array, source, dest);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap1to5() {
        int[] array = new int[] {3, 5, 6, 7, 22, 34, 45, 12};
        int source = 1;
        int dest = 5;
        int[] expected = new int[] {3, 34, 6, 7, 22, 5, 45, 12};
        int[] result = SwitchArray.swap(array, source, dest);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] array = new int[] {3, 34, 45, 12};
        int source = 2;
        int dest = 3;
        int[] expected = new int[] {3, 34, 12, 45};
        int[] result = SwitchArray.swap(array, source, dest);
        assertThat(result).containsExactly(expected);
    }
}