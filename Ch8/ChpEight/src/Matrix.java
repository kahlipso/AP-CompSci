public class Matrix {

    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public Matrix(int row, int col)
    {
        matrix = new int[row][col];
        for(int r = 0; r < matrix.length;r++)
        {
            for(int c = 0; c < matrix[0].length; c++)
            {
                int x = (int) (Math.random() * 9)+1;
                matrix[r][c] = x;
            }
        }

    }

    public Matrix(int row, int col, int start)
    {
        int i = start;

        matrix = new int[row][col];
        for(int r = 0; r < matrix.length;r++)
        {
            for(int c = 0; c < matrix[0].length; c++)
            {

                matrix[r][c] = i;
                i++;
            }
        }
    }

    public Matrix(int[][] arr)
    {
        matrix = new int[arr.length][arr[0].length];

        for(int r = 0; r < matrix.length; r++)
        {
            for(int c = 0; c < matrix[0].length; c++)
            {
                matrix[r][c] = arr[r][c];
            }
        }
    }

    public void printMatrix()
    {
        for(int[] nums : matrix)
        {
            for(int num : nums)
            {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public int getValue(int row, int col)
    {
        return matrix[row][col];
    }

    public int findMin()
    {
        int temp = matrix[0][0];

        for(int r = 0; r < matrix.length; r++)
        {
            for(int c = 0; c < matrix[0].length; c++)
            {
                if(matrix[r][c] < temp)
                {
                    temp = matrix[r][c];
                }
            }
        }

        return temp;
    }

    public int rowSum(int row)
    {
        int sum = 0;
        for(int i = 0; i < matrix[0].length; i++)
        {
            sum += matrix[row][i];
        }

        return sum;
    }

    public void removeShiftUp(int row, int col)
    {
        matrix[row][col] = 0;
        int temp = matrix[row][col];

        for(int r = 0; r < matrix.length; r++)
        {
            for(int c = 0; c < matrix[0].length; c++)
            {
                if(c == col && r >= row)
                {
                    if(r < matrix.length -1) {
                        matrix[r][c] = matrix[r + 1][c];
                    }
                    else if(c == col && r == matrix.length-1)
                    {
                        matrix[r][c] = temp;
                    }
                }


            }
        }
    }

    public boolean isColAscending(int col)
    {
        int temp = matrix[0][col];
        for(int r = 0; r < matrix.length; r++)
        {
            if(r < matrix.length -1)
            {
                if(matrix[r][col] > matrix[r+1][col])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isEveryColAscending()
    {
        for(int i = 0; i < matrix[0].length; i++)
        {
            if(isColAscending(i) == false)
            {
                return false;
            }
        }
        return true;
    }

    public int[] firstEven()
    {
        int[] ans = new int[2];
        for(int r = 0; r < matrix.length; r++)
        {
            for(int c = 0; c < matrix[0].length; c++)
            {
                if(matrix[r][c] % 2 == 0)
                {
                    ans[0] = r;
                    ans[1] = c;
                    return ans;
                }


            }
        }
        return null;
    }

    public double adjacentAverage(int row, int col)
    {
        if(row > 0 && row < matrix.length-1 && col > 0 && col < matrix[0].length-1)
        {
            double sum = matrix[row-1][col] + matrix[row+1][col] + matrix[row][col-1] + matrix[row][col+1];
            double average = sum/4.0;
            return average;
        }
        return -1;
    }
}
