
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class MagicSqTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MagicSqTester
{
    /**
     * Default constructor for test class MagicSqTester
     */
    public MagicSqTester()
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
    public void tester()
    {
        int[][] temp1 = {{4,9,2},{3,5,7},{8,1,6}};
        MagicSquare magicSqu1 = new MagicSquare(temp1);
        assertTrue(magicSqu1.isMagicSquare());
        assertEquals(15, magicSqu1.getMagicNumber());

        int[][] temp2 = {{4,9,2},{3,5,7},{8,2,6}};
        MagicSquare magicSqu2 = new MagicSquare(temp2);
        assertFalse(magicSqu2.isMagicSquare());
        assertEquals(-1, magicSqu2.getMagicNumber());

        int[][] temp3 = {{11,18,25,2,9},
                {10,12,19,21,3},
                {4,6,13,20,22},
                {23,5,7,14,16},
                {17,24,1,8,15}}; 
        MagicSquare magicSqu3 = new MagicSquare(temp3);
        assertTrue(magicSqu3.isMagicSquare());
        assertEquals(65, magicSqu3.getMagicNumber());

        int[][] temp4 = {{11,18,25,2,9},
                {10,12,19,21,3},
                {4,6,13,20,22},
                {23,4,7,14,16},
                {17,24,1,8,15}}; 
        MagicSquare magicSqu4 = new MagicSquare(temp4);
        assertFalse(magicSqu4.isMagicSquare());

        int[][] temp5 = {{7, 12, 1, 14},
                {2, 13, 8, 11},
                {16, 3, 10, 5},
                {9, 6, 15, 4}}; 
        MagicSquare magicSqu5 = new MagicSquare(temp5);
        assertTrue(magicSqu5.isMagicSquare());
        assertEquals(34, magicSqu5.getMagicNumber());
    }
}
