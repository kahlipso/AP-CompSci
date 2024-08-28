

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HouseTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HouseTester
{
    public static final double EPSILON = 1e-14;
    
    /**
     * Default constructor for test class HouseTester
     */
    public HouseTester()
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
        House h1 = new House();
        House h2 = new House(200000, "Glencoe");

        
        assertEquals(100000, h1.getValue(), EPSILON);
        assertEquals("Chicago", h1.getCity());
        assertEquals(200000, h2.getValue(), EPSILON);
        assertEquals("Glencoe", h2.getCity());

       
    }
    @Test
    public void testSetters()
    {
        House h1 = new House();
        h1.setCity("New York");
        assertEquals("New York", h1.getCity());
        h1.setValue(600000);
        assertEquals(600000, h1.getValue(), EPSILON);
        
    }
    @Test
    public void testIncreaseValue()
    {
        House h1 = new House();
        h1.increaseValue();
        assertEquals(102000, h1.getValue(), EPSILON);
        
        House h2 = new House();
        h2.increaseValue(0.05);
        assertEquals(105000, h2.getValue(), EPSILON);
    }
}
