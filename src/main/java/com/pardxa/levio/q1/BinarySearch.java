package com.pardxa.levio.q1;

import java.util.List;

public class BinarySearch {
    private BinarySearch() {
    }

    public static int search(int num, List<Integer> array) {
        int halfIdx = -1;
        int startIdx = 0;
        int lastIdx = array.size() - 1;

        while (startIdx <= lastIdx) {
            halfIdx = (lastIdx + startIdx) / 2;
            if (array.get(halfIdx) > num) {
                lastIdx = halfIdx - 1;
            } else if (array.get(halfIdx) < num) {
                startIdx = halfIdx + 1;
            } else {
                return halfIdx;
            }
        }
        return -(startIdx + 1);
    }
}
