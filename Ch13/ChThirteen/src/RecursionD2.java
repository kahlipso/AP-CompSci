public class RecursionD2 {


    private static int[] a = {2,4,1,1,1};
    public static void main(String[] args) {

        System.out.println(replaceLetters("roast"));
    }
    public static int sumArray(int[] arr)
    {
        return helper(arr, arr.length-1);
    }

    public static int helper(int[] arr, int i)
    {

        int sum =0;
        if(i == 0)
        {
            return sum + arr[0];
        }

        sum = arr[i] + helper(arr, i-1);
        return sum;
    }

    public static String removeVowels(String s, int i)
    {
        if(i==s.length())
        {
            return "";
        }

        String current = s.substring(i, i+1);
        if(!isVowel(current))

            return current + removeVowels(s, i+1);
        else
            return removeVowels(s, i+1);
    }

    public static boolean isVowel(String letter)
    {
        letter.toLowerCase();
        if(letter.equals("a") || letter.equals("u") || letter.equals("e") || letter.equals("i") || letter.equals("o"))
        {
            return true;
        }
        return false;
    }

    public static int sumEvens(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
            if(n %2 == 0)
            {
                return n + sumEvens(n-2);
            }
            else {
                return (n-1) + sumEvens(n-3);
            }
        }
    }

    public static String replaceLetters(String s)
    {
        if(s.length() == 1)
        {
            return s.substring(0,1);
        }

        else
        {
            if(s.substring(0,1).equals("a"))
            {
                return "@" + replaceLetters(s.substring(1,s.length()));
            }
            else if(s.substring(0,1).equals("o"))
            {
                return "0" + replaceLetters(s.substring(1,s.length()));
            }
            else if(s.substring(0,1).equals("s"))
            {
                return "$" + replaceLetters(s.substring(1,s.length()));
            }
            return s.substring(0,1) + replaceLetters(s.substring(1,s.length()));
        }
    }


}
