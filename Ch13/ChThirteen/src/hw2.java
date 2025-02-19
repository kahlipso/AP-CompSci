public class hw2 {

    public static void main(String[] args) {
        System.out.println(locateIndex("Barack Obama", "ck"));
    }
    public static void count(int n) {

        if (n == 1) {
            System.out.println();
            return;
        }
        count(n-1);
        System.out.println(n);
    }

    public static String duplicateVowels(String s)
    {
        String letter = s.substring(0,1);
        if(s.length() ==1)
        {
            return s;
        }

        if(isVowel(letter))
        {
            return letter + letter + duplicateVowels(s.substring(1));
        }
        return letter + duplicateVowels(s.substring(1));
    }

    private static boolean isVowel(String s)
    {
        return s.equals("a") ||s.equals("u") ||s.equals("e") ||s.equals("i") ||s.equals("o") ;
    }

    public static int countChars(String target, String s)
    {
        String letter = s.substring(0,1);

        if(s.length() == 1)
        {
            if(letter.equals(target))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        if(letter.equals(target))
        {
            return 1 + countChars(target, s.substring(1));
        }
        return countChars(target, s.substring(1));
    }

    public static boolean isPalindrome(String s)
    {

        if(s.length() == 2)
        {
            //System.out.println(s);
            return s.substring(0,1).equals(s.substring(1));
        }
        else if(s.length() == 1)
        {
            return true;
        }
        //System.out.println(s);
        return s.substring(0,1).equals(s.substring(s.length()-1)) && isPalindrome(s.substring(1, s.length()-1));
    }

    public static int locateIndex(String a, String b)
    {
        int size = b.length();

        if(a.length() < b.length())
        {
            return -1;
        }

        if(a.substring(0, size).equals(b))
        {
            return  0;
        }

        int index = locateIndex(a.substring(1), b);


        if(index ==-1)
            return -1;
        else
            return index + 1;
    }
}
