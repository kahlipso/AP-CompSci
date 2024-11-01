import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 2;
        while(n <= 100)
        {
            int line = 0;
            String thisLine = "";
            while(line <=10 && n <= 100)
            {
                thisLine += n + " ";
                line++;
                n+=2;
            }
            System.out.println(thisLine);

        }

        System.out.println(backwards(5));

        countOccurances(7846597);
    }

    public static String backwards(int x)
    {
        String result = "";
        while(x>0)
        {
            result += x+ ", ";
            x--;
        }
        result += "Blastoff!";
        return result;
    }

    public static boolean areAmicable(int a, int b)
    {
        int sumA = 0;
        int sumB = 0;
        for(int i = 1; i < a; i++)
        {
            if(a%i == 0)
            {
                sumA += i;
            }
        }

        for(int i = 1; i < b; i++)
        {
            if(b%i == 0)
            {
                sumB += i;
            }
        }

        if(Math.abs(a) == a && Math.abs(b) == b)
        {
            if(sumA==b && sumB == a)
            {
                return true;
            }

        }

        return false;
    }

    public static void countOccurances(int num)
    {
        String numString = num + "";

        int occurances = 0;
        for(int i = 0; i < 10; i++)
        {
            for(int k = 0; k < numString.length(); k++)
            {
                //System.out.println(numString.indexOf(k));
                if(numString.substring(k, k+1).equals(i + ""))
                {
                    occurances++;

                }

            }

            System.out.println(i + " - " + occurances);
            occurances = 0;
        }

    }

}
