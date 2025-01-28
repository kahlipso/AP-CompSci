import java.util.ArrayList;
import java.util.Scanner;

/**
 * Play a BINGO game.
 */

public class BingoGame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Tiles tiles = new Tiles();

        System.out.println("How many players?");
        int playerAmount = Integer.parseInt(in.nextLine());
        Player[] players = new Player[playerAmount];

        for (int x = 1; x <= players.length; x++)
        {
            System.out.println("What is your name, Player"+x+"?");
            String name = in.nextLine();
            players[x-1] = new Player(name);

            System.out.println("How many cards do you want?");
            int cards = Integer.parseInt(in.nextLine());
            for (int i = 0; i < cards; i++)
            {
                players[x-1].addCard(new Card());
            }
        }

        // Game loop to process tiles
        boolean done = false;
        while(!done)
        {
            System.out.println();
            for (Player x : players)
            {
                x.print();
                System.out.println();
                System.out.println();
            }

            System.out.print("\nEnter tile value, <enter> for random tile, or \"q\" to quit):  ");

            String response = in.nextLine();
            System.out.println();

            if (response.equals("q"))
            {
                System.out.println("Game ended");
                done = true;
            }

            // user entered a previously called tile
            else if(!response.equals("") && tiles.contains(response))
            {
                System.out.println(response + " has already been called.");
            }

            //user entered an invalid tile
            else if (!response.equals("") && !tiles.isValidTile(response))
            {
                System.out.println(response + " is not a valid tile.");
            }

            //Process a valid user tile.
            else
            {
                String newTile;
                if (response.equals(""))
                    newTile = tiles.getTile();
                else
                    newTile = response;

                System.out.println("The tile called was " + newTile);

                tiles.add(newTile);
                for (Player x : players)
                {
                    x.call(newTile);
                }

                //check if game over
                for (Player x : players)
                {
                    if(x.win())
                    {
                        x.print();
                        System.out.println();
                        System.out.println("BINGO!!");
                        System.out.println(x.getName() + " WON!!");
                        //ensure the game loop terminates
                        done = true;
                    }
                }
            }
        }
    }
}
