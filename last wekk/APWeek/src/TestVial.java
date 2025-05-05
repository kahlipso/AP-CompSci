import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestVial.
 *
 */
public class TestVial
{
    /**
     * Default constructor for test class TestVial
     */
    public TestVial()
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
    public void testAddPotionAndCount()
    {
        Vial vial1 = new Vial();
        assertEquals(0, vial1.count());
        Potion p1 = new Potion("sulfur",98.2);
        Potion p2 = new Potion("water",1.8);
        assertEquals(true,vial1.addPotion(p1));
        assertEquals(1, vial1.count());
        assertEquals(true,vial1.addPotion(p2));
        assertEquals(2, vial1.count());
        Potion p3 = new Potion("oil", 0.1);
        assertEquals(false,vial1.addPotion(p3));  //overflows
        assertEquals(2, vial1.count());
        
        Vial vial2 = new Vial();
        assertEquals(0, vial2.count());
        Potion p4 = new Potion("sulfur",53.2);
        Potion p5 = new Potion("water",1.8);
        assertEquals(true,vial2.addPotion(p4));
        assertEquals(1, vial2.count());
        assertEquals(true,vial2.addPotion(p5));
        assertEquals(2, vial2.count());
        Potion p6 = new Potion("sulfur", 6.4);
        assertEquals(true,vial2.addPotion(p6));  //adds sulfur again but should still have 2 potions
        assertEquals(2, vial2.count());
        
    }
    @Test
    public void testAddPotionGetQuantity1()  //tests the first getQuantity method with a parameter
    {
        Vial vial1 = new Vial();
        assertEquals(0.0, vial1.getQuantity("phosphor"), 0.001);
        Potion potion1 = new Potion("phosphor", 98.9);
        assertEquals(true,vial1.addPotion(potion1));
        assertEquals(98.9, vial1.getQuantity("phosphor"), 0.001);
        Potion potion2 = new Potion("sulfur", 1.0);
        assertEquals(true,vial1.addPotion(potion2));
        assertEquals(1.0, vial1.getQuantity("sulfur"), 0.001);
        Potion potion3 = new Potion("water", 2.0);
        assertEquals(false,vial1.addPotion(potion3));  // would be more than 100
        
        Vial vial2 = new Vial();
        Potion potion4 = new Potion("phosphor",52.3);
        Potion potion5 = new Potion("sulfur",4.1);
        Potion potion6 = new Potion("phosphor",5.2);
        assertEquals(true,vial2.addPotion(potion4));
        assertEquals(true,vial2.addPotion(potion5));
        assertEquals(52.3,vial2.getQuantity("phosphor"),0.001);
        assertEquals(4.1,vial2.getQuantity("sulfur"),0.001);
        assertEquals(true,vial2.addPotion(potion6));
        assertEquals(57.5,vial2.getQuantity("phosphor"),0.001); // adds more phosphor... students might not have done add right still
        
        Potion potion7 = new Potion("sulfur", 10.5);
        Potion potion8 = new Potion("water", 30.2);
        Potion potion9 = new Potion("iron", 12.0);
        Potion potion10 = new Potion("essence of lavender", 0.05);
        Potion potion11 = new Potion("oil", 24.1);
        Vial vial3 = new Vial();
        assertEquals(0.0, vial3.getQuantity("iron"), 0.001);
        assertEquals(true, vial3.addPotion(potion7));
        assertEquals(true, vial3.addPotion(potion8));       
        assertEquals(true, vial3.addPotion(potion9));
        assertEquals(true, vial3.addPotion(potion10));
        assertEquals(true, vial3.addPotion(potion11));
        assertEquals(30.2, vial3.getQuantity("water"), 0.001);
        assertEquals(10.5, vial3.getQuantity("sulfur"), 0.001);
        assertEquals(24.1, vial3.getQuantity("oil"), 0.001);
        assertEquals(0.05, vial3.getQuantity("essence of lavender"), 0.001);
        assertEquals(12.0, vial3.getQuantity("iron"), 0.001);
        assertEquals(false, vial3.addPotion(potion11));
        assertEquals(24.1, vial3.getQuantity("oil"), 0.001);
        assertEquals(true, vial3.addPotion(potion10));                 
        assertEquals(0.1, vial3.getQuantity("essence of lavender"), 0.001);
    }
    
    @Test
    public void testAddPotionGetQuantity2()  //tests the second getQuantity method with no parameter
    {
        Vial vial1 = new Vial();
        assertEquals(0.0, vial1.getQuantity(), 0.001);
        Potion potion1 = new Potion("phosphor", 98.9);
        assertEquals(true,vial1.addPotion(potion1));
        assertEquals(98.9, vial1.getQuantity(), 0.001);
        Potion potion2 = new Potion("sulfur", 1.0);
        assertEquals(true,vial1.addPotion(potion2));
        assertEquals(99.9, vial1.getQuantity(), 0.001);
        Potion potion3 = new Potion("water", 2.0);
        assertEquals(false,vial1.addPotion(potion3));  // would be more than 100
        
        Vial vial2 = new Vial();
        Potion potion4 = new Potion("phosphor",52.3);
        Potion potion5 = new Potion("sulfur",4.1);
        Potion potion6 = new Potion("phosphor",5.2);
        assertEquals(true,vial2.addPotion(potion4));
        assertEquals(52.3,vial2.getQuantity(),0.001);
        assertEquals(true,vial2.addPotion(potion5));
        assertEquals(56.4,vial2.getQuantity(),0.001);
        assertEquals(true,vial2.addPotion(potion6));
        assertEquals(61.6,vial2.getQuantity(),0.001);  //students might not have done add correctly still

        Potion potion7 = new Potion("sulfur", 10.5);
        Potion potion8 = new Potion("water", 30.2);
        Potion potion9 = new Potion("iron", 12.0);
        Potion potion10 = new Potion("essence of lavender", 0.05);
        Potion potion11 = new Potion("oil", 24.1);
        Vial vial3 = new Vial();
        assertEquals(0.0, vial3.getQuantity(), 0.001);
        assertEquals(true, vial3.addPotion(potion7));
        assertEquals(10.5, vial3.getQuantity(), 0.001);
        assertEquals(true, vial3.addPotion(potion8)); 
        assertEquals(40.7, vial3.getQuantity(), 0.001);
        assertEquals(true, vial3.addPotion(potion9));
        assertEquals(52.7, vial3.getQuantity(), 0.001);
        assertEquals(true, vial3.addPotion(potion10));
        assertEquals(52.75, vial3.getQuantity(), 0.001);
        assertEquals(true, vial3.addPotion(potion11));
        assertEquals(76.85, vial3.getQuantity(), 0.001);          
        assertEquals(false, vial3.addPotion(potion11));
        assertEquals(76.85, vial3.getQuantity(), 0.001);
        assertEquals(true, vial3.addPotion(potion10));                 
        assertEquals(76.9, vial3.getQuantity(), 0.001);
    }
    
    @Test
    public void testToString()
    {
        Vial vial1 = new Vial();
        Vial vial2 = new Vial();
        
        assertEquals("", vial1.toString());
        Potion p1 = new Potion("sulfur",98.2);
        Potion p2 = new Potion("water",1.8);
        
        assertEquals(true,vial1.addPotion(p1));
        assertEquals("98.2 grams of sulfur", vial1.toString());
        assertEquals(true, vial1.addPotion(p2));
        assertEquals("98.2 grams of sulfur\n1.8 grams of water", vial1.toString());
  
        assertEquals(true,vial2.addPotion(p2));
        assertEquals("1.8 grams of water", vial2.toString());
        assertEquals(true, vial2.addPotion(p1));
        assertEquals("1.8 grams of water\n98.2 grams of sulfur", vial2.toString());
    }
    @Test
    public void testEqualsMethod()  
    {
        //tests potions in same order
        Vial vial1 = new Vial();
        Vial vial2 = new Vial();
        assertTrue(vial1.equals(vial2));
        Potion p1 = new Potion("sulfur",98.2);
        Potion p2 = new Potion("water",1.8);
        assertEquals(true,vial1.addPotion(p1));
        assertFalse(vial1.equals(vial2));
        assertEquals(true, vial2.addPotion(p1));
        assertTrue(vial1.equals(vial2));
        assertEquals(true,vial1.addPotion(p2));
        assertFalse(vial1.equals(vial2));
        assertEquals(true, vial2.addPotion(p2));
        assertTrue(vial1.equals(vial2));
        assertTrue(vial2.equals(vial1));
        
        //tests two vials with same contents but in a different order
        Vial vial3 = new Vial();
        Vial vial4 = new Vial();
        assertTrue(vial3.equals(vial4));
        Potion p3 = new Potion("sulfur",98.2);
        Potion p4 = new Potion("water",1.8);
        assertEquals(true,vial3.addPotion(p3));
        assertEquals(true, vial3.addPotion(p4));
        assertFalse(vial3.equals(vial4));
        assertEquals(true, vial4.addPotion(p4));
        assertEquals(true,vial4.addPotion(p3));
        assertTrue(vial3.equals(vial4));
        assertTrue(vial4.equals(vial3));
    }
   
    
     @Test
     public void testVial_toStringAsPercent()
     {
         Vial vial1 = new Vial();
         assertEquals("", vial1.toString());
        
         Vial vial2 = new Vial();
         Potion potion1 = new Potion("sulfur",4.0);
         Potion potion2 = new Potion("iron",16.0);
         Potion potion3 = new Potion("phosphor",52.5);
         Potion potion4 = new Potion("water",7.5);
         assertEquals(true,vial2.addPotion(potion1));
         assertEquals(true,vial2.addPotion(potion2));
         assertEquals("sulfur: 20.0%\niron: 80.0%", vial2.toStringAsPercent());
         assertEquals(true,vial2.addPotion(potion3));
         assertEquals(true,vial2.addPotion(potion4));
         assertEquals("sulfur: 5.0%\niron: 20.0%\nphosphor: 65.625%\nwater: 9.375%", vial2.toStringAsPercent());
        
        
     }
     @Test
     public void testVial_getPrimary()
     {
         Vial vial1 = new Vial();
         assertEquals(null, vial1.getPrimary());
        
         Vial vial2 = new Vial();
         Potion potion1 = new Potion("sulfur",4.0);
         Potion potion2 = new Potion("iron",16.0);
         Potion potion3 = new Potion("phosphor",52.5);
         Potion potion4 = new Potion("water",3.5);
         assertEquals(true,vial2.addPotion(potion1));
         assertEquals(true,vial2.addPotion(potion2));
         assertEquals(true,vial2.addPotion(potion3));
         assertEquals(true,vial2.addPotion(potion4));
         Potion primary = vial2.getPrimary();
         assertEquals("phosphor", primary.getDescription());
         assertEquals(52.5, primary.getQuantity(), 0.000001);
        
        
     }
}