import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        boolean win = false;
        int answer = (int) (Math.random() * 100) + 1;
        int numGuesses  =0;

        Scanner sc = new Scanner(System.in);

        System.out.println(answer);
        System.out.println("Guess a number between 1 and 100, inclusive: ");
        String guess = sc.nextLine();
        while(!win)
        {
            numGuesses++;
            if(guess.equals("Q"))
            {
                System.out.println(answer);
                break;

            }
            int guessInt = Integer.parseInt(guess);
            if(guessInt == answer)
            {
                win = true;
            }
            else if(answer > guessInt){
                win = false;
                System.out.println("Guess higher: " + guessInt);
                guess = sc.nextLine();
            }
            else if(answer < guessInt){
                win = false;
                System.out.println("Guess lower: " );
                guess = sc.nextLine();
            }

        }
        if(win)
        {
            System.out.println("You got it in " + numGuesses + " guesses!");
        }


    }
}
