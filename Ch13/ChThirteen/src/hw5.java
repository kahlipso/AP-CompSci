public class hw5 {

    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza"));
    }

    private static String stringClean(String s) {
        return stringCleanHelper(s, 0);
    }

    static String stringCleanHelper (String s, int i)
    {
        if(s.length()<1)
        {
            return s;
        }

        if(checkDup(s.substring(i,i+1), s.substring(i+1,i+2)))
        {
            String newS = s.substring(i, i+1);
            return newS + stringCleanHelper(s, i);
        }
        return stringCleanHelper(s.substring(i+1),i++);
    }

    static boolean checkDup(String a, String b)
    {
        if(a.equals(b))
            return true;
        return false;
    }
}
