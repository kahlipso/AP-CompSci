
/**
 * Ch 14 HW #2
 */
public class SearchingPractice{
    private String[] words;



    public SearchingPractice(String[] arr)
    {
        words = new String[arr.length];

        // Initialize words with a copy of the elements in arr
        for(int i = 0; i < arr.length; i++)
        {
            words[i] = arr[i];
        }
    }

    public String toString()
    {
        // the resulting string should have a comma separating each element in 
        // words with no comma after the last elelment.

        String ans = "";

        for(int i = 0; i < words.length-1; i++)
        {
            ans += words[i] + ", ";
        }

        ans += words[words.length-1];

        return ans;
    }
    /**
     * Write a linear search algorithm that returns the index of the LAST instance of target in words.
     * precondition: none
     * postcondition: returns the LAST index of target in array. If target is not found, returns -1.
     */

    public int linearSearch(String target)
    {
        for(int i = words.length-1; i >= 0; i--)
        {
            if(words[i].equals(target))
                return i;
        }

        return -1;
    }

    /**
     * Write a method to determine if words is sorted lexicographically or not.
     * precondition: none
     * postcondition: returns true if the data in array is sorted in ascending 
     *                lexicographical order and false otherwise.
     * Refer to the AP Quick Reference, your chapter 5 notes in BlueJ or pg. 186 in your textbook
     * if you need a reminder how to use compareTo to compare Strings
     */

    public boolean isSorted()
    {
        for(int i =0; i < words.length-1; i++)
        {
            if(words[i].compareTo(words[i+1]) > 0)
            {
                return false;
            }
        }

        return true;

    }

    /**
     * Write a binary search algorithm that returns the index of target in the array words.
     *precondition: words is a sorted array
     *postcondition: returns the index of target in array. If there are multiple instances of target in 
     *               the array, return any index of target.  If target is not found, return -1.
     */

    public int binarySearch(String target)
    {
        return binarySearchHelper(target, 0, words.length-1);
    }

    private int binarySearchHelper(String target, int low, int high)
    {
        int mid = (high+low)/2;
        if(words[mid].equals(target))
            return mid;
        else if(high-low < 0)
            return -1;

        if(words[mid].compareTo(target) < 0)
            return binarySearchHelper(target, mid+1, high);
        if(words[mid].compareTo(target) > 0)
            return binarySearchHelper(target, low, mid-1);

        return -1;
    }
}
