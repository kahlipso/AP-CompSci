import java.util.ArrayList;

/**
 * Vial - a container used in an apothecary.  
 *        A vial can either be empty or contain one or more potions.
 *        A vial can hold at most 100 grams of potion.
 */
public class Vial
{
    /** Create an instance variable here to hold an UNKNOWN number of potions.  
     *  Think which data structure would be best for this.    
     */
    
    private ArrayList<Potion> mixture;
    private double currentGrams;
    private ArrayList<String> unique;
    /**
     * Constructor for objects of class Vials
     */
    public Vial()
    {
        mixture = new ArrayList<>();
        unique = new ArrayList<>();
        currentGrams = 0;
    }
    
      /**
     *  Return the number of different potions in the vial
     */
    public int count()
    {

        return unique.size();
    }
    
    /**
     * Get the quantity of a particular potion in the vial
     */    
    public double getQuantity(String potionName)
    {
        double count = 0;
        for (Potion potion : mixture) {
            if (potion.getDescription().equals(potionName)) {
                count += potion.getQuantity();
            }
        }
        return count;
    }    

    /**
     * Get the quantity (weight in grams) of the entire vial
     */    
    public double getQuantity()
    {
        // You code this
        return currentGrams;
    }

    /**
     * Get the contents of the vial in roster form, each potion on a new line  
     *    (check the tester for the proper output format)
     */         
    public String toString()
    {
        String output  ="";
        if(!mixture.isEmpty())
        {
            for(int i = 0; i < mixture.size() -1; i++)
            {
                output += mixture.get(i).getQuantity() + " grams of " + mixture.get(i).getDescription() + "\n";
            }

            output +=mixture.getLast().getQuantity() + " grams of " + mixture.getLast().getDescription();
        }

        return output;
    }

    public boolean equals(Object obj)
    {

        return false;
    }

    /**
     * Add a potion to the vial
     * 
     *  - If adding the potion would cause the vial to contain more than 100       
     *    grams of substance, add none of it and return false.  
     *    Otherwise, add the substance and return true.
     *    
     *  - If the potion is already in the vial, do not add a new instance of 
     *    the potion to the vial.  Instead, update the quantity of the
     *    existing potion. No potion should be in the vial more than once. 
     */
    public boolean addPotion(Potion potion)
    {
        if(currentGrams + potion.getQuantity() <=100)
        {
            if(mixture.isEmpty() || isUnique(potion))
            {
                unique.add(potion.getDescription());

            }
            mixture.add(potion);
            currentGrams += potion.getQuantity();

            return true;
        }



       return false;
    }

    private boolean isUnique(Potion pot)
    {
        for(int i = 0; i < mixture.size(); i++)
        {
            if(pot.getDescription().equals(mixture.get(i).getDescription()))
            {
                return false;
            }
        }
        return true;
    }
    
    public String toStringAsPercent()
    {
      // You may or may not be asked to code this... ask Mrs. Bar
      return null;
    }

    public Potion getPrimary()
    {
        // You may or may not be asked to code this... ask Mrs. Bar
        return null;
    }

}
