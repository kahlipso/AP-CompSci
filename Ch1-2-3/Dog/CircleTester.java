

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CircleTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CircleTester
{
    /**
     * Default constructor for test class CircleTester
     */
    public CircleTester()
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
    public void TestConstructorsGettersAndSetters()
    {
        
        Circle c1 = new Circle(6);
        assertEquals(6, c1.getRadius());
                
        c1.setRadius(17);
        assertEquals(17, c1.getRadius());
        
        Circle c2 = new Circle();
        assertEquals(10, c2.getRadius());
        
        c2.setRadius(100);
        assertEquals(100, c2.getRadius());
    }
    
    @Test
    public void TestArea()
    {
        Circle c1 = new Circle(6);
        assertEquals(113.04, c1.computeArea(), 0.0001);
        Circle c2 = new Circle(1);
        assertEquals(3.14, c2.computeArea(), 0.0001);
    }
    @Test
    public void TestCircumference()
    {
        Circle c1 = new Circle(4);
        assertEquals(25.12, c1.computeCircumference(), 0.0001);
        Circle c2 = new Circle(1);
        assertEquals(6.28, c2.computeCircumference(), 0.0001);
    }
    
}
