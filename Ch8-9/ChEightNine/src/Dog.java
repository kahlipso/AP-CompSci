
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    private String name;
    private int age;
    
    /* Constructors - initialize all instance variables
       Default Consutructors take in no parameters/info 
    */
    
    public Dog()
    {
        name =  "Max";
        age = 1;
    }
    
    /*
     * Overload the Constructor with a parameterized constructor
     */
    
    public Dog(String sName, int sAge)
    {
        name = sName;
        age = sAge;
    }
    
    /*
     * Methods
     * Getters and Setters
     * Getters - accessor methods
     */
    
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    
    public void setName(String sName)
    {
        name = sName;
    }
    
    public void setAge(int sAge)
    {
        age = sAge;
    }
    
    public void older()
    {
        age++;
    }
    
    public void older(int years)
    {
        age += years;
    }

    public String toString()
    {
        return "Name: " + name + "\nAge: " + age;
    }

    public int sumOfAges(Dog otherDog)
    {
        return this.age + otherDog.age;
    }

    public boolean equals(Object other)
    {
        if(!(other instanceof Dog))
        {
            return false;
        }
        Dog temp = (Dog) other;
        if(this.age == temp.age && this.name.equals(temp.getName()))
        {
            return true;
        }

        return false;
        //Dog temp = (Dog) other;
        //return (this.getAge() == temp.getAge() && this.getName().equals(temp.getName()));

    }
}
