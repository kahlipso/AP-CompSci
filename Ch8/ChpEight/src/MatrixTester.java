
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
public class MatrixTester
{
    public static final double  EPSILON = 1E-14;
    /**
     * Default constructor for test class TenthsTesterBar
     */
    public MatrixTester()
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
    public void testConstructor2()
    {
        Matrix m1 = new Matrix(3, 5, 7);
        assertEquals(7, m1.getValue(0, 0));
        assertEquals(8, m1.getValue(0, 1));
        assertEquals(9, m1.getValue(0, 2));
        assertEquals(10, m1.getValue(0, 3));
        assertEquals(11, m1.getValue(0, 4));
        assertEquals(12, m1.getValue(1, 0));
        assertEquals(16, m1.getValue(1, 4));
        assertEquals(18, m1.getValue(2, 1));
        assertEquals(21, m1.getValue(2, 4));
    }
    @Test
    public void testConstructor3()
    {
        int[][] nums = {{2, 5, 9, 8}, {1, 3, 7, 6}};
        Matrix m1 = new Matrix(nums);
        assertEquals(2, m1.getValue(0, 0));
        assertEquals(5, m1.getValue(0, 1));
        assertEquals(9, m1.getValue(0, 2));
        assertEquals(8, m1.getValue(0, 3));
        assertEquals(1, m1.getValue(1, 0));
        assertEquals(7, m1.getValue(1, 2));
        assertEquals(6, m1.getValue(1, 3));
    }
    
    @Test
    public void testMin()
    {
        int[][] nums = {{2, 5, 9, 8}, {1, 3, 7, 6}};
        Matrix m1 = new Matrix(nums);
        assertEquals(1, m1.findMin());
        
        Matrix m2 = new Matrix(6, 8, -7);
        assertEquals(-7, m2.findMin());
    }
    @Test
    public void testRowSum()
    {
        int[][] nums = {{2, 5, 9, 8}, {1, 3, 7, 6}};
        Matrix m1 = new Matrix(nums);
        assertEquals(24, m1.rowSum(0));
        assertEquals(17, m1.rowSum(1));
        
        Matrix m2 = new Matrix(3, 5, 2);
        assertEquals(20, m2.rowSum(0));
        assertEquals(45, m2.rowSum(1));
    }
    @Test
    public void testIsColAscending()
    {
        Matrix m1 = new Matrix(3, 5, 7);
        assertTrue(m1.isColAscending(0));
        assertTrue(m1.isColAscending(1));
        assertTrue(m1.isColAscending(2));
        assertTrue(m1.isColAscending(3));
        assertTrue(m1.isColAscending(4));

        int[][] nums = {{1, 3, 7, 6}, {2, 5, 9, 3}};
        Matrix m2 = new Matrix(nums);
        assertEquals(true, m2.isColAscending(0));
        assertEquals(true, m2.isColAscending(1));
        assertEquals(true, m2.isColAscending(2));
        assertEquals(false, m2.isColAscending(3));
    }
    @Test
    public void testIsEveryColAscending()
    {
        Matrix m1 = new Matrix(3, 5, 7);
        assertEquals(true, m1.isEveryColAscending());

        int[][] nums = {{1, 3, 7, 6}, {2, 5, 9, 8}};
        Matrix m2 = new Matrix(nums);
        assertEquals(true, m2.isEveryColAscending());

    }
    @Test
    public void testFirstEven()
    {
        Matrix m1 = new Matrix(3, 5, 7);

        int[] result = m1.firstEven();  // returns array {0, 1}
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);

        int[][] nums = {{1, 3, 7, 9}, {5, 5, 8, 8}};
        Matrix m2 = new Matrix(nums);
        int[] result2 = m2.firstEven();  //should return array {1, 2};
        assertEquals(1, result2[0]);
        assertEquals(2, result2[1]);
    }
    @Test
    public void testRemoveShiftUp()
    {
        Matrix m1 = new Matrix(3, 5, 7);  
        m1.removeShiftUp(0, 0);
        assertEquals(12, m1.getValue(0, 0));
        assertEquals(17, m1.getValue(1, 0));
        assertEquals(0, m1.getValue(2, 0));
        
        m1.removeShiftUp(0, 0);
        assertEquals(17, m1.getValue(0, 0));
        assertEquals(0, m1.getValue(1, 0));
        assertEquals(0, m1.getValue(2, 0));
        
        m1.removeShiftUp(2, 1);
        assertEquals(8, m1.getValue(0, 1));
        assertEquals(13, m1.getValue(1, 1));
        assertEquals(0, m1.getValue(2, 1));
        
        m1.removeShiftUp(1, 3);
        assertEquals(10, m1.getValue(0, 3));
        assertEquals(20, m1.getValue(1, 3));
        assertEquals(0, m1.getValue(2, 3));
    }

    @Test
    public void testAdjacentAverage()
    {
        Matrix m1 = new Matrix(3, 5, 7);
        assertEquals(-1, m1.adjacentAverage(0, 0), 1E-14);
        assertEquals(-1, m1.adjacentAverage(0, 2), 1E-14);
        assertEquals(-1, m1.adjacentAverage(1, 4), 1E-14);
        assertEquals(-1, m1.adjacentAverage(2, 3), 1E-14);

        assertEquals(13, m1.adjacentAverage(1, 1), 1E-14);
        assertEquals(15, m1.adjacentAverage(1, 3), 1E-14);


        int[][] nums = {{2, 5, 9, 8}, {1, 3, 7, 6}, {2, 3, 4, 5}, {0, 0, 0, 0}};
        Matrix m2 = new Matrix(nums);
        assertEquals(-1, m2.adjacentAverage(0, 0), 1E-14);
        assertEquals(-1, m2.adjacentAverage(3, 3), 1E-14);
        assertEquals(-1, m2.adjacentAverage(1, 3), 1E-14);
        assertEquals(2.25, m2.adjacentAverage(2, 1), 1E-14);
        assertEquals(3.75, m2.adjacentAverage(2, 2), 1E-14);
    }
}

