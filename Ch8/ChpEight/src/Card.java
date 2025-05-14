import java.util.ArrayList;

public class Card
{
	public String[][] card;

	public Card()
	{
		card = new String[5][5];
		int size = card.length;

		ArrayList<Integer> n = new ArrayList<>();
		
		for(int c = 0; c < size; c++)
		{
			for(int r = 0; r < size; r++)
			{
				if(c == 0)
				{

					int rand = (int) (Math.random() * 14 + 1);
					while(!isUnique(rand, n))
					{
						rand = (int) (Math.random() * 14 + 1);

					}
					if(isUnique(rand, n))
					{
						n.add(rand);
						card[r][c] = rand + "";
					}


				}
				else if(c == 1)
				{
					int rand = (int) (Math.random() * 14 + 16);
					while(!isUnique(rand, n))
					{
						rand = (int) (Math.random() * 14 + 16);

					}
					if(isUnique(rand, n))
					{
						n.add(rand);
						card[r][c] = rand + "";
					}
				}
				else if(c == 2) {
					int rand = (int) (Math.random() * 14 + 31);
					while(!isUnique(rand, n))
					{
						rand = (int) (Math.random() * 14 + 31);

					}
					if(isUnique(rand, n))
					{
						n.add(rand);
						card[r][c] = rand + "";
					}
				}
				else if(c == 3)
				{
					int rand = (int) (Math.random() * 14 + 46);
					while(!isUnique(rand, n))
					{
						rand = (int) (Math.random() * 14 + 46);

					}
					if(isUnique(rand, n))
					{
						n.add(rand);
						card[r][c] = rand + "";
					}
				}
				else if(c ==4)
				{
					int rand = (int) (Math.random() * 14 + 61);
					while(!isUnique(rand, n))
					{
						rand = (int) (Math.random() * 14 + 61);

					}
					if(isUnique(rand, n))
					{
						n.add(rand);
						card[r][c] = rand + "";
					}
				}
				
			}
			
			card[2][2] = "free";
		}

		//System.out.println(n);
	}

	public boolean isUnique(int value, ArrayList<Integer> arr)
	{
		if(arr.isEmpty())
		{
			return true;
		}
        for (int i : arr) {
            if (value == i) {
                return false;
            }
        }

		return true;
	}

	
	public Card(int[][] temp)
	{
		card = new String[5][5];
		int size = card.length;
		
		for(int c = 0; c < size; c++)
		{
			for(int r = 0; r < size; r++)
			{
				if(r != 2)
				{
					card[r][c] = Integer.toString(temp[r][c]);
				}
				else if(r == 2)
				{
					if(c < 2)
					{
						card[r][c] = Integer.toString(temp[r][c]);
					}
					else if(c > 2)
					{
						card[r][c] = Integer.toString(temp[r][c-1]);
					}
					else
					{
						card[r][c] = "free";
					}
				}
				
			}
			
			card[2][2] = "free";
		}
	}
		
	public String toString()
	{
		int size = card.length;
		String s = "B\tI\tN\tG\tO\n";
		
		for(int r = 0; r < size; r++)
		{
			for(int c = 0; c < size; c++)
			{
				if(c != size-1)
				{
					s += card[r][c]+"\t";
				}
				else {
					s += card[r][c];
				}

			}
			if(r != size-1)
			{
				s+="\n";
			}
		}
		
		return s;
	}
	
	public void print()
	{
		System.out.print(this.toString());
	}
	
	public boolean call(String tile)
	{
		int size = card.length;
		String in = tile.toLowerCase();


		for(int c = 0; c < size; c++)
		{
			for(int r = 0; r < size; r++)
			{
				if(in.substring(0,1).equals("b") && c == 0)
				{
					if(card[r][c].equals(in.substring(1)))
					{
						card[r][c] = "x";
						return true;
					}
				}
				if(in.substring(0,1).equals("i") && c == 1)
				{
					if(card[r][c].equals(in.substring(1)))
					{
						card[r][c] = "x";
						return true;
					}
				}
				if(in.substring(0,1).equals("n") && c == 2)
				{
					if(card[r][c].equals(in.substring(1)))
					{
						card[r][c] = "x";
						return true;
					}
				}
				if(in.substring(0,1).equals("g") && c == 3)
				{
					if(card[r][c].equals(in.substring(1)))
					{
						card[r][c] = "x";
						return true;
					}
				}
				if(in.substring(0,1).equals("o") && c == 4)
				{
					if(card[r][c].equals(in.substring(1)))
					{
						card[r][c] = "x";
						return true;
					}
				}
				
				
			}
			
		}
		return false;
	}

	public boolean win()
	{
		int size = card.length;

		String winVertical = "";
		for(int c = 0; c < size; c++)
		{
			for(int r = 0; r < size; r++)
			{
				if(card[r][c].equals("x") || card[r][c].equals("free"))
				{
					winVertical += "x";
				}
			}
			if(winVertical.equals("xxxxx"))
			{
				return true;
			}
			winVertical = "";
		}
		
		String winHorizontal = "";
		for(int r = 0; r < size; r++)
		{
			for(int c = 0; c < size; c++)
			{
				if(card[r][c].equals("x") || card[r][c].equals("free"))
				{
					winHorizontal += "x";
				}
			}
			if(winHorizontal.equals("xxxxx"))
			{
				return true;
			}
			winHorizontal = "";
		}
		
		String winAcross1 = "";
		for(int r = 0; r < size; r++)
		{
			for(int c = 0; c < size; c++)
			{
				if(r == c)
				{
					if(card[r][c].equals("x") || card[r][c].equals("free"))
					{
						winAcross1 += "x";
					}

				}
			}
			if(winAcross1.equals("xxxxx"))
			{
				return true;
			}

		}
		winAcross1 = "";


		String winAcross2 = "";
		for(int r = 0; r < size; r++)
		{
			for(int c = 0; c < size; c++)
			{
				if(r + c == 4)
				{
					if(card[r][c].equals("x") || card[r][c].equals("free"))
					{
						winAcross2 += "x";
					}

				}
			}
			if(winAcross2.equals("xxxxx"))
			{
				return true;
			}

		}
		winAcross2 = "";
		return false;
	}
	
}
