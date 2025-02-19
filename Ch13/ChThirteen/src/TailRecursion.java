public class TailRecursion {

    public static void main(String[] args) {
        System.out.println(reverse(""));
    }
    public static long recFib(int n)
    {
        if(n == 2)
        {
            return 1;
        }

        return recFib(n-1) + recFib(n-2);
    }

    public static String reverse(String s)
    {
        if(s.length() == 1)
        {
            return s;
        }
        if(s.isEmpty())
        {
            return "";
        }

        return s.substring(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }
    
}
