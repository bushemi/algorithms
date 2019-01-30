package com.bushemi.sorting;

import java.util.List;

/**
 * interface for future sorters.
 */
public interface SorterService {
    /**
     * main method for sorting integers.
     * @param numbers takes list of integers
     * @return sorted List with integers
     */
    List<Integer> sort(List<Integer> numbers);
}
