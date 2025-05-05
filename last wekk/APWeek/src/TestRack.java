
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestRack.
 * Bar - 2023
 */
public class TestRack
{
    /**
     * Default constructor for test class TestRack
     */
    public TestRack()
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
    public void testRackAdd1andCount()  //tests the first add method with a Vial parameter. toString must work
    {
        Rack rack1 = new Rack();
        assertEquals(0, rack1.count());

        Potion potion1 = new Potion("sulfur", 80);
        Potion potion2 = new Potion("elixir", 20);
        Potion potion3 = new Potion("phosphor", 40);
        Potion potion4 = new Potion("brine", 30);
        Vial vial1 = new Vial();
        vial1.addPotion(potion1);
        Vial vial2 = new Vial();
        vial2.addPotion(potion2);
        Vial vial3 = new Vial();
        vial3.addPotion(potion3);
        Vial vial4 = new Vial();
        vial4.addPotion(potion4);

        assertEquals(true, rack1.add(vial1));
        assertEquals(1, rack1.count());    
        assertEquals(true, rack1.add(vial2));
        assertEquals(2, rack1.count());  
        assertEquals(true, rack1.add(vial4));
        assertEquals(true, rack1.add(vial3));
        assertEquals(4, rack1.count());    

        // toString must work to now make sure vials were added in the correct order:
        String expectedResult = "Row 0 Col 0\n80.0 grams of sulfur\n\nRow 0 Col 1\n20.0 grams of elixir\n\nRow 0 Col 2\n30.0 grams of brine\n\nRow 0 Col 3\n40.0 grams of phosphor";
        assertEquals(expectedResult, rack1.toString());

        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(false, rack1.add(vial1));  // rack is full and can not add last potion
    }

    @Test 
    public void testRackAdd2() // tests the second add method with three parameters. ToString must work
    {
        Rack rack1 = new Rack();
        assertEquals(0, rack1.count());

        Potion potion1 = new Potion("sulfur", 80);
        Potion potion2 = new Potion("elixir", 20);
        Potion potion3 = new Potion("phosphor", 40);
        Potion potion4 = new Potion("brine", 30);
        Vial vial1 = new Vial();
        vial1.addPotion(potion1);
        Vial vial2 = new Vial();
        vial2.addPotion(potion2);
        Vial vial3 = new Vial();
        vial3.addPotion(potion3);
        Vial vial4 = new Vial();
        vial4.addPotion(potion4);

        assertEquals(true, rack1.add(vial1, 0, 3));
        assertEquals(1, rack1.count());    
        assertEquals(true, rack1.add(vial2, 2, 7));
        assertEquals(2, rack1.count());  
        assertEquals(true, rack1.add(vial4, 2, 1));
        assertEquals(true, rack1.add(vial3, 1, 7));
        assertEquals(4, rack1.count());   
        assertEquals(false, rack1.add(vial3, 0, 3)); // tries to add vial at an occupied location
        assertEquals(4, rack1.count());   

        // toString must work to now make sure vials were added in the correct order:
        String expectedResult = "Row 0 Col 3\n80.0 grams of sulfur\n\nRow 1 Col 7\n40.0 grams of phosphor\n\nRow 2 Col 1\n30.0 grams of brine\n\nRow 2 Col 7\n20.0 grams of elixir";
        assertEquals(expectedResult, rack1.toString());

        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(true, rack1.add(vial1));
        assertEquals(false, rack1.add(vial1));  // rack is full and can not add last potion
    }

    @Test
    public void testRackGetQuantity1()  // tests Rack class' first getQuantity method with potionName as parameter
    {
        Rack rack1 = new Rack();
        assertEquals(0.0, rack1.getQuantity("sulfur"), 0.001);

        Potion potion1 = new Potion("sulfur", 80);
        Potion potion2 = new Potion("elixir", 20);
        Potion potion3 = new Potion("sulfur", 40);
        Potion potion4 = new Potion("elixir", 30);

        Vial vial1 = new Vial();
        vial1.addPotion(potion1);  //80 sulfur
        vial1.addPotion(potion2);  //20 elixir 

        Vial vial2 = new Vial();
        vial2.addPotion(potion3);  //40 sulfur
        vial2.addPotion(potion4);  //30 elixir

        assertEquals(true, rack1.add(vial1));  
        assertEquals(true, rack1.add(vial2));
        assertEquals(120.0, rack1.getQuantity("sulfur"), 0.001);   
        assertEquals(50.0, rack1.getQuantity("elixir"), 0.001);

        Vial vial3 = new Vial();
        vial3.addPotion(new Potion("elixir", 20));  //20 elixir
        vial3.addPotion(potion3);                   //40 sulfur
        vial3.addPotion(new Potion("elixir", 30));  //30 elixir

        assertEquals(true, rack1.add(vial3));
        assertEquals(160.0, rack1.getQuantity("sulfur"), 0.001);   
        assertEquals(100.0, rack1.getQuantity("elixir"), 0.001); 
        assertEquals(0.0, rack1.getQuantity("brine"), 0.001);   
    }

    @Test
    public void testRackGetQuantity2()  // tests Rack class' second getQuantity method with no parameters
    {
        Rack rack1 = new Rack();
        assertEquals(0.0, rack1.getQuantity("sulfur"), 0.001);

        Potion potion1 = new Potion("sulfur", 80);
        Potion potion2 = new Potion("elixir", 20);
        Potion potion3 = new Potion("sulfur", 40);
        Potion potion4 = new Potion("elixir", 30);

        Vial vial1 = new Vial();
        vial1.addPotion(potion1);  //80 sulfur
        vial1.addPotion(potion2);  //20 elixir 
        assertEquals(true, rack1.add(vial1));  
        assertEquals(100.0, rack1.getQuantity(), 0.001);  

        Vial vial2 = new Vial();
        vial2.addPotion(potion3);  //40 sulfur
        vial2.addPotion(potion4);  //30 elixir
        assertEquals(true, rack1.add(vial2));       
        assertEquals(170.0, rack1.getQuantity(), 0.001);

        Vial vial3 = new Vial();
        vial3.addPotion(new Potion("elixir", 20));  //20 elixir
        vial3.addPotion(potion3);                   //40 sulfur
        vial3.addPotion(new Potion("elixir", 30));  //30 elixir
        assertEquals(true, rack1.add(vial3));
        assertEquals(260.0, rack1.getQuantity(), 0.001);   

    }

    @Test
    public void testRackRemove()
    {
        // Add and count must work for this test
        Vial vial1 = new Vial();
        Vial vial2 = new Vial();
        Vial vial3 = new Vial();
        Vial vial4 = new Vial();
        Potion potion1 = new Potion("sulfur", 45.2);
        Potion potion2 = new Potion("lead", 10.1);
        Potion potion3 = new Potion("ice", 30);
        Potion potion4 = new Potion("elixir", 4.6);
        vial1.addPotion(potion1);
        vial1.addPotion(potion2);
        vial1.addPotion(potion3);
        vial1.addPotion(potion4);
        vial2.addPotion(new Potion("sulfur", 45.2));
        vial2.addPotion(new Potion("ice", 30));
        vial2.addPotion(new Potion("ice", 30));
        vial2.addPotion(new Potion("elixir", 4.6));
        vial3.addPotion(new Potion("ice", 30));

        Rack rack1 = new Rack();
        rack1.add(vial3, 1, 5);
        rack1.add(vial1);
        rack1.add(vial3);
        rack1.add(vial4, 2, 1);
        assertEquals(4, rack1.count());
        assertEquals(vial1, rack1.remove(0, 0));
        assertEquals(3, rack1.count());
        assertEquals(null, rack1.remove(0, 0)); 
        assertEquals(3, rack1.count());  
        assertEquals(vial4, rack1.remove(2, 1));
        assertEquals(2, rack1.count());
    }

    @Test
    public void testRackConsolidate()
    {
        // Add and toString must work for this tester to see if vials consolidated correctly
        Vial vial1 = new Vial();
        Vial vial2 = new Vial();
        Vial vial3 = new Vial();
        Vial vial4 = new Vial();
        Potion potion1 = new Potion("sulfur", 45.2);
        Potion potion2 = new Potion("lead", 10.1);
        Potion potion3 = new Potion("ice", 30);
        Potion potion4 = new Potion("elixir", 4.6);

        vial1.addPotion(potion1);
        vial1.addPotion(potion2);
        vial1.addPotion(potion3);
        vial1.addPotion(potion4);
        vial2.addPotion(new Potion("sulfur", 5.2));
        vial2.addPotion(new Potion("ice", 15));
        vial2.addPotion(new Potion("elixir", 7));
        vial3.addPotion(new Potion("ice", 10));
        vial4.addPotion(new Potion("water", 100));

        Rack rack1 = new Rack();
        assertEquals("", rack1.toString());
        rack1.add(vial4, 1, 5);  // third after consolidate
        rack1.add(vial1);  // 0, 0 - first after consolidate
        rack1.add(vial3);  // 0, 1 - second after consolidate
        rack1.add(vial4, 2, 1);  // fifth after consolidate
        rack1.add(vial3, 2, 2);  // sixth after consolidate
        rack1.add(vial2, 1, 7);  // fourth after consolidate 
        rack1.consolidate();  // vial 1, 3, 4, 2, 4, 3
        //String result = rack1.toString();
        assertEquals("Row 0 Col 0\n45.2 grams of sulfur\n10.1 grams of lead\n30.0 grams of ice\n4.6 grams of elixir\n\nRow 0 Col 1\n10.0 grams of ice\n\nRow 0 Col 2\n100.0 grams of water\n\nRow 0 Col 3\n5.2 grams of sulfur\n15.0 grams of ice\n7.0 grams of elixir\n\nRow 0 Col 4\n100.0 grams of water\n\nRow 0 Col 5\n10.0 grams of ice",rack1.toString());
    }

    @Test
    public void testRackToString()
    {
        Vial vial1 = new Vial();
        Vial vial2 = new Vial();
        Vial vial3 = new Vial();
        Potion potion1 = new Potion("sulfur", 45.2);
        Potion potion2 = new Potion("lead", 10.1);
        Potion potion3 = new Potion("ice", 30);
        Potion potion4 = new Potion("elixir", 4.6);
        vial1.addPotion(potion1);
        vial1.addPotion(potion2);
        vial1.addPotion(potion3);
        vial1.addPotion(potion4);
        vial2.addPotion(new Potion("sulfur", 5.2));
        vial2.addPotion(new Potion("ice", 10));
        vial2.addPotion(new Potion("elixir", 7.7));
        vial3.addPotion(new Potion("ice", 15));
        
        Rack rack1 = new Rack();
        assertEquals("", rack1.toString());
        rack1.add(vial3, 1, 5);
        assertEquals("Row 1 Col 5\n15.0 grams of ice", rack1.toString());
        rack1.add(vial1);
        assertEquals("Row 0 Col 0\n45.2 grams of sulfur\n10.1 grams of lead\n30.0 grams of ice\n4.6 grams of elixir\n\nRow 1 Col 5\n15.0 grams of ice", rack1.toString());
        rack1.add(vial2, 2, 0);
        assertEquals("Row 0 Col 0\n45.2 grams of sulfur\n10.1 grams of lead\n30.0 grams of ice\n4.6 grams of elixir\n\nRow 1 Col 5\n15.0 grams of ice\n\nRow 2 Col 0\n5.2 grams of sulfur\n10.0 grams of ice\n7.7 grams of elixir",rack1.toString());
    }
}

