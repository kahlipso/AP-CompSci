/**
 * Potion - a substance used in an apothecary
 * DO NOT CHANGE THIS CLASS
 */
public class Potion
{
    private String description; //describes the potion
    private double quantity;    //quantity by weight in grams

    /**
     * Constructors for objects of class Potion
     */
    public Potion()
    {
        description = "";
        quantity = 0;
    }
    
    public Potion(String description, double quantity)
    {
        this.description = description;
        this.quantity = quantity;
    }
    
    public String toString()
    {
        return quantity + " grams of " + description;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public double getQuantity()
    {
        return quantity;
    }
    
    public void add(double addAmount)
    {
        quantity += addAmount;
    }
}
