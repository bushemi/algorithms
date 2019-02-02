package com.bushemi.sorting;

import java.util.Collections;
import java.util.List;

public class JavasSort implements SorterService{
    @Override
    public List<Integer> sort(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }
}
