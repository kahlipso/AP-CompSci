

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HotelTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HotelTester
{
    /**
     * Default constructor for test class HotelTester
     */
    public HotelTester()
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
        Hotel h1 = new Hotel();
        Hotel h2 = new Hotel("Hilton Marco Island", 5, 120, true);
        Hotel h3 = new Hotel("Palmer House");
        
        assertEquals("Default Name", h1.getName());
        assertEquals("Hilton Marco Island", h2.getName());
        assertEquals("Palmer House", h3.getName());
        assertEquals(0, h1.getNumStars());
        assertEquals(5, h2.getNumStars());
        assertEquals(0, h3.getNumStars());
        assertEquals(0.0, h1.getAvgRoomCost(), 1e-14);
        assertEquals(120.0, h2.getAvgRoomCost(), 1e-14);
        assertEquals(0.0, h1.getAvgRoomCost(), 1e-14);
        assertEquals(false, h1.getIsOnBeach());
        assertEquals(true, h2.getIsOnBeach());
        assertEquals(false, h3.getIsOnBeach());
    }
    @Test
    public void testSetters()
    {
        Hotel h1 = new Hotel();
        h1.setNumStars(4);
        h1.setAvgRoomCost(150.00);
        assertEquals(4, h1.getNumStars());
        assertEquals(150.0, h1.getAvgRoomCost(), 1e-14);
        h1.setNumStars(5);
        h1.setAvgRoomCost(225);
        assertEquals(5, h1.getNumStars());
        assertEquals(225.0, h1.getAvgRoomCost(), 1e-14);
    }
    @Test
    public void testCalculateStay()
    {
        Hotel h1 = new Hotel("Hilton Marco Island", 5, 120, true);
        assertEquals(360, h1.calculateAvgCostForStay(3), 1e-14);
        Hotel h2 = new Hotel("Palmer House", 5, 350, false);
        assertEquals(1750, h2.calculateAvgCostForStay(5), 1e-14);
    }
}
