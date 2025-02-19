public class HexadecimalConverter {

    public static void main(String[] args) {

        System.out.println(convertToBase16(93));
        System.out.println(convertToBase10("5D"));
    }
    public static String convertToBase16(int n)
    {
        if(n==0)
        {
            return "";
        }

        if(n%16 == 10)
        {
            return convertToBase16(n/16)+  "A";
        }
        else if(n%16 == 11)
        {
            return convertToBase16(n/16)+  "B";
        }
        else if(n%16 == 12)
        {
            return convertToBase16(n/16)+  "C";
        }
        else if(n%16 == 13)
        {
            return convertToBase16(n/16)+ "D";
        }
        else if(n%16 == 14)
        {
            return  convertToBase16(n/16)+ "E";
        }
        else if(n%16 == 15)
        {
            return convertToBase16(n/16)+ "F";
        }
        else if(n < 16)
        {
            return convertToBase16(n/16)+ (n + "");
        }


        return convertToBase16(n/16) + n%16;
    }

    public static int convertToBase10(String s)
    {
        if(s.length()==0)
        {
            return 0;
        }

        String num = s.substring(0,1);

        if(num.equals("A"))
        {
            int ans = (int) (10 * Math.pow(16, s.length()-1));
            return ans + convertToBase10(s.substring(1));
        }
        else if(num.equals("B"))
        {
            int ans = (int) (11 * Math.pow(16, s.length()-1));
            return ans + convertToBase10(s.substring(1));
        }
        else if(num.equals("C"))
        {
            int ans = (int) (12 * Math.pow(16, s.length()-1));
            return ans + convertToBase10(s.substring(1));
        }
        else if(num.equals("D"))
        {
            int ans = (int) (13 * Math.pow(16, s.length()-1));
            return ans + convertToBase10(s.substring(1));
        }else if(num.equals("E"))
        {
            int ans = (int) (14 * Math.pow(16, s.length()-1));
            return ans + convertToBase10(s.substring(1));
        }
        else if(num.equals("F"))
        {
            int ans = (int) (15 * Math.pow(16, s.length()-1));
            return ans + convertToBase10(s.substring(1));
        }

        int ans = (int) (Integer.parseInt(num) * Math.pow(16, s.length()-1));
        return ans + convertToBase10(s.substring(1));
    }
}
