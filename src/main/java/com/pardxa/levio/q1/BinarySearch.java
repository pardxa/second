package com.pardxa.levio.q1;

import java.util.List;

public class BinarySearch {
    private BinarySearch() {
    }
    /**
     * Implement Binary Search algorithm
     * @param num Number to be searched in the array 
     * @param array Array
     * @return 
     *      A positive index of the element in the array if the number could be found;
     *      A negative number which is the (-(insert position)-1) of the number  
     *          if the number could be found in the array; 
     */
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
