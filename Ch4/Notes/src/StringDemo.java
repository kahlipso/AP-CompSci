public class StringDemo {

    public static void main (String[] args)
    {
        String str1 = "happy monday!";
        String str2 = "October to November";

        String a = str1.substring(7,8);
        int x = str2.indexOf("to");
        System.out.println(x);

        double num = 954.0;
        String numText = "" + num;
        System.out.println(numText + 1);

        String stuff = "APCS Class";
        double w = 123.3;
        double r = 12312.23;
        String gg = "" + w;
        String aa = r + w + "";

        System.out.println(aa);
    }
}
