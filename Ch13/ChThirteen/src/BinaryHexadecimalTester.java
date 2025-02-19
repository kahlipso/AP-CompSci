
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BinaryTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BinaryHexadecimalTester
{
    /**
     * Default constructor for test class BinaryTester
     */
    public BinaryHexadecimalTester()
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
    public void convertToBase2Tester()
    {
        assertEquals("1010", BinaryConverter.convertToBase2(10));
        assertEquals("1", BinaryConverter.convertToBase2(1));
        assertEquals("10", BinaryConverter.convertToBase2(2));
        assertEquals("1111", BinaryConverter.convertToBase2(15));
        assertEquals("1101", BinaryConverter.convertToBase2(13));
        assertEquals("1100110", BinaryConverter.convertToBase2(102));
        assertEquals("10000001", BinaryConverter.convertToBase2(129));
        assertEquals("11101101", BinaryConverter.convertToBase2(237));

    }

    @Test    
    public void convertFromBase2ToBase10Tester()
    {
        assertEquals(10, BinaryConverter.convertToBase10("1010"));
        assertEquals(1, BinaryConverter.convertToBase10("1"));
        assertEquals(3, BinaryConverter.convertToBase10("11"));
        assertEquals(15, BinaryConverter.convertToBase10("1111"));
        assertEquals(102, BinaryConverter.convertToBase10("1100110"));
        assertEquals(68, BinaryConverter.convertToBase10("1000100"));
        assertEquals(59, BinaryConverter.convertToBase10("111011"));
        assertEquals(22, BinaryConverter.convertToBase10("10110"));
    }

    @Test
    public void convertToBase16Tester()
    {
        assertEquals("A", HexadecimalConverter.convertToBase16(10));
        assertEquals("1", HexadecimalConverter.convertToBase16(1));
        assertEquals("C", HexadecimalConverter.convertToBase16(12));
        assertEquals("F", HexadecimalConverter.convertToBase16(15));
        assertEquals("10", HexadecimalConverter.convertToBase16(16));
        assertEquals("11", HexadecimalConverter.convertToBase16(17));
        assertEquals("BB", HexadecimalConverter.convertToBase16(187));
        assertEquals("87", HexadecimalConverter.convertToBase16(135));
        assertEquals("5D", HexadecimalConverter.convertToBase16(93));
        assertEquals("111", HexadecimalConverter.convertToBase16(273));
        assertEquals("CAB", HexadecimalConverter.convertToBase16(3243));

    }

    @Test
    public void convertFromBase16toBase10Tester()
    {
        assertEquals(10, HexadecimalConverter.convertToBase10("A"));
        assertEquals(11, HexadecimalConverter.convertToBase10("B"));
        assertEquals(1, HexadecimalConverter.convertToBase10("1"));
        assertEquals(15, HexadecimalConverter.convertToBase10("F"));
        assertEquals(16, HexadecimalConverter.convertToBase10("10"));
        assertEquals(17, HexadecimalConverter.convertToBase10("11"));
        assertEquals(187, HexadecimalConverter.convertToBase10("BB"));
        assertEquals(135, HexadecimalConverter.convertToBase10("87"));
        assertEquals(93, HexadecimalConverter.convertToBase10("5D"));
        assertEquals(273, HexadecimalConverter.convertToBase10("111"));
        assertEquals(3243, HexadecimalConverter.convertToBase10("CAB"));
    }
}
