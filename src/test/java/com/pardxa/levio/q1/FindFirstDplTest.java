package com.pardxa.levio.q1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class FindFirstDplTest {
    @Test
    void testFind() {
        assertEquals(3, FindFirstDpl.find(new int[] { 8, 2, 3, 0, 3, 6, 2 }));
        assertNull(FindFirstDpl.find(new int[] { 5, 2, 4, 6, 3, 7, 1 }));
        assertEquals(0, FindFirstDpl.find(new int[] { 10, 5, 0, 0, 5, 10 }));
    }

    @Test
    void testfindMoreEfficient() {
        assertEquals(3, FindFirstDpl.findMoreEfficient(new int[] { 8, 2, 3, 0, 3, 6, 2 }));
        assertNull(FindFirstDpl.findMoreEfficient(new int[] { 5, 2, 4, 6, 3, 7, 1 }));
        assertEquals(0, FindFirstDpl.findMoreEfficient(new int[] { 10, 5, 0, 0, 5, 10 }));
    }

    @Test
    void testWorstCaseEfficiency() {
        Set<Integer> ctr = new HashSet<>();
        Random generator = new Random();
        while (ctr.size() < 1000000) {
            int num = generator.nextInt(4000000);
            ctr.add(num);
        }
        int[] iList = new int[ctr.size()];
        Iterator<Integer> itr = ctr.iterator();
        int i = 0;
        while (itr.hasNext()) {
            iList[i] = itr.next();
            i++;
        }
        long st = System.currentTimeMillis();
        FindFirstDpl.find(iList);
        long du = System.currentTimeMillis() - st;

        long st1 = System.currentTimeMillis();
        FindFirstDpl.findMoreEfficient(iList);
        long du2 = System.currentTimeMillis() - st1;

        assertTrue(du > du2);
    }

}
