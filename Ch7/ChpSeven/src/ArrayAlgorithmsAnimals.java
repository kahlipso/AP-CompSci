public class ArrayAlgorithmsAnimals {

    public static void main(String[] args)
    {
        String[] animals = {"moose", "turtle", "whale", "ostrich", "raccoon", "bear", "cat"};

        String[] lunches = new String[animals.length * 2];

        //part a
        for(int i = 0; i < animals.length; i++)
        {
            lunches[i] = animals[i];

        }

        for(String a : lunches)
        {
            System.out.print(a +" ");
        }
        System.out.println();

        // part b
        for(int i = 0; i < animals.length + 1; i++)
        {
            if(i < 2)
            {
                lunches[i] = animals[i];
            }
            else if(i==2)
            {
                lunches[i] = "penguin";
            }
            else if (i > 2){
                lunches[i] = animals[i-1];
            }

        }

        for(String a : lunches)
        {
            System.out.print(a +" ");
        }
        System.out.println();

        //part c

        for(int i = 0; i < lunches.length; i++)
        {
            if(i < animals.length-1)
            {
                lunches[i] = animals[i+1];
            }

        }
        for(String a : lunches)
        {
            System.out.print(a +" ");
        }
        System.out.println();

        //part d
        String max="", min= "";
        for(int i = 0; i< lunches.length; i++)
        {
            if(lunches[i]!= null && lunches[i+1] != null && lunches[i].compareTo(lunches[i+1]) < 0)
            {
                min = lunches[i];

            }
            if(lunches[i]!= null && lunches[i+1] != null && lunches[i].compareTo(lunches[i+1]) < 0)
            {
                max = lunches[i];
            }

        }

        for(int i = 0; i< lunches.length; i++)
        {
            if(lunches[i] != null && lunches[i].equals(max))
            {
                lunches[i] = min;
            }
            if(lunches[i] != null && lunches[i].equals(min))
            {
                lunches[i] = max;
            }
        }

        for(String a : lunches)
        {
            System.out.print(a +" ");
        }
        System.out.println();

        //part e

        for(int i = 0; i< lunches.length; i++)
        {
            if(lunches[i]==null)
            {
                lunches[i] = "dog";
            }
        }

        for(String a : lunches)
        {
            System.out.print(a +" ");
        }
        System.out.println();

        // part f

        for(int i = 0; i< lunches.length; i++)
        {

            if(lunches[i].length() >=6)
            {
                lunches[i] = lunches[i+1];
            }
        }

        for(String a : lunches)
        {
            System.out.print(a +" ");
        }
        System.out.println();
    }

}
