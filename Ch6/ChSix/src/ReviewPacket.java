import java.util.ArrayList;
import java.util.Scanner;

public class ReviewPacket {

    public static void main(String[] args) {
        //System.out.println(triples());

        //#2
        int multiples = 0;
        while(multiples < 1000)
        {
            multiples += 3;
            System.out.println(multiples);
        }

        //#3
        double primesSum = 0.0;
        double count = 0.0;
        for(int i = 100; i < 200; i++)
        {
            if(isPrime(i))
            {
                count++;
                primesSum+=i;

            }
        }

        double avg = primesSum/count;
        System.out.println(avg);

        //userInput();

        drawWings(3);

    }

    public static void foo()
    {
        int count = 0;
        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j < 3; j++)
            {
                count += i * j;
            }
        }

        System.out.println(count);
    }

    public static int triples() {
        int count = 0;
        for (int a = 1; a < 1000; a++) {
            for (int b = a+1; b < 1000; b++) {
                int cSqr = a * a + b * b;
                int c = (int) Math.sqrt(cSqr);
                if (c * c == cSqr && c < 1000) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPrime(int value)
    {
        if(value == 1 || value == 0 || Math.abs(value) != value)
        {
            return false;
        }
        for(int i = 2; i < value; i++)
        {
            if(value % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static String carID(String licensePlate) {
        int sum = 0;
        String lettersOnly = "";

        for (int i = 0; i < licensePlate.length(); i++) {
            char ch = licensePlate.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            } else if (Character.isLetter(ch)) {
                sum += (int) ch;
                lettersOnly += ch;
            }
        }

        int mappedValue = sum % 26;
        char mappedLetter = (char) ('A' + mappedValue);

        String carID = mappedLetter + Integer.toString(sum) + lettersOnly.toLowerCase();

        return carID;
    }

    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static void drawWings(int n)
    {
            for(int r = 1; r <= n; r++)
            {
                for(int c = 1; c <= 2*n + 2; c++)
                {
                    if ((c >= r && c <n+1) || (c >  n+2 && c <= n*2 + 3 - r))
                    {
                        System.out.print("*");
                    }
                else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        public static void userInput()
        {
            Scanner scanner = new Scanner(System.in);
            int count = 0;
            double sum = 0;

            System.out.println("Enter numbers to calculate the average. Enter -9999 to stop:");

            while (true) {
                System.out.print("Enter a number: ");
                double input = scanner.nextDouble();

                if (input == -9999) {
                    break;
                }

                sum += input;
                count++;
            }

            scanner.close();

            if (count > 0) {
                double average = sum / count;
                System.out.println("The average of the entered numbers is: " + average);
            } else {
                System.out.println("No numbers were entered.");
            }
        }
    }


