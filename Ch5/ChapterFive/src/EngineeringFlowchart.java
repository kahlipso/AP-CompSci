import java.util.Scanner;
public class EngineeringFlowchart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Does it move? ");

        String a1 = sc.nextLine();

        System.out.println("Should it?");

        String a2 = sc.nextLine();

        if(a1.toLowerCase().charAt(0) == 'n')
        {
            if(a2.toLowerCase().charAt(0) == 'n')
            {
                System.out.println("No Problem");
            }
            else if(a2.toLowerCase().charAt(0) == 'y')
            {
                System.out.println("WD-40");
            }
        }
        else if(a1.toLowerCase().charAt(0) == 'y')
        {
            if(a2.toLowerCase().charAt(0) == 'n')
            {
                System.out.println("No Problem");
            }
            else if(a2.toLowerCase().charAt(0) == 'y')
            {
                System.out.println("Duct Tape");
            }
        }
        else {
            System.out.println("Please enter a Valid Input (Yes/No)");
        }
    }
}

