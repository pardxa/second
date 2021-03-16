package com.pardxa.levio.q1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFirstDpl {
    private FindFirstDpl() {
    }

    public static Integer find(int[] array) {
        int arrayLength = array.length;
        List<Integer> container = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            int index = BinarySearch.search(array[i], container);
            if (index > -1) {
                return array[i];
            }
            index = -(index + 1);
            container.add(index, array[i]);
        }
        return null;
    }

    public static Integer findNotEfficient(int[] array) {
        int arrayLength = array.length;
        Set<Integer> container = new HashSet<>();
        for (int i = 0; i < arrayLength; i++) {
            if (container.contains(array[i])) {
                return array[i];
            }
            container.add(array[i]);
        }
        return null;
    }
}
