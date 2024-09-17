import java.util.Scanner;

public class ScannerDemo {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("what is your password? ");
        String pass = sc.nextLine();

        //System.out.println(input);

        if(pass.equals("admin"))
        {
            System.out.println("correct");
        }
        else {
            System.out.println("incorrect");
            System.out.printf(pass);
        }

        System.out.println("what is your uid");
        String uid = sc.nextLine();

        if(uid.equals("username"))
        {
            System.out.println("correct");
        }




    }
}
