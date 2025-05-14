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
    
    private ArrayList<Potion> mix;
    private double amount;
    private ArrayList<String> unique;


    /**
     * Constructor for objects of class Vials
     */
    public Vial()
    {
        mix = new ArrayList<>();
        unique = new ArrayList<>();
        amount = 0;
    }

    public Vial(Potion[] potions)
    {
        for(int i = 0; i < potions.length;i++)
        {
            mix.add(potions[i]);
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
        for (Potion potion : mix) {
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
        return amount;
    }

    /**
     * Get the contents of the vial in roster form, each potion on a new line  
     *    (check the tester for the proper output format)
     */         
    public String toString()
    {
        String output  ="";
        if(!mix.isEmpty())
        {
            for(int i = 0; i < mix.size() -1; i++)
            {
                output += mix.get(i).getQuantity() + " grams of " + mix.get(i).getDescription() + "\n";
            }

            output +=mix.getLast().getQuantity() + " grams of " + mix.getLast().getDescription();
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

        if(v.mix.size() != this.mix.size())
            return false;

        for(int i = 0; i < mix.size(); i++)
        {
            if(!v.mix.contains(mix.get(i)))
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
        if(amount + potion.getQuantity() <=100)
        {
            if(mix.isEmpty() || isUnique(potion))
            {
                unique.add(potion.getDescription());

            }
            mix.add(potion);
            amount += potion.getQuantity();

            return true;
        }



       return false;
    }

    private boolean isUnique(Potion pot)
    {
        for(int i = 0; i < mix.size(); i++)
        {
            if(pot.getDescription().equals(mix.get(i).getDescription()))
            {
                return false;
            }
        }
        return true;
    }
    
    public String toStringAsPercent()
    {
        String output  ="";
        if(!mix.isEmpty())
        {
            for(int i = 0; i < mix.size() -1; i++)
            {
                output += mix.get(i).getDescription() + ": " + ((mix.get(i).getQuantity()/amount)*100) + "%" + "\n";
            }

            output += mix.getLast().getDescription() + ": " + ((mix.getLast().getQuantity()/amount)*100)+ "%";
        }

        return output;
    }

    public Potion getPrimary()
    {
        Potion p = new Potion("", 0);

        if(mix.isEmpty())
        {
            return null;
        }

        for(int i =0; i < mix.size(); i++)
        {
            if(mix.get(i).getQuantity() > p.getQuantity())
            {
                p = mix.get(i);
            }
        }
        // You may or may not be asked to code this... ask Mrs. Bar
        return p;
    }

}
