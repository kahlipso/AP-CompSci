import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Analyzer
{
    private ArrayList<Person> list;

    public Analyzer()
    {
        list = new ArrayList<Person>();

        try {     
            File fileLocation = new File("Data.txt");  

            // Create a new Scanner object which will read the data from the file passed in. 
            Scanner scanner = new Scanner(fileLocation);             

            // To check if there are more lines to read, check by calling the  
            // scanner.hasNextLine() method. Then read lines one by one 
            // until all are read. 

            while (scanner.hasNextLine()) { 
                String line = scanner.nextLine();

                /* Split the line into parts which were "tab delimited"**/
                String[] parts = line.split("\t");

                /* Use the split info to create a new Person object to add to the ArrayList **/
                /* (YOU NEED TO DO THIS!!!) ***/
                
                Person p = new Person(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                list.add(p);

            } 

            //if file not found, catch the exception thrown by the Scanner class
        } catch (FileNotFoundException e) { 
            e.printStackTrace(); 
        }
    }
    // This method may help with debugging. It will print all Person objects in the ArrayList from firstIndex to lastIndex, inclusive.
    public void printAllInstances(int firstIndex, int lastIndex)
    {
        for(int i = firstIndex; i <= lastIndex; i++)
        {
            System.out.println(list.get(i).toString());
        }
    }

    // A getter method to get the Person object from the ArrayList at a specified index.  This is needed for the tester.
    public Person getPerson(int i)
    {
        return list.get(i);
    }
    
    
    // YOUR WORK STARTS HERE!
    // Use a Linear Search to search for first index of the target height. If not found, return -1.
    public int findHeight(double target)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(Math.abs(list.get(i).getHeight() - target) <= 1e-14)
                return i;
        }

        return -1;
    }

    // Use a Binary Search recursive algorithm which returns the index of the target weight.  If not found, return -1.
    // Note: You will not be able to test this method until you write the sortByWeight method below since the precondition is a sorted list.
    public int findWeight(double target)
    {
        //  Hint: Write your helper method
        

        return binarySearchHelper(target, 0, list.size()-1);
    }

    private int binarySearchHelper(double target, int low, int high)
    {
        int mid = (high+low)/2;
        if(Math.abs(list.get(mid).getWeight() - target) < 1e-14)
            return mid;
        else if(high-low < 0)
            return -1;

        if(list.get(mid).getWeight() < target)
            return binarySearchHelper(target, mid+1, high);
        if(list.get(mid).getWeight() > target)
            return binarySearchHelper(target, low, mid-1);

        return -1;
    }

    //Use Insertion Sort to sort all Person objects by their height (low to high). 
    public void sortByHeight()
    {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            double key = list.get(i).getHeight();
            Person temp = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).getHeight() > key) {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, temp);
        }
    }
    
    
    //Use Merge Sort to sort all Person objects by their weight (low to heigh). You will need the helper methods below.
    public void sortByWeight()
    {
        list = mergeSort(list);
    }

    private ArrayList<Person> mergeSort(ArrayList<Person> arr)
    {
        if(arr.size()==2)
        {
            if(arr.get(0).getWeight() > arr.get(1).getWeight())
            {
                double temp = arr.get(0).getWeight();
                arr.get(0).setWeight(arr.get(1).getWeight());
                arr.get(1).setWeight(temp);
            }
            return arr;
        }
        if(arr.size() <=1)
        {
            return arr;
        }


        int mid = arr.size()/2;
        ArrayList<Person> a = new ArrayList<>(mid);
        ArrayList<Person> b = new ArrayList<>(arr.size() - mid);

        for(int i =0; i < mid; i++)
        {
            a.add(arr.get(i));
        }

        for(int i = mid; i < arr.size(); i++)
        {
            b.add(arr.get(i));
        }

        return merge(mergeSort(a), mergeSort(b));
    }

    private ArrayList<Person> merge(ArrayList<Person> left, ArrayList<Person> right)
    {
        ArrayList<Person> arr = new ArrayList<>(left.size() + right.size());

        int i =0, j=0;

        while(i < left.size() && j < right.size())
        {
            if(left.get(i).getWeight() < right.get(j).getWeight())
            {
                arr.add(left.get(i++));
            }
            else {
                arr.add(right.get(j++));
            }
        }

        while(i < left.size())
        {
            arr.add(left.get(i++));
        }

        while(j < right.size())
        {
            arr.add(right.get(j++));
        }

        return arr;
    }
    
}
