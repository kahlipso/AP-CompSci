public class Primes {

    public static void main(String[] args) {
        System.out.println(countTwinPrimes(17));
    }
    public static boolean isPrime(int value)
    {
        if(value == 1 || value == 0 || Math.abs(value) != value)
        {
            return false;
        }
        for(int i = 2; i < value; i++)
        {
            if(value % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static int countPrimes(int max)
    {
        int count = 0;
        for(int i = 1; i <= max; i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }

        return count;
    }

    public static int sumPrimes(int n)
    {
        int sum = 0;
        int count = 0;
        int primes =0;
        while (primes < n)
        {
            if(isPrime(count))
            {
                sum += count;
                primes++;
            }
            count++;
        }

        return sum;
    }

    public static double averagePrimes(int n)
    {
        return (double) sumPrimes(n) / n;
    }

    public static String primeString(int n)
    {
        String primes = "";

        int amountOfPrimes = 0;
        int index = 0;

        while(amountOfPrimes < n)
        {
            if(isPrime(index))
            {
                if(amountOfPrimes == n-1)
                {
                    amountOfPrimes++;
                    primes += index;
                }else {
                    amountOfPrimes++;
                    primes += index + "\n";
                }


            }
            index++;
        }
        return primes;
    }

    public static int multipleOfThreeContainsTwo(int max)
    {
        int count = 0;
        for(int i = 3; i < max; i+=3)
        {
            String strI = i + "";
            if(strI.indexOf("2") != -1)
            {
                count++;
            }
        }
        return count;
    }

    public static void printOccurances(String text)
    {
        for(int a = 97; a <= 122; a++)
        {
            int count = 0;
            for(int i =0; i<text.length(); i++)
            {
                int asciiValue = (int) text.charAt(i);
                if(asciiValue == a)
                {
                    count++;
                }
            }
            if(count > 0)
            {
                System.out.println((char)a + " - " + count);
            }
        }
    }

    public static String factor(int n)
    {
        boolean isDivisible = true;
        String result = "";
        if(isPrime(n))
        {
            return n + "";
        }
        if(n ==1)
        {
            return "";
        }


        while(isPrime(n) == false)
        {
            for(int i = 1; i <= n; i++)
            {
                if(isPrime(i) && n % i ==0)
                {
                    result += i + "*";
                    n /= i;
                    break;
                }
            }

        }
        result += n;

        return result;
    }

    public static int countTwinPrimes(int n)
    {
        int count = 0;

        if(n <= 4)
        {
            return 0;
        }
        for(int i = 1; i <= n; i++)
        {
            if(isPrime(i) && isPrime(i+2) & i+2 <= n)
            {
                count ++;
            }
        }

        return count;
    }
}
