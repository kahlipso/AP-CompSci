public class BinaryConverter {

    public static void main(String[] args) {

        System.out.println(convertToBase2(10));
        System.out.println(convertToBase10("1010"));
    }

    public static String convertToBase2(int n)
    {
        String num = n + "";

        if(n==0)
        {
            return "0";
        }
        if(n==1)
        {
            return "1";
        }

        return convertToBase2(n/2) + n%2;
    }


    public static int convertToBase10(String s)
    {
        if(s.length()==0)
        {
            return 0;
        }


        int x = Integer.parseInt(s.substring(0,1));

        int ans = (int) (x * Math.pow(2, s.length()-1));
        return ans + convertToBase10(s.substring(1));
    }


}
