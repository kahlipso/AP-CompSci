import java.util.Scanner;

public class WhileLookDay {
    public static void main(String[] args) {


    }
    public static void sum()
    {
        Scanner keys = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number. ");
        int input = keys.nextInt();
        while(input != -9999)
        {
            sum += input;
            System.out.println("Enter a number. Press -9999 to quit. ");
            input = keys.nextInt();
        }
        System.out.println("Sum: " + sum);
    }

    public static void odds()
    {
        int i = 99;
        while(i > 0)
        {
            if(i%2 != 0)
            {
                System.out.println(i);
                i-=2;
            }
        }
    }
}
