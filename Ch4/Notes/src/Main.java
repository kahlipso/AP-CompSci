public class Main {
    public static void main(String[] args){
        int x = Integer.MAX_VALUE;
        System.out.println(x+1);
        int y = Integer.MIN_VALUE;
        System.out.println(y);
        System.out.println(y-1);

        //integer division
        double a =2/3;
        System.out.println(a);
        double b = 2/3.0;
        System.out.println(b);

        double c= 10;
        int e = (int) 10.99;
        System.out.println(e);

        System.out.println(isEven(2));

        System.out.println(remainderTheorem(12, 3));

        roudOffError();

        System.out.println(avg(5,5,6));
    }

    public static String remainderTheorem(int num, int divisor)
    {
        int x = num % divisor;
        return num + " / " + divisor + " is " + num/divisor + " remainder " + x;
    }

    public static boolean isEven(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        return false;
    }

    public static void roudOffError()
    {
        System.out.println(0.1 + 0.1 + 0.1);
    }

    public static double avg(int num1, int num2, int num3)
    {
        double ans = (num1  + num2 + num3) / 3.0;

        return ans;
    }
}