import java.util.ArrayList;

public class SelectionSorter {

    public static int[] selectionSort(int[] arr)
    {
        int size = arr.length;
        for(int i = 0; i < size - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < size; j++)
            {
                if(arr[j] < arr[min])
                    min = j;

            }
            int x = arr[i];
            arr[i] = arr[min];
            arr[min] = x;
        }
        return arr;
    }

    public static ArrayList<Integer> selSort(ArrayList<Integer> arr)
    {
        int size = arr.size();
        for(int i = 0; i < size - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < size; j++)
            {
                if(arr.get(j) < arr.get(min))
                    min = j;

            }
            int x = arr.get(i);
            arr.set(i , arr.get(min));
            arr.set(min, x);
        }
        return arr;
    }


    public static ArrayList<String> selSortString(ArrayList<String> arr) {
        int size = arr.size();
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr.get(j).compareTo(arr.get(min)) < 0)
                    min = j;

            }
            String x = arr.get(i);
            arr.set(i, arr.get(min));
            arr.set(min, x);
        }
        return arr;
    }
}
