package com.test.junit.activity5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static <T extends Comparable<T>> List<T> sorted(List<T> set1, List<T> set2) {
        List<T> mergedSet = new ArrayList<>();

        int i = 0, j = 0;

        while (i < set1.size() && j < set2.size()) {
            T el1 = set1.get(i);
            T el2 = set2.get(j);

            if (el1.compareTo(el2) <= 0) {
                mergedSet.add(el1);
                i++;
            } else {
                mergedSet.add(el2);
                j++;
            }
        }

        while (i < set1.size()) {
            mergedSet.add(set1.get(i));
            i++;
        }

        while (j < set2.size()) {
            mergedSet.add(set2.get(j));
            j++;
        }

        return mergedSet;
    }
}
