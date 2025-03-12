public class InsertionSorter {

    public static int[] insertionSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int n = arr[i];
            int j = i-1;

            while(j >= 0 && n < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = n;
        }
        return arr;
    }

}
