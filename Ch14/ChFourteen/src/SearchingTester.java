

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SearchingTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SearchingTester
{
    /**
     * Default constructor for test class SearchingTester
     */
    public SearchingTester()
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
    public void constructorAndToStringTester()
    {
        String [] example1 =  {"so", "glad", "it", "is", "Friday"};
        SearchingPractice p1 = new SearchingPractice(example1);
        String result1 = "so, glad, it, is, Friday";
        assertEquals(result1, p1.toString());
        // The lines below test to see if you made a COPY of the parameter array or not.
        example1[0] = "not";  // changing the contents in the parameter array.
        assertEquals(result1, p1.toString());  // words should not have changed
    }
    @Test
    public void linearSearchTester()
    {
        String [] example1 =  {"so", "glad", "it", "is", "Friday"};
        SearchingPractice p1 = new SearchingPractice(example1);
        assertEquals(0, p1.linearSearch("so"));
        assertEquals(3, p1.linearSearch("is"));
        assertEquals(-1, p1.linearSearch("friday"));
        
        String [] example2 =  {"a", "b", "c", "a", "c"};
        SearchingPractice p2 = new SearchingPractice(example2);
        assertEquals(1, p2.linearSearch("b"));
        assertEquals(3, p2.linearSearch("a"));  // return the last index
        assertEquals(4, p2.linearSearch("c"));  // return the last index
        assertEquals(-1, p2.linearSearch("e"));
    }
    @Test 
    public void isSortedTester()
    {
        String [] example1 =  {"so", "glad", "it", "is", "Friday"};
        SearchingPractice p1 = new SearchingPractice(example1);
        assertEquals(false, p1.isSorted());
        
        String [] example2 =  {"a", "b", "c", "a", "c"};
        SearchingPractice p2 = new SearchingPractice(example2);
        assertEquals(false, p2.isSorted());
        
        String [] example3 =  {"A", "Z", "a", "b", "c"};
        SearchingPractice p3 = new SearchingPractice(example3);
        assertEquals(true, p3.isSorted());
    }
    @Test
    public void binarySearchTester()
    {
        String [] example1 =  {"A", "Z", "a", "b", "c"};
        SearchingPractice p1 = new SearchingPractice(example1);
        assertEquals(0, p1.binarySearch("A"));
        assertEquals(1, p1.binarySearch("Z"));
        assertEquals(4, p1.binarySearch("c"));
        assertEquals(-1, p1.binarySearch("z"));
        
        String [] example2 =  {"a", "b", "c", "car", "cart", "cat", "dog", "fish", "lion", "m", "n", "r", "red", "sat", "zzzz"};
    SearchingPractice p2 = new SearchingPractice(example2);
        assertEquals(0, p2.binarySearch("a"));
        assertEquals(3, p2.binarySearch("car"));
        assertEquals(4, p2.binarySearch("cart"));
        assertEquals(-1, p2.binarySearch("l"));
        assertEquals(-1, p2.binarySearch("saturday"));
        assertEquals(-1, p2.binarySearch("zzz"));
    }
}
