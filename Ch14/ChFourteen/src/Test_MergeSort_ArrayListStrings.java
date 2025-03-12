import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test_MergeSort_ArrayListStrings.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test_MergeSort_ArrayListStrings
{
    /**
     * Default constructor for test class Test_MergeSort_ArrayListStrings
     */
    public Test_MergeSort_ArrayListStrings()
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
    public void testMergeSort()
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("z");
        arr.add("bb");
        arr.add("r");
        arr.add("g");
        arr.add("e");
        arr.add("ba");
        arr.add("c");
        arr.add("a");
        
        ArrayList<String> result = MergeSorter.mergeSort(arr);
        // {a, ba, bb, c, e, g, r, z}
        assertEquals("a", result.get(0));
        assertEquals("ba", result.get(1));
        assertEquals("bb", result.get(2));
        assertEquals("c", result.get(3));
        assertEquals("e", result.get(4));
        assertEquals("g", result.get(5));
        assertEquals("r", result.get(6));
        assertEquals("z", result.get(7));
    
    }
}
