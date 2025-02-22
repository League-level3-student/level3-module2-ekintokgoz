package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        String [] test = {"Hi", "Hello", "Welcome", "Thanks", "There"};
        
    	assertEquals(-1, _01_LinearSearch.linearSearch(test, "are"));
    	assertEquals(2, _01_LinearSearch.linearSearch(test, "Welcome"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        int [] arr = {1, 3, 4, 6, 9, 10, 14};
    	assertEquals(-1, _02_BinarySearch.binarySearch(arr, 0, 6, 5));
    	assertEquals(4, _02_BinarySearch.binarySearch(arr, 0, 6, 9));
    }
}
