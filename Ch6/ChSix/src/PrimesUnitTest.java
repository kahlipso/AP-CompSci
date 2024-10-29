
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PrimesUnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PrimesUnitTest
{
    /**
     * Default constructor for test class PrimesUnitTest
     */
    public PrimesUnitTest()
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

    @Test
    public void isPrimeTester()
    {
        assertEquals(true, Primes.isPrime(2));
        assertEquals(false, Primes.isPrime(27));
        assertEquals(true, Primes.isPrime(101));
        assertEquals(false, Primes.isPrime(10));
        assertEquals(true, Primes.isPrime(11));
        assertEquals(false, Primes.isPrime(1349656));
        assertEquals(true, Primes.isPrime(104729));
        assertEquals(false, Primes.isPrime(1));
        assertEquals(false, Primes.isPrime(0));
        assertEquals(false, Primes.isPrime(-2));
    }

    @Test
    public void countPrimeTester()
    {
        assertEquals(1, Primes.countPrimes(2));
        assertEquals(25, Primes.countPrimes(100));
        assertEquals(95, Primes.countPrimes(500));
        assertEquals(3, Primes.countPrimes(5));
        assertEquals(168, Primes.countPrimes(1000));
        assertEquals(0, Primes.countPrimes(-6));
    }

    @Test
    public void sumPrimesTester()
    {
        assertEquals(129, Primes.sumPrimes(10));
        assertEquals(2, Primes.sumPrimes(1));
        assertEquals(0, Primes.sumPrimes(0));
        assertEquals(1593, Primes.sumPrimes(30));
        assertEquals(111587, Primes.sumPrimes(200));
        assertEquals(0, Primes.sumPrimes(-1));
    }

    @Test
    public void averagePrimesTester()
    {       
        assertEquals(5.6, Primes.averagePrimes(5), 0.001);
        assertEquals(3682.913, Primes.averagePrimes(1000), 0.001);
        assertEquals(15214.172324510932, Primes.averagePrimes(3476), 0.0000000001); 
        assertEquals(6.833333333, Primes.averagePrimes(6), 0.000000001);

        // CHALLENGE
        // The last test below will cause what feels like an infinite loop if the isPrime method is not efficient.
        // You do NOT HAVE to pass the following test for full credit, but I want to see who can revise 
        // their isPrime method to make it more efficient and get this test to pass without stalling the program.  
        // assertEquals(23853.3433, Primes.averagePrimes(30000), 0.0001);  
    }

    @Test
    public void primesStringTester()
    {
        String expected10 = "2\n3\n5\n7\n11\n13\n17\n19\n23\n29";
        assertEquals(expected10, Primes.primeString(10));
        String expected2 = "2\n3";
        assertEquals(expected2, Primes.primeString(2));
        String expected0 = "";
        assertEquals(expected0, Primes.primeString(0));

    }
    
    
    // Enhancement we will do later.  
    // Highlight the lines of code below, go to Edit, select Uncomment
    // Test your code
    @Test
    public void testFactor()
    {
        assertEquals("2",Primes.factor(2));
        assertEquals("3*5",Primes.factor(15));
        assertEquals("2*2*5*5",Primes.factor(100));
        assertEquals("3*3*3",Primes.factor(27));
        assertEquals("2*5*11",Primes.factor(110));
        assertEquals("37",Primes.factor(37));
        assertEquals("",Primes.factor(1));
    }
    @Test
    public void testTwinPrimes()
    {
        assertEquals(0,Primes.countTwinPrimes(4));
        assertEquals(1,Primes.countTwinPrimes(6));
        assertEquals(3,Primes.countTwinPrimes(17));
        assertEquals(4,Primes.countTwinPrimes(19));
        assertEquals(8,Primes.countTwinPrimes(100));
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
}
