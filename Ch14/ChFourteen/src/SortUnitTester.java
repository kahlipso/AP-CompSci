

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SortUnitTester
{
    /**
     * Default constructor for test class SortUnitTester
     */
    public SortUnitTester()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void selectionSortTester()
    {
        int[] arr1 = {-4, -9, 0, 2, 4, 9};  //-9, -4, 0, 2, 4, 9
        int[] arr1Sorted = SelectionSorter.selectionSort(arr1);
        assertEquals(-9, arr1Sorted[0]);
        assertEquals(-4, arr1Sorted[1]);
        assertEquals(0, arr1Sorted[2]);
        assertEquals(2, arr1Sorted[3]);
        assertEquals(4, arr1Sorted[4]);
        assertEquals(9, arr1Sorted[5]);
    }
    
    @Test
    public void insertionSortTester()
    {
        int[] arr1 = {-4, -9, 0, 2, 4, 9};  //-9, -4, 0, 2, 4, 9
        int[] arr1Sorted = InsertionSorter.insertionSort(arr1);
        assertEquals(-9, arr1Sorted[0]);
        assertEquals(-4, arr1Sorted[1]);
        assertEquals(0, arr1Sorted[2]);
        assertEquals(2, arr1Sorted[3]);
        assertEquals(4, arr1Sorted[4]);
        assertEquals(9, arr1Sorted[5]);
    }
    
    @Test
    public void mergeSortTester()
    {
        int[] arr1 = {-4, -9, 0, 2, 4, 9};  //-9, -4, 0, 2, 4, 9
        int[] arr1Sorted = MergeSorter.mergeSort(arr1);
        assertEquals(-9, arr1Sorted[0]);
        assertEquals(-4, arr1Sorted[1]);
        assertEquals(0, arr1Sorted[2]);
        assertEquals(2, arr1Sorted[3]);
        assertEquals(4, arr1Sorted[4]);
        assertEquals(9, arr1Sorted[5]);
    }
}
