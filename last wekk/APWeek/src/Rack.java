import java.util.ArrayList;

public class Rack {

    private Vial[][] rack;

    public Rack()
    {
        rack = new Vial[3][8];
    }

    public boolean add(Vial vial)
    {
        for(int r = 0; r < rack.length; r++)
        {
            for(int c = 0; c < rack[0].length; c++)
            {
                if(rack[r][c] == null)
                {
                    rack[r][c] = vial;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean add(Vial vial, int row, int col)
    {
        if(rack[row][col] == null)
        {
            rack[row][col] = vial;
            return true;
        }

        return false;
    }


    //number of vials
    public int count()
    {
        int count = 0;
        for(int r = 0; r < rack.length; r++)
        {
            for(int c = 0; c < rack[0].length; c++)
            {
                if(rack[r][c] != null)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public double getQuantity(String potionName)
    {
        double count = 0;
        for(int r = 0; r < rack.length; r++)
        {
            for(int c = 0; c < rack[0].length; c++)
            {
                if(rack[r][c] != null && rack[r][c].toString().contains(potionName))
                {
                    count += rack[r][c].getQuantity(potionName);
                }
            }
        }
        return count;
    }

    //weight of the entire rack
    public double getQuantity()
    {
        double count = 0;
        for(int r = 0; r < rack.length; r++)
        {
            for(int c = 0; c < rack[0].length; c++)
            {
                if(rack[r][c] != null)
                {
                    count += rack[r][c].getQuantity();
                }
            }
        }
        return count;
    }

    public Vial remove(int row, int col)
    {
        if(rack[row][col] != null)
        {
            Vial v = rack[row][col];
            rack[row][col] = null;
            return v;
        }
        return null;
    }

    public void consolidate()
    {
        ArrayList<Vial> vials = new ArrayList<>();
        Vial[][] newRack = new Vial[3][8];

        for(int r = 0; r < rack.length; r++)
        {
            for(int c = 0; c < rack[0].length; c++)
            {
                if(rack[r][c] != null)
                {
                    vials.add(rack[r][c]);
                }
            }
        }

        int index = 0;
        for(int r = 0; r < newRack.length; r++)
        {
            for(int c = 0; c < newRack[0].length; c++)
            {
                if(index < vials.size())
                {
                    rack[r][c] = vials.get(index);
                    index++;
                }
                else {
                    rack[r][c] = null;
                }
            }
        }
    }

    public String toString()
    {
        String s = "";

        for(int r = 0; r < rack.length; r++)
        {
            for(int c = 0; c < rack[0].length; c++)
            {
                if(rack[r][c] != null)
                {
                    s = s + "Row " + r + " Col " + c + "\n" + rack[r][c].toString() + "\n\n";
                }
            }
        }

        if(s.isEmpty())
        {
            return s;
        }
        s = s.substring(0, s.length()-2);
        return s;
    }
}
