import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tester for MyArt
 *      This tester requires the equals method be correct
 *
*/

public class ArtUnitTest
{
    /**
     * Default constructor for test class TestMethods
     */
    public ArtUnitTest()
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
    public void reflect()
    {
        MyArt myArt1 = new MyArt("testImage.bmp");
        MyArt myArt2 = new MyArt("reflect.bmp");
        assertEquals(false, myArt1.equals(myArt2));
        myArt1.reflect();
        assertEquals(true, myArt1.equals(myArt2));
        myArt2.reflect();
        assertEquals(false, myArt2.equals(myArt1));
        myArt1.reflect();
        assertEquals(true, myArt2.equals(myArt1));
    }
    
    @Test
    public void doubleHorizontal()
    {
        MyArt myArt1 = new MyArt("testImage.bmp");
        MyArt myArt2 = new MyArt("doubleHorizontal.bmp");
        assertEquals(false, myArt1.equals(myArt2));
        assertEquals(false, myArt2.equals(myArt1));
        myArt1.doubleHorizontal();
        assertEquals(true, myArt1.equals(myArt2));
        assertEquals(true, myArt2.equals(myArt1));        
    } 
    
    @Test
    public void doubleVertical()
    {
        MyArt myArt1 = new MyArt("testImage.bmp");
        MyArt myArt2 = new MyArt("doubleVertical.bmp");
        assertEquals(false, myArt1.equals(myArt2));
        assertEquals(false, myArt2.equals(myArt1));
        myArt1.doubleVertical();
        assertEquals(true, myArt1.equals(myArt2));
        assertEquals(true, myArt2.equals(myArt1)); 
    }    
    
    @Test
    public void swapColors()
    {
        MyArt myArt0 = new MyArt("testImage.bmp");
        MyArt myArt1 = new MyArt("swapColors1.bmp");
        MyArt myArt2 = new MyArt("swapColors2.bmp");
        assertEquals(false, myArt0.equals(myArt1));
        assertEquals(false, myArt0.equals(myArt2));
        myArt0.swapColors();
        assertEquals(true, myArt0.equals(myArt1));
        myArt0.swapColors();            
        assertEquals(true, myArt0.equals(myArt2));
        assertEquals(false, myArt0.equals(myArt1));
             
    }  
    
    
    @Test
    public void testBorder()
    {
        /**
         * even x even
         */
        MyArt myArt1 = new MyArt("testImage.bmp");
        MyArt myArt2 = new MyArt("testImageBlackBorder.bmp");
        assertEquals(false, myArt1.equals(myArt2));
        assertEquals(false, myArt2.equals(myArt1));
        myArt1.border();
        assertEquals(true, myArt1.equals(myArt2));
        assertEquals(true, myArt2.equals(myArt1));  
       
        /**
         * odd x odd 
         */
        MyArt myArt3 = new MyArt("testImageOdd.bmp");
        myArt3.border();
        MyArt myArt4 = new MyArt("testImageOddBlackBorder.bmp");
        assertEquals(true,myArt3.equals(myArt4));
        
        /**
         * odd x even
         */
        MyArt myArt5 = new MyArt("testImageOddEven.bmp");
        myArt5.border();
        MyArt myArt6 = new MyArt("testImageOddEvenBlackBorder.bmp");
        assertEquals(true,myArt5.equals(myArt6));
                
        /**
         * even x odd
         */
        MyArt myArt7 = new MyArt("testImageEvenOdd.bmp");
        myArt7.border();
        MyArt myArt8 = new MyArt("testImageEvenOddBlackBorder.bmp");
        assertEquals(true,myArt3.equals(myArt4));
                
        /**
         * Now we will test an un-even border. The original image is 50 x 90 pixels
         * The border should be 2 pixels on the left, 3 pixels on the right 
         *                      4 pixels on the top, 5 pixels on the bottom
         */
        MyArt myArt9 = new MyArt("UnevenTestImage.bmp");
        myArt9.border();
        MyArt myArt10 = new MyArt("UnevenTestImageBlackBorder.bmp");
        assertEquals(true,myArt9.equals(myArt10));
    }       
}


