package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortOf3() {
        int[] data = new int[] {3, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortOf5() {
        int[] data = new int[] {10, 8, 6, 7, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 7, 8, 9, 10};
        Assert.assertArrayEquals(expected, result);
    }
}
