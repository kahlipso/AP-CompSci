

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ThreeNumbersTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ThreeNumbersTester
{
    /**
     * Default constructor for test class ThreeNumbersTester
     */
    public ThreeNumbersTester()
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
    public void testConstructorsGettersSetters()
    {
        ThreeNumbers ex1 = new ThreeNumbers();
        assertEquals(1, ex1.getNum1());
        assertEquals(2, ex1.getNum2());
        assertEquals(3, ex1.getNum3());
        
        ThreeNumbers ex2 = new ThreeNumbers(-5, -9, 0);
        assertEquals(-5, ex2.getNum1());
        assertEquals(-9, ex2.getNum2());
        assertEquals(0, ex2.getNum3());
        
        ex1.setNum1(99);
        ex1.setNum2(-99);
        ex1.setNum3(-3);
        assertEquals(99, ex1.getNum1());
        assertEquals(-99, ex1.getNum2());
        assertEquals(-3, ex1.getNum3());
    }
    @Test
    public void testContains()
    {
        ThreeNumbers ex1 = new ThreeNumbers();
        assertEquals(false, ex1.contains(4));
        assertEquals(false, ex1.contains(-3));
        assertEquals(true, ex1.contains(2));
        assertEquals(true, ex1.contains(1));
    }
    @Test
    public void testIsInOrder()
    {
        ThreeNumbers ex1 = new ThreeNumbers();
        assertEquals(true, ex1.isInOrder());
        ex1.setNum2(-2);
        assertEquals(false, ex1.isInOrder());
        ThreeNumbers ex2 = new ThreeNumbers(-5, -9, 0);
        assertEquals(false, ex2.isInOrder());
    }
    @Test
    public void testgetLargest()
    {
        ThreeNumbers ex1 = new ThreeNumbers();
        assertEquals(3, ex1.getLargest());
        ThreeNumbers ex2 = new ThreeNumbers(-5, -9, 0);
        assertEquals(0, ex2.getLargest());
        ThreeNumbers ex3 = new ThreeNumbers(-2, -6, -4);
        assertEquals(-2, ex3.getLargest());
        ThreeNumbers ex4 = new ThreeNumbers(4, 4, 4);
        assertEquals(4, ex4.getLargest());
        ThreeNumbers ex5 = new ThreeNumbers(4, 99999, 100);
        assertEquals(99999, ex5.getLargest());
    }
    @Test
    public void testIsPythagoreanTriple()
    {
        ThreeNumbers ex1 = new ThreeNumbers();
        assertEquals(false, ex1.isPythagoreanTriple());
        ThreeNumbers ex2 = new ThreeNumbers(3, 4, 5);
        assertEquals(true, ex2.isPythagoreanTriple());
        ThreeNumbers ex3 = new ThreeNumbers(5, 12, 13);
        assertEquals(true, ex3.isPythagoreanTriple());
        // EDGE CASES
        ThreeNumbers ex4 = new ThreeNumbers(-3, -4, -5);  // sides of triangle can't be negative
        assertEquals(false, ex4.isPythagoreanTriple());
        ThreeNumbers ex5 = new ThreeNumbers(0, 0, 0);  // sides of triangle can't be zero
        assertEquals(false, ex5.isPythagoreanTriple());
        ThreeNumbers ex6 = new ThreeNumbers(0, 4, 5);  // sides of triangle can't be zero
        assertEquals(false, ex6.isPythagoreanTriple());
       
    }
    @Test
    public void testIsGeometricSequence()
    {
        ThreeNumbers ex1 = new ThreeNumbers();
        assertEquals(false, ex1.isGeometricSequence());
        ThreeNumbers ex2 = new ThreeNumbers(5, 10, 20);
        assertEquals(true, ex2.isGeometricSequence());
        ThreeNumbers ex3 = new ThreeNumbers(20, 10, 5);
        assertEquals(true, ex3.isGeometricSequence());
        ThreeNumbers ex4 = new ThreeNumbers(10, 5, 20);
        assertEquals(false, ex4.isGeometricSequence());
        ThreeNumbers ex5 = new ThreeNumbers(-7, 14, -28);
        assertEquals(true, ex5.isGeometricSequence());
        ThreeNumbers ex6 = new ThreeNumbers(8, 12, 18);
        assertEquals(true, ex6.isGeometricSequence());
        
    }
    @Test
    public void testSortNums()
    {
        ThreeNumbers ex1 = new ThreeNumbers();
        ex1.sortNums();
        assertEquals(1, ex1.getNum1());
        assertEquals(2, ex1.getNum2());
        assertEquals(3, ex1.getNum3());
        
        ThreeNumbers ex2 = new ThreeNumbers(-5, -9, 0);
        ex2.sortNums();
        assertEquals(-9, ex2.getNum1());
        assertEquals(-5, ex2.getNum2());
        assertEquals(0, ex2.getNum3());
        
        ThreeNumbers ex3 = new ThreeNumbers(9, 4, -1);
        ex3.sortNums();
        assertEquals(-1, ex3.getNum1());
        assertEquals(4, ex3.getNum2());
        assertEquals(9, ex3.getNum3());
    }
}
