import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
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

    public static boolean isPerfect(int n)
    {
        int sum = 0;
        if(n > 1)
        {
            for(int i = 1; i <= n/2; i++)
            {
                if(n%i == 0)
                {
                    sum+=i;
                }
            }

            if( sum == n)
            {
                return true;
            }
        }
        return false;
    }

}
