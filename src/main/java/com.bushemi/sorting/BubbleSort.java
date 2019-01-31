package com.bushemi.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort implements SorterService {

    @Override
    public List<Integer> sort(List<Integer> numbers) {
        if (numbers.size() == 1) return numbers;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i + 1)) {
                Collections.swap(numbers, i, i + 1);
            }
        }

        List<Integer> newNumbers = new ArrayList<>(sort(numbers.subList(0, numbers.size() - 1)));
        newNumbers.add(numbers.get(numbers.size() - 1));
        numbers = newNumbers;
        return numbers;
    }
}
