import java.util.Scanner;
public class StringPractice {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Word.");
        String word = s.nextLine();

        System.out.println(reverseWordSplit(word));

        //System.out.println(removeLetter("computer", 3));
    }
    public static String baseFolder(String file)
    {
        return  file.substring(0, file.indexOf('/'));
    }

    public static String reverseWordSplit(String word)
    {
        int split = word.length() / 2;
        String newWord = word.substring(split, word.length()) + word.substring(0, split);

        return newWord;
    }

    public static String removeLetter(String word, int i)
    {
        return word.substring(0, i) + word.substring(i + 1, word.length());

    }
}
