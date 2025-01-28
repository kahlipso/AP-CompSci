import java.util.ArrayList;

public class Tiles {
    private ArrayList<String> tiles;

    public Tiles()
    {
        tiles = new ArrayList<>();
    }

    public boolean contains(String newTile)
    {
        for(int i =0; i < tiles.size(); i++)
        {
            if(tiles.get(i).equals(newTile))
            {
                return true;
            }
        }
        return false;
    }

    public void add(String newTile)
    {
        if(!tiles.contains(newTile))
        {
            tiles.add(newTile);
        }

    }

    public String getTile()
    {
        int rand = (int) (Math.random() * 75 + 1);

        if(rand <= 15)
        {
            return "B" + rand;
        }
        else if(rand >= 16 && rand <= 30)
        {
            return "I" + rand;
        }
        else if(rand >= 31 && rand <= 45)
        {
            return "N" + rand;
        }
        else if(rand >= 46 && rand <= 60)
        {
            return "G" + rand;
        }
        return "O" + rand;
    }

    public boolean isValidTile(String tile)
    {
        String letter = tile.substring(0,1).toLowerCase();

        if(letter.equals("b") && Integer.parseInt(tile.substring(1)) >= 1 && Integer.parseInt(tile.substring(1)) <= 15)
        {
            return true;
        }
        else if(letter.equals("i") && Integer.parseInt(tile.substring(1)) >= 16 && Integer.parseInt(tile.substring(1)) <= 30)
        {
            return true;
        }
        else if(letter.equals("n") && Integer.parseInt(tile.substring(1)) >= 31 && Integer.parseInt(tile.substring(1)) <= 45)
        {
            return true;
        }
        else if(letter.equals("g") && Integer.parseInt(tile.substring(1)) >= 46 && Integer.parseInt(tile.substring(1)) <= 60)
        {
            return true;
        }
        else if(letter.equals("o") && Integer.parseInt(tile.substring(1)) >= 61 && Integer.parseInt(tile.substring(1)) <= 75)
        {
            return true;
        }

        return false;
    }
}
