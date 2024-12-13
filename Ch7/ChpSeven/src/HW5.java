public class HW5 {

    public static void main(String[] args) {
        String[] words = {"house", "car", "computer", "sleep", "hi"};

        int largestIndex = 0;
        String largest = "";
        for(int i = 0; i < words.length; i++)
        {
            if(words[i].length() > largest.length())
            {
                largest = words[i];
                largestIndex = i;
            }
        }

        for(int i = largestIndex; i < words.length-1; i++)
        {
            words[i] = words[i+1];
        }
        words[words.length-1] = null;

        for(String w : words)
        {
            System.out.println(w + " ");
        }
    }

}
