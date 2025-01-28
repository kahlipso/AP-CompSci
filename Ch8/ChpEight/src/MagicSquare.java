public class MagicSquare {

    int[][] arr;

    public MagicSquare(int[][] arr){
        int size = arr.length;
        this.arr = new int[size][size];

        for(int r = 0; r<size; r++){
            for(int c = 0; c<size; c++){
                this.arr[r][c] = arr[r][c];
            }
        }
    }

    public boolean isMagicSquare()
    {
        int size = arr.length;
        int first = 0;


        int sumD1 = 0, sumD2 = 0;

        for(int r = 0; r < size; r++)
        {
            first += arr[r][0];
        }

        for(int r = 0; r<size; r++){
            int sumRow = 0;
            for(int c = 0; c<size; c++){
                sumRow += arr[r][c];
            }
            if(sumRow != first){
                return false;
            }
        }
        for(int col = 0; col<size; col++){
            int sumCol = 0;
            for(int row = 0; row<size; row++){
                sumCol += arr[row][col];
            }
            if(sumCol != first){
                return false;
            }
        }

        for(int i = 0; i < size; i++)
        {
            sumD1 += arr[i][i];
        }
        if(sumD1 != first)
        {
            return false;
        }

        for(int i = 0; i < size; i++)
        {
            sumD2 += arr[i][size-i-1];
        }
        if(sumD2 != first)
        {
            return false;
        }
        return true;
    }

    public int getMagicNumber()
    {

        int num = 0;
        if(isMagicSquare() == true)
        {
            for(int r = 0; r < arr.length; r++)
            {
                num += arr[r][0];
            }
            return num;
        }
        return -1;

    }

    public void print()
    {

        for(int[] nums : arr)
        {
            for(int num : nums)
            {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

}
