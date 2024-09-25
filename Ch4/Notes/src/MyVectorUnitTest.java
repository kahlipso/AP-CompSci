

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyVectorUnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyVectorUnitTest
{
    /**
     * Default constructor for test class MyVectorUnitTest
     */
    public MyVectorUnitTest()
    {
    }

    public static final double EPSILON = 1e-14;
    
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
    public void testParameterizedConstructorGettersSetters()
    {
        MyVector vector1 =  new MyVector(4, -11);
        assertEquals(4, vector1.getX());
        assertEquals(-11, vector1.getY());
        vector1.setX(-17);
        vector1.setY(21);
        assertEquals(-17, vector1.getX());
        assertEquals(21, vector1.getY());
    }
    @Test
    public void testDefaultConstructor()
    {
        int number = 20000;
        MyVector [] vectorArray = new MyVector[number];
        for(int i = 0; i < vectorArray.length; i++)
        {
            vectorArray[i] = new MyVector();
        }
        for(int i = 0; i < vectorArray.length;i++)
        {
            assertTrue(vectorArray[i].getX() <=10 && vectorArray[i].getX() >= -10);
            assertTrue(vectorArray[i].getY() <=10 && vectorArray[i].getY() >= -10);
        }
        boolean lowerBound1 = false; 
        boolean lowerBound2 = false;
        boolean upperBound1 = false;
        boolean upperBound2 = false;

        for(int i = 0; i < vectorArray.length;i++)
        {
            if(vectorArray[i].getX() == -10)
                lowerBound1 = true;
            else if(vectorArray[i].getY() == -10)
                lowerBound2 = true;
            else if(vectorArray[i].getX() == 10)
                upperBound1 = true;
            else if(vectorArray[i].getY() == 10)
                upperBound2 = true;
        }
        assertTrue(lowerBound1 && lowerBound2);
        assertTrue(upperBound1 && upperBound2);

    }
    
    @Test
    public void testMagnitude()
    {
        MyVector vector2 =  new MyVector(4, -3);
        assertEquals(5, vector2.magnitude(), EPSILON);
        MyVector vector3 =  new MyVector(0, 0);
        assertEquals(0, vector3.magnitude(), EPSILON);
    }
    
    @Test
    public void testDilate()
    {
        MyVector vector1 =  new MyVector(4, -3);
        vector1.dilate(4);
        assertEquals(16, vector1.getX());
        assertEquals(-12, vector1.getY());
        vector1.dilate(-1);
        assertEquals(-16, vector1.getX());
        assertEquals(12, vector1.getY());
        
        MyVector vector2 =  new MyVector(0, 0);
        vector2.dilate(15);
        assertEquals(0, vector2.getX());
        assertEquals(0, vector2.getY());
        
        MyVector vector3 =  new MyVector(-5, 3);
        vector3.dilate(3.5);
        assertEquals(-17, vector3.getX());
        assertEquals(11, vector3.getY());
        
    }
    
    @Test
    public void testDot()
    {
        MyVector vector1 =  new MyVector(0, 3);
        MyVector vector2 = new MyVector(5, 0);
        assertEquals(0, vector1.dot(vector2));
        MyVector vector3 = new MyVector(-4, 5);
        assertEquals(15, vector1.dot(vector3));
        MyVector vector4 = new MyVector(-1, -3);
        assertEquals(-11, vector3.dot(vector4));
        
    }
    
    
    @Test
    public void testAngle()
    {
        MyVector vector1 =  new MyVector(0, 3);
        MyVector vector2 = new MyVector(5, 0);
        assertEquals(90, vector1.angle(vector2), EPSILON);
        MyVector vector3 = new MyVector(3, 4);
        assertEquals(36.869898, vector3.angle(vector1), EPSILON); 
        
        MyVector vector4 = new MyVector(-2,8);
        MyVector vector5 = new MyVector(4,9);
        assertEquals(37.998732,vector4.angle(vector5),EPSILON);  //37.9987324425 Did not need to round
        
        MyVector vector6 = new MyVector(2,3);
        MyVector vector7 = new MyVector(-1,4);
        assertEquals(47.726311,vector6.angle(vector7),EPSILON); //47.7263109939 Rounded up
    }
    
    @Test
    public void testIsOrthagonal()
    {
        MyVector vector1 =  new MyVector(0, 3);
        MyVector vector2 = new MyVector(5, 0);
        assertEquals(true, vector1.isOrthogonal(vector2));
        MyVector vector3 = new MyVector(3, 4);
        assertEquals(false, vector1.isOrthogonal(vector3));
    }
    
    @Test
    public void testToString()
    {
        MyVector vector1 =  new MyVector(0, 3);
        assertEquals("<0,3>", vector1.toString());
    }
    
    
}
