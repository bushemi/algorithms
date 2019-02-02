package com.bushemi.sorting;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static com.bushemi.sorting.dataProvider.DataProvider.getArrayListOfIntegers;

@RunWith(JUnit4.class)
public class BubbleSortTest {


    @Test
    public void sort() {
        long nanoTime = System.nanoTime();
        SorterService sorter = new BubbleSort();
        List<Integer> numbers = getArrayListOfIntegers();
        System.out.println("numbers = " + numbers);
        List<Integer> sortedList =
                sorter.sort(numbers);
        System.out.println("sortedList = " + sortedList);
        for (int i = 0; i < sortedList.size() - 1; i++) {
            int x = sortedList.get(i);
            int y = sortedList.get(i + 1);
            Assert.assertTrue("list is not sorted", x < y);
        }
        System.out.println("newNanoTime = " + (System.nanoTime() - nanoTime));
    }


}
