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

    public Vial(Potion[] potions)
    {
        for(int i = 0; i < potions.length;i++)
        {
            mixture.add(potions[i]);
        }
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
        if(!(obj instanceof Vial))
        {
            return false;
        }
        Vial v =(Vial) obj;

        if(v.mixture.size() != this.mixture.size())
            return false;

        for(int i = 0; i < mixture.size(); i++)
        {
            if(!v.mixture.contains(mixture.get(i)))
            {
                return false;
            }
        }
        return true;
    }

    public boolean potionFound(ArrayList<Potion> list, Potion potion)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).equals(potion))
            {
                return true;
            }
        }
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
        String output  ="";
        if(!mixture.isEmpty())
        {
            for(int i = 0; i < mixture.size() -1; i++)
            {
                output += mixture.get(i).getDescription() + ": " + ((mixture.get(i).getQuantity()/currentGrams)*100) + "%" + "\n";
            }

            output += mixture.getLast().getDescription() + ": " + ((mixture.getLast().getQuantity()/currentGrams)*100)+ "%";
        }

        return output;
    }

    public Potion getPrimary()
    {
        Potion p = new Potion("", 0);

        if(mixture.isEmpty())
        {
            return null;
        }

        for(int i =0; i < mixture.size(); i++)
        {
            if(mixture.get(i).getQuantity() > p.getQuantity())
            {
                p = mixture.get(i);
            }
        }
        // You may or may not be asked to code this... ask Mrs. Bar
        return p;
    }

}
