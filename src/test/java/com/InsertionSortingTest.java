package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertionSortingTest {

    @Test
    public void testSort() {

        int[] intArray = {12, 2, 31, 46, 51, 71};
        InsertionSorting sorting = new InsertionSorting();
        sorting.printElements("Before Sorting", intArray);
        sorting.doSorting(intArray);
        sorting.printElements("After Sorting", intArray);
        assertEquals(2, intArray[0]);
    }


}
