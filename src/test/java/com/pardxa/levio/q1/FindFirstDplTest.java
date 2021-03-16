package com.pardxa.levio.q1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FindFirstDplTest {
    @Test
    void testFind() {
        assertEquals(3, FindFirstDpl.find(new int[] { 8, 2, 3, 0, 3, 6, 2 }));
        assertNull(FindFirstDpl.find(new int[] { 5, 2, 4, 6, 3, 7, 1 }));
        assertEquals(0, FindFirstDpl.find(new int[] { 10, 5, 0, 0, 5, 10 }));
    }
    @Test
    void testfindNotEfficient() {
        assertEquals(3, FindFirstDpl.findNotEfficient(new int[] { 8, 2, 3, 0, 3, 6, 2 }));
        assertNull(FindFirstDpl.findNotEfficient(new int[] { 5, 2, 4, 6, 3, 7, 1 }));
        assertEquals(0, FindFirstDpl.findNotEfficient(new int[] { 10, 5, 0, 0, 5, 10 }));
    }

}
