
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
 * The test class ExamScoresTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExamScoresTester
{
    /**
     * Default constructor for test class ExamScoresTester
     */
    public ExamScoresTester()
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
    public void testNumberCorrect()
    {
        String[][] resp = { {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
                {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
                {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
                {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"} };

        String[] key = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};

        ExamScores test1 = new ExamScores(resp, key);

        assertEquals(7, test1.numberCorrect(0));
        assertEquals(6, test1.numberCorrect(1));
        assertEquals(5, test1.numberCorrect(2));
        assertEquals(4, test1.numberCorrect(3));
        assertEquals(8, test1.numberCorrect(4));
        assertEquals(7, test1.numberCorrect(5));
        assertEquals(7, test1.numberCorrect(6));
        assertEquals(7, test1.numberCorrect(7));

    }

    @Test
    public void testCorrectSummary()
    {
        String[][] resp = { {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
                {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
                {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
                {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"} };

        String[] key = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};

        ExamScores test1 = new ExamScores(resp, key);

        int[] expectedResult = {7, 6, 5, 4, 8, 7, 7, 7}; 
        int[] result = test1.correctSummary();
        assertTrue(Arrays.equals(expectedResult, result));
    }

    @Test
    public void testClassAverage()
    {
        String[][] resp = { {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
                {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
                {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
                {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"} };

        String[] key = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};

        ExamScores test1 = new ExamScores(resp, key);

        assertEquals(6.4, test1.classAverage(), 1e-14);
    }
}

