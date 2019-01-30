package com.bushemi.sorting;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class BubbleSortTest {


    @Test
    public void sort() {
        SorterService sorter = new BubbleSort();
        List<Integer> sortedList =
                sorter.sort(com.bushemi.sorting.DataProvider.getArrayListOfIntegers());
        for (int i = 0; i < sortedList.size() - 1; i++) {
            int x = sortedList.get(i);
            int y = sortedList.get(i + 1);
            Assert.assertTrue("list is not sorted", x < y);
        }
    }


}
