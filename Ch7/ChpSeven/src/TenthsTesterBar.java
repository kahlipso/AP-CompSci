
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TenthsTesterBar.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TenthsTesterBar
{
    public static final double  EPSILON = 1E-14;
    /**
     * Default constructor for test class TenthsTesterBar
     */
    public TenthsTesterBar()
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
    public void defaultConstructor()
    {
        int number = 999;
        Tenths[] tenthsArr = new Tenths[number];  // creating an array of 999 Tenths objects
        for (int i = 0; i < number; i++)
        {
            tenthsArr[i] = new Tenths();
        }
        boolean lowerBound = false;
        boolean upperBound = false;

        for(int i = 0; i < tenthsArr.length; i++)
        {
            for (int j = 0; j < 1000; j++) // visiting all 1000 elements of each Tenths object instance variable
            {
                assertTrue(tenthsArr[i].getNum(j)<= 10000.0 && tenthsArr[i].getNum(j)>= 1.0);
                if(Math.abs(tenthsArr[i].getNum(j) - 1.0) < EPSILON)
                {
                    lowerBound = true;
                }
                else if(Math.abs(tenthsArr[i].getNum(j) - 10000.0) < EPSILON)
                {
                    upperBound = true;
                }
            }
        }
        assertTrue(lowerBound && upperBound);
    }

    @Test
    public void testIncrease()
    {
        double[] data1 = {4.1, 6.4, 9999.9, 10000.0};
        Tenths values = new Tenths(data1);
        values.increase(0.1);
        assertEquals(4.2, values.getNum(0), 1e-10);
        assertEquals(6.5, values.getNum(1), 1e-10);
        assertEquals(10000.0, values.getNum(2), 1e-10);
        assertEquals(1.0, values.getNum(3), 1e-10);

        
        double[] data2 = {9999.0, 9999.5, 9999.8, 10000.0};
        Tenths values2 = new Tenths(data2);
        values2.increase(0.5);
        assertEquals(9999.5, values2.getNum(0), 1e-10);
        assertEquals(10000.0, values2.getNum(1), 1e-10);
        assertEquals(1.2, values2.getNum(2), 1e-10);
        assertEquals(1.4, values2.getNum(3), 1e-10);
        
    }
    @Test
    public void findTester()
    {
        double[] data1 = {4.1, 6.4, 9.2, 10.0};
        Tenths values = new Tenths(data1);
        assertEquals(1, values.find(6.4));
        assertEquals(0, values.find(4.1));
        assertEquals(3, values.find(10.0));
        assertEquals(2, values.find(9.2));
        assertEquals(-1, values.find(9.0));
        
        // The tests below uses the increase method
        values.increase(0.3);  // {4.4, 6.7, 9.5, 10.3}
        assertEquals(1, values.find(6.7));
        assertEquals(0, values.find(4.4));
        assertEquals(3, values.find(10.3));
        assertEquals(2, values.find(9.5));
        assertEquals(-1, values.find(9.2));
        
        
        double[] data2 = {100.3};
        values = new Tenths(data2);
        assertEquals(0, values.find(100.3));
        assertEquals(-1, values.find(100.4));

        double[] data3 = {};
        values = new Tenths(data3);
        assertEquals(-1, values.find(6.4));

        
    }

    @Test
    public void containsTester()
    {
        double[] data1 = {4.1, 6.4, 9.2, 10.0};
        Tenths values = new Tenths(data1);
        assertEquals(true, values.contains(6.4));
        assertEquals(true, values.contains(4.1));
        assertEquals(true, values.contains(10.0));
        assertEquals(true, values.contains(9.2));
        assertEquals(false, values.contains(9.0));
        
        // The tests below uses the increase method
        values.increase(0.3);  // {4.4, 6.7, 9.5, 10.3}
        assertEquals(true, values.contains(4.4));
        assertEquals(true, values.contains(6.7));
        assertEquals(true, values.contains(9.5));
        assertEquals(true, values.contains(10.3));
        assertEquals(false, values.contains(9.2));
        

        double[] data2 = {100.3};
        values = new Tenths(data2);
        assertEquals(true, values.contains(100.3));
        assertEquals(false, values.contains(100.4));

        double[] data3 = {};
        values = new Tenths(data3);
        assertEquals(false, values.contains(6.4));   

    }

    @Test
    public void averageTester()
    {
        double[] data1 = {4.1, 6.4, 9.2, 10.0};
        Tenths values = new Tenths(data1);
        assertEquals(7.4, values.average(), EPSILON);

        double[] data2 = {100.3};
        values = new Tenths(data2);
        assertEquals(100.3, values.average(), EPSILON);

        double[] data3 = {};
        values = new Tenths(data3);
        assertEquals(0.0, values.average(), EPSILON);   
    }

    @Test
    public void replaceIndexTester()
    {

        double[] data1 = {4.1, 6.4, 9.2, 10.0};
        Tenths values = new Tenths(data1);
        values.replace(2, 99.9);
        assertEquals(99.9, values.getNum(2), EPSILON);
        assertEquals(6.4, values.getNum(1), EPSILON); // makes sure other values were not replaced.

        double[] data2 = {100.3};
        values = new Tenths(data2);
        values.replace(0, 99.9);
        assertEquals(99.9, values.getNum(0), EPSILON);

    }

    @Test
    public void replaceAllTester()
    {
        double[] data1 = {4.1, 6.4, 9.2, 10.0};
        Tenths values = new Tenths(data1);
        values.replace(6.4, 99.9);
        assertEquals(99.9, values.getNum(1), EPSILON);
        assertEquals(4.1, values.getNum(0), EPSILON);
        assertEquals(9.2, values.getNum(2), EPSILON);
        values.replace(32.5, 99.9);  // make sure nothing was replaced since this value is not in array.
        assertEquals(99.9, values.getNum(1), EPSILON);
        assertEquals(4.1, values.getNum(0), EPSILON);
        assertEquals(9.2, values.getNum(2), EPSILON);

        double[] data2 = {100.3};
        values = new Tenths(data2);
        values.replace(32.6, 99.9);
        assertEquals(100.3, values.getNum(0), EPSILON);
        values.replace(100.3, 99.9);
        assertEquals(99.9, values.getNum(0), EPSILON);

        double[] data3 = {4.1, 4.1, 4.2, 4.1};
        values = new Tenths(data3);
        values.replace(4.1, 99.9);
        assertEquals(99.9, values.getNum(0), EPSILON);
        assertEquals(99.9, values.getNum(1), EPSILON);
        assertEquals(99.9, values.getNum(3), EPSILON);
        assertEquals(4.2, values.getNum(2), EPSILON);
        
    }

    @Test
    public void swapTester()
    {
        double[] data1 = {4.1, 6.4, 9.2, 10.0};
        Tenths values = new Tenths(data1);
        values.swap(1, 3);
        assertEquals(10.0, values.getNum(1), EPSILON);
        assertEquals(6.4, values.getNum(3), EPSILON);
        assertEquals(4.1, values.getNum(0), EPSILON);

       
    }

    @Test
    public void findAllTester()
    {
        double[] data1 = {4.1, 6.4, 9.2, 10.0};
        Tenths values = new Tenths(data1);
        int[] result = values.findAll(6.4);
        assertEquals(1, result[0]);

        double[] data2 = {4.1, 4.1, 4.2, 4.1, 4.0};
        values = new Tenths(data2);
        result = values.findAll(4.1);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(3, result[2]);

        double[] data3 = {100.3};
        values = new Tenths(data3);
        result = values.findAll(100.3);
        assertEquals(0, result[0]);

     
    }

    @Test
    public void toStringTester()
    {
        double[] data1 = {4.1, 6.4, 9.2, 10.0};
        Tenths values = new Tenths(data1);
        assertEquals("4.1, 6.4, 9.2, 10.0", values.toString());

        double[] data2 = {100.3};
        values = new Tenths(data2);
        assertEquals("100.3", values.toString());

        double[] data3 = {};
        values = new Tenths(data3);
        assertEquals("", values.toString());
    }

    @Test
    public void hasDuplicateTester()
    {
        double[] data1 = {4.1, 6.4, 9.2, 10.0};
        Tenths values = new Tenths(data1);
        assertEquals(false, values.hasDuplicate());

        double[] data2 = {100.3};
        values = new Tenths(data2);
        assertEquals(false, values.hasDuplicate());

        double[] data3 = {};
        values = new Tenths(data3);
        assertEquals(false, values.hasDuplicate());

        double[] data4 = {4.1, 9.7, 5.2, 4.1};
        values = new Tenths(data4);
        assertEquals(true, values.hasDuplicate());

    }

    @Test
    public void isSortedTester()
    {
        double[] data1 = {4.1, 6.4, 9.2, 10.0};
        Tenths values = new Tenths(data1);
        assertEquals(true, values.isSorted());

        double[] data2 = {100.3};
        values = new Tenths(data2);
        assertEquals(true, values.isSorted());

        // Have it return true for an empty array
        double[] data3 = {};
        values = new Tenths(data3);
        assertEquals(true, values.isSorted());

        double[] data4 = {4.1, 6.4, 9.2, 8.1};
        values = new Tenths(data4);
        assertEquals(false, values.isSorted());
    }

    @Test
    public void testRange()
    {
        double[] data1 = {4.1, 6.4, 9.2, 10.0};
        Tenths values = new Tenths(data1);
        assertEquals(5.9, values.range(), EPSILON);

        double[] data2 = {100.3};
        values = new Tenths(data2);
        assertEquals(0, values.range(), EPSILON);

        // Have it return true for an empty array
        double[] data3 = {};
        values = new Tenths(data3);
        assertEquals(-1, values.range(), EPSILON);

        double[] data4 = {4.1, 1.2, 90.2, 8.1};
        values = new Tenths(data4);
        assertEquals(89, values.range(), EPSILON);
    }
    // @Test
    // public void sortedTester()
    // {

        // double[] data1 = {4.1, 6.4, 9.2, 10.0};  //already sorted
        // Tenths values = new Tenths(data1);
        // values.sort();
        // assertEquals(4.1, values.getNum(0), EPSILON);
        // assertEquals(6.4, values.getNum(1), EPSILON);
        // assertEquals(9.2, values.getNum(2), EPSILON);
        // assertEquals(10.0, values.getNum(3), EPSILON);

        // double[] data2 = {100.3};
        // values = new Tenths(data2);
        // values.sort();
        // assertEquals(100.3, values.getNum(0), EPSILON);

        // double[] data3 = {6.3, 5.2, 8.7, 3.9};  
        // values = new Tenths(data3);
        // values.sort();
        // assertEquals(3.9, values.getNum(0), EPSILON);
        // assertEquals(5.2, values.getNum(1), EPSILON);
        // assertEquals(6.3, values.getNum(2), EPSILON);
        // assertEquals(8.7, values.getNum(3), EPSILON);

        // // Makes sure the sort method on a empty array does not throw a runtime error.  
        // double[] data4 = {};
        // values = new Tenths(data4);
        // values.sort();

    // }
    
}

