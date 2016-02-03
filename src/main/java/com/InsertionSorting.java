package com;

/**
 * A simple class to demonstrate the Insertion sorting algorithm
 */
public class InsertionSorting {

    public static void main(String[] args) {

        int[] intArray = {11, 2, 13, 4, 5, 7};
        InsertionSorting sorting = new InsertionSorting();
        sorting.printElements("Before Sorting", intArray);
        sorting.doSorting(intArray);
        sorting.printElements("After Sorting", intArray);
    }

    public void printElements(String message, int[] intArray) {
        System.out.println(message);
        for (Integer num : intArray) {
            System.out.println(num);
        }
    }

    /**
     * Sorting the numbers based on the insertion sort algorithm
     *
     * This algorithm takes the number/value compares it with all the previous numbers
     * Best case time complexity is O(n) and worst and avg case is O(n^2)
     *
     * @param intArray
     */
    public static void doSorting(int[] intArray) {

        int sortValue;
        int i, j;
        for (i = 1; i < intArray.length; i++) {
            sortValue = intArray[i];
            for (j = i; j > 0 && intArray[j-1] > sortValue; j--) { //Compare with all previous elements.
                intArray[j] = intArray[j - 1];                     // If the value is greater than, move down the elements
            }
            intArray[j] = sortValue;
        }
    }
}
