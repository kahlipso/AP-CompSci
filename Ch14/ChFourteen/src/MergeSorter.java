import java.util.ArrayList;

public class MergeSorter {

    public static void main(String[] args) {
        int[] b = {1, 2, 5, 4, 3, 9, 8};

        int[] d = mergeSort(b);

        for(int i : d)
        {
            System.out.println(i);
        }
    }

    public static int[] merge(int[] a, int[] b)
    {
        int size = a.length + b.length;
        int[] arr = new int[size];

        int i = 0, j = 0, k =0;

        //compares elements of a vs b
        while(i < a.length && j < b.length)
        {
            if(a[i] <= b[j])
            {
                arr[k] = a[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = b[j];
                j++;
                k++;
            }

        }

        // Copy remaining elements of a
        while (i < a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of b
        while (j < b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }

        return arr;
    }

    public static int[] mergeSort(int[] arr)
    {
        //base case
        if(arr.length == 2)
        {
            if(arr[0] > arr[1])
            {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
            return arr;
        }
        if (arr.length <= 1) {
            return arr;
        }

        //split into 2 arrays
        int[] a = new int[arr.length/2];
        int[] b = new int[arr.length - arr.length/2];

        for(int i = 0; i < a.length; i++)
        {
            a[i] = arr[i];
        }
        for(int i = 0; i < b.length; i++)
        {
            b[i] = arr[a.length + i];
        }

        return merge(mergeSort(a), mergeSort(b));
    }

    public static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b)
    {
        int size = a.size() + b.size();
        ArrayList<String> arr = new ArrayList<>(size);

        int i = 0, j = 0;

        //compares elements of a vs b
        while(i < a.size() && j < b.size())
        {
            if(a.get(i).compareTo(b.get(j)) <= 0)
            {
                arr.add(a.get(i));
                i++;
            }
            else
            {
                arr.add(b.get(j));
                j++;
            }
        }

        // Copy remaining elements of a
        while (i < a.size()) {
            arr.add(a.get(i));
            i++;
        }

        // Copy remaining elements of b
        while (j < b.size()) {
            arr.add(b.get(j));
            j++;
        }

        return arr;
    }

    public static ArrayList<String> mergeSort(ArrayList<String> arr)
    {
        //base case
        if(arr.size() == 2)
        {
            if(arr.get(0).compareTo(arr.get(1)) > 0)
            {
                String temp = arr.get(0);
                arr.set(0, arr.get(1));
                arr.set(1, temp);
            }
            return arr;
        }
        if (arr.size() <= 1) {
            return arr;
        }

        //split into 2 arrays
        int mid = arr.size() / 2;

        ArrayList<String> a = new ArrayList<>(mid);
        ArrayList<String> b = new ArrayList<>(arr.size() - mid);

        for (int i = 0; i < mid; i++) {
            a.add(arr.get(i));
        }
        for (int i = mid; i < arr.size(); i++) {
            b.add(arr.get(i));
        }

        return merge(mergeSort(a), mergeSort(b));
    }

}
