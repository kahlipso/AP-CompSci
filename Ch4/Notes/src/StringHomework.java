import java.util.Scanner;
public class StringHomework
{


    public static void processRectangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of one side of a rectangle: ");

        double s1 = sc.nextDouble();

        System.out.println("Enter the length of the other side: ");

        double s2 = sc.nextDouble();

        double area = s1 * s2;
        double diagonal = Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));


        System.out.println("the rectangle has an area of: " + area);

        System.out.println("the diagonal is: " + diagonal);

    }

    public static void processPhoneNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phone number in the format (xxx) xxx-xxxx: ");
        String phone = sc.nextLine();

        String areaCode = phone.substring(1, 4);
        System.out.println("your area code is: " + areaCode);

        System.out.println("the last for digits are: " + phone.substring(10, 14));
    }

    public static void processName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name (in the format LAST, First): ");

        String name = sc.nextLine();

        String first = name.substring(name.indexOf(',') + 2, name.length());
        String last = name.substring(0, name.indexOf(','));

        System.out.println("Your Name is: " + first + " " + last);
    }

    public static void processInitials()
    {
        System.out.println("Enter Your Full Name: ");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        String initials = "";

        initials += name.charAt(0) + ".";

        for(int i = 0; i < name.length(); i++)
        {
            if(name.charAt(i) == ' ')
            {
                initials += name.charAt(i+1) + ".";
            }
        }
        System.out.println(initials);
    }
}
