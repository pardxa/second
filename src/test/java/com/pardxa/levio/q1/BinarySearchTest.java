package com.pardxa.levio.q1;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    void test() {
        List<Integer> list = new ArrayList<>(List.of(2, 4, 6, 8, 10, 12, 14));
        assertEquals(-1,BinarySearch.search(0, list));
        assertEquals(-1,BinarySearch.search(1, list));
        assertEquals(2,BinarySearch.search(6, list));
        assertEquals(-3,BinarySearch.search(5, list));
        assertEquals(-6,BinarySearch.search(11, list));

    }

    @Test
    void testEmpty() {
        assertEquals(-1,BinarySearch.search(100, new ArrayList<>()));
    }

    @Test
    void testOneMatch() {
        assertEquals(0,BinarySearch.search(90, new ArrayList<>(List.of(90))));
    }
    @Test
    void testOneNotMatch() {
        assertEquals(-1,BinarySearch.search(89, new ArrayList<>(List.of(90))));
        assertEquals(-2,BinarySearch.search(91, new ArrayList<>(List.of(90))));
    }
}