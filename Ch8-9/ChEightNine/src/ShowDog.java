import java.util.ArrayList;

public class ShowDog extends Dog{
    private String breed;
    private ArrayList<String> awards;

    public ShowDog()
    {
        //first line must be a call to super class's constructor
        // if none on first line java puts in super();

        super();
        breed="Default Breed";
        awards = new ArrayList<String>();

        
    }

    public ShowDog(String n, int a, String b)
    {
        super(n,a); //calling the super class's paraterized constructor
        breed=b;
        awards = new ArrayList<String>();
    }

    public String getBreed()
    {
        return breed;
    }

    public ArrayList<String> getAwards()
    {
        ArrayList<String> result= new ArrayList<String>();
        for(String award : awards)
        {
            result.add(award);


        }

        return result;
    }

    public void wonAward(String someAward)
    {
        awards.add(someAward);
    }
    public String toString()
    {
        String result = "";
        for(String a : awards)
        {
            result += a + ", ";

        }
        if(result.length() > 0)
        {
            result = result.substring(0, result.length()-2);
        }
        return super.toString() + "\nBreed: " + breed + "\nAwards: " + result;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof ShowDog))
        {
            return false;
        }

        ShowDog temp = (ShowDog)obj;
        return super.equals(temp) && this.getBreed().equals(temp.getBreed());
    }
}
