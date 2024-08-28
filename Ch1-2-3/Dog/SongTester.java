
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SongTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SongTester
{
    /**
     * Default constructor for test class SongTester
     */
    public SongTester()
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
    public void testConstructorsAndGetters()
    {
        Song s1 = new Song();
        Song s2 = new Song("New Trier Fight Song", 44, 0.99, true);
        Song s3 = new Song("ABC", 39, 0.25);

        assertEquals("N/A", s1.getTitle());
        assertEquals("New Trier Fight Song", s2.getTitle());
        assertEquals("ABC", s3.getTitle());
        assertEquals(0, s1.getDuration());
        assertEquals(44, s2.getDuration());
        assertEquals(39, s3.getDuration());
        assertEquals(0, s1.getCost(), 1e-14);
        assertEquals(0.99, s2.getCost(), 1e-14);
        assertEquals(0.25, s3.getCost(), 1e-14);
        assertEquals(false, s1.getIsInLibrary());
        assertEquals(true, s2.getIsInLibrary());
        assertEquals(false, s3.getIsInLibrary());
    }

    @Test
    public void testSetters()
    {
        Song s1 = new Song("New Trier Fight Song", 44, 0.99, true);
        s1.setCost(1.50);
        s1.setIsInLibrary(false);
        assertEquals(1.50, s1.getCost(), 1e-14);
        assertEquals(false, s1.getIsInLibrary());
        s1.setCost(1.99);
        s1.setIsInLibrary(true);
        assertEquals(1.99, s1.getCost(), 1e-14);
        assertEquals(true, s1.getIsInLibrary());
    }
    
    @Test
    public void testCalculateTax()
    {
        Song s1 = new Song("New Trier Fight Song", 44, 1.00, true);
        assertEquals(0.10, s1.calculateTax(), 1e-14);
        s1.setCost(2.00);
        assertEquals(0.20, s1.calculateTax(), 1e-14);
        s1.setCost(12.00);
        assertEquals(1.20, s1.calculateTax(), 1e-14);
    }
}
