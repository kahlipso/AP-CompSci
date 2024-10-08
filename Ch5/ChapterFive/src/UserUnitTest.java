
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UserUnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UserUnitTest
{
    /**
     * Default constructor for test class UserUnitTest
     */
    public UserUnitTest()
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
        User user1 = new User("j@nths.com", "Abcdefg2");
        assertEquals("j@nths.com", user1.getUsername());
        assertEquals("Abcdefg2", user1.getPassword());
        assertEquals(0, user1.getPasswordChange());

        User user2 = new User();
        assertEquals(0, user2.getPasswordChange());

    }

    @Test
    public void testSetter()
    {
        User user1 = new User();
        user1.setPassword("Bananas5");
        user1.setUsername("computerScience@aol.com");
        assertEquals("computerScience@aol.com", user1.getUsername());
        assertEquals("Bananas5", user1.getPassword());
        user1.setPasswordChange(55);
        assertEquals(55, user1.getPasswordChange());
        user1.setPassword("Rstuv333");  // When re-setting password, does passwordChange go back to 0?
        assertEquals(0, user1.getPasswordChange());

    }

    @Test
    public void testValidUsername()
    {
        User user1 = new User("j@nths.com", "Abcdefg2");
        User user2 = new User("@gmail.com", "Bbbbbbb8");
        User user3 = new User("adam.com@gmail", "Trewrew9");
        User user4 = new User("bob@nt.com.hs", "Jjjjjjj7");
        User user5 = new User("julie@nths.net", "Ttttttt0");
        User user6 = new User("julie@nths.com", "Trevs9");
        User user7 = new User("julie@nths.com", "trevian9");
        User user8 = new User("julie@nths.com", "TrevianY");

        assertEquals(true, user1.isValidUsername());
        assertEquals(false, user2.isValidUsername());
        assertEquals(false, user3.isValidUsername());
        assertEquals(false, user4.isValidUsername());
        assertEquals(false, user5.isValidUsername());
        assertEquals(true, user6.isValidUsername());
        assertEquals(true, user7.isValidUsername());
        assertEquals(true, user8.isValidUsername());

    }

    @Test
    public void testValidPasswords()
    {
        User user1 = new User("j@nths.com", "Abcdefg2");
        User user2 = new User("@gmail.com", "Bbbbbbb8");
        User user3 = new User("adam.com@gmail", "Trewrew9");
        User user4 = new User("bob@nt.com.hs", "Jjjjjjj7");
        User user5 = new User("julie@nths.net", "Ttttttt0");
        User user6 = new User("julie@nths.com", "Trevs9");
        User user7 = new User("julie@nths.com", "trevian9");
        User user8 = new User("julie@nths.com", "TrevianY");

        assertEquals(true, user1.isValidPassword());
        assertEquals(true, user2.isValidPassword());
        assertEquals(true, user3.isValidPassword());
        assertEquals(true, user4.isValidPassword());
        assertEquals(true, user5.isValidPassword());
        assertEquals(false, user6.isValidPassword());
        assertEquals(false, user7.isValidPassword());
        assertEquals(false, user8.isValidPassword());

    }

    @Test
    public void testAdvanceDayAndCheckPassword()
    {
        User user1 = new User("j@nths.com", "Abcdefg2");
        user1.advanceDay();
        assertEquals(1, user1.getPasswordChange());
        user1.advanceDay();
        user1.advanceDay();
        user1.advanceDay();
        user1.advanceDay();
        assertEquals(5, user1.getPasswordChange());

    }
}
