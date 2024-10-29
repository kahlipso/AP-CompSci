public class SortStrings
{
    public static String stringSorter(String s1, String s2, String s3)
    {
        String a = "";
        String b = "";
        String c = "";
        if (s1.compareTo(s2) <= 0 && s1.compareTo(s3) <= 0) {
            a = s1;
            if (s2.compareTo(s3) <= 0) {
                b = s2;
                c = s3;
            } else {
                b = s3;
                c = s2;
            }
        } else if (s2.compareTo(s1) <= 0 && s2.compareTo(s3) <= 0) {
            a = s2;
            if (s1.compareTo(s3) <= 0) {
                b = s1;
                c = s3;
            } else {
                b = s3;
                c = s1;
            }
        } else {
            a = s3;
            if (s1.compareTo(s2) <= 0) {
                b = s1;
                c = s2;
            } else {
                b = s2;
                c = s1;
            }
        }
        return a + ", " + b + ", " + c;
    }
}