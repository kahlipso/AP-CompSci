
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SelectionSortTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HeightWeightTester
{
    /**
     * Default constructor for test class SelectionSortTester
     */
    public HeightWeightTester()
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
    public void testFindHeight_LinearSearch()
    {
        Analyzer ex1 = new Analyzer();
        assertEquals(0, ex1.findHeight(65.78331));
        assertEquals(1, ex1.findHeight(71.51521));
        assertEquals(63, ex1.findHeight(67.01255));
        assertEquals(24999, ex1.findHeight(68.87761));
        assertEquals(-1, ex1.findHeight(66.77889));

    }
    
    @Test
    public void testFindWeight_BinarySearch()
    {
        // Note that this tester won't work unless your sortByWeight method works.
        Analyzer ex1 = new Analyzer();
        ex1.sortByWeight();
        assertEquals(0, ex1.findWeight(78.01476));
        assertEquals(1, ex1.findWeight(78.56785));
        assertEquals(40, ex1.findWeight(92.20107));
        assertEquals(24999, ex1.findWeight(170.924));
        assertEquals(-1, ex1.findWeight(100.1111));
    }
    
    @Test 
    public void testSortByHeight_InsertionSort()
    {
        Analyzer ex1 = new Analyzer();
        ex1.sortByHeight();
        assertEquals(60.27836, ex1.getPerson(0).getHeight(), 1e-14);
        assertEquals(60.61265, ex1.getPerson(1).getHeight(), 1e-14);
        assertEquals(62.53019, ex1.getPerson(40).getHeight(), 1e-14);
        assertEquals(75.1528, ex1.getPerson(24999).getHeight(), 1e-14);
    }

    @Test
    public void testSortByWeight_MergeSort()
    {
        Analyzer ex1 = new Analyzer();
        ex1.sortByWeight();
        assertEquals(78.01476, ex1.getPerson(0).getWeight(), 1e-14);
        assertEquals(78.56785, ex1.getPerson(1).getWeight(), 1e-14);
        assertEquals(92.20107, ex1.getPerson(40).getWeight(), 1e-14);
        assertEquals(170.924, ex1.getPerson(24999).getWeight(), 1e-14);
    }
}
