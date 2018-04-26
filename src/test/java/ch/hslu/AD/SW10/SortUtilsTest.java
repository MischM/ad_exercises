package ch.hslu.AD.SW10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Übung: Höhere Sortieralgorithmen (A2)
 *
 * @author Fabian Gröger
 * @version 26.04.2018
 */
public class SortUtilsTest {

    private Character[] charArraySorted;
    private Character[] charArrayReverseSorted;
    private Character[] charArrayRandom;

    @Before
    public void setup() {
        charArraySorted = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        charArrayReverseSorted = new Character[]{'g', 'f', 'e', 'd', 'c', 'b', 'a'};
        charArrayRandom = new Character[]{'d', 'a', 'c', 'f', 'b', 'g', 'e'};
    }

    @Test
    public void testIsSortedArrayAscending() {
        assertTrue(SortUtils.assertIsSorted(charArraySorted, SortUtils.Order.ASCENDING));
        assertFalse(SortUtils.assertIsSorted(charArrayReverseSorted, SortUtils.Order.ASCENDING));
        assertFalse(SortUtils.assertIsSorted(charArrayRandom, SortUtils.Order.ASCENDING));
    }

    @Test
    public void testIsSortedArrayDescending() {
        assertTrue(SortUtils.assertIsSorted(charArrayReverseSorted, SortUtils.Order.DESCENDING));
        assertFalse(SortUtils.assertIsSorted(charArraySorted, SortUtils.Order.DESCENDING));
        assertFalse(SortUtils.assertIsSorted(charArrayRandom, SortUtils.Order.DESCENDING));
    }
}