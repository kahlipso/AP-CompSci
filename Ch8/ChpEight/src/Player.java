import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> cards;

    public String getName() {
        return name;
    }

    public Player(String name)
    {
        this.name = name;
        cards = new ArrayList<>();
    }

    public void addCard(Card newCard)
    {
        cards.add(newCard);

    }

    public boolean win()
    {
        for(int i = 0; i < cards.size(); i++)
        {
            if(cards.get(i).win())
            {
                return true;
            }

        }
        return false;
    }

    public String toString()
    {
        String output = name;

        if(cards.size() != 0)
        {
            output += "\n\n";
            for(int i = 0; i < cards.size(); i++)
            {
                if(i < cards.size()-1)
                {
                    output += cards.get(i).toString() + "\n\n";
                }
                else {
                    output += cards.get(i).toString();
                }
            }

        }

        return output;
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    public int call(String tile)
    {
        int count = 0;
        for(int i = 0; i < cards.size(); i++)
        {
            if(cards.get(i).call(tile))
            {
                count++;
            }

        }

        return count;
    }
}
