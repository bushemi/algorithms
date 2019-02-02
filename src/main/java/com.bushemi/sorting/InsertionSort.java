package com.bushemi.sorting;

import java.util.Collections;
import java.util.List;

public class InsertionSort implements SorterService {

    @Override
    public List<Integer> sort(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int j = i;
            while (j > 0 && numbers.get(j) < numbers.get(j - 1)) {
                Collections.swap(numbers, j, j - 1);
                j = j - 1;
            }
        }

        return numbers;
    }

}
