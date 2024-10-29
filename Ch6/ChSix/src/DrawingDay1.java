public class DrawingDay1 {
    public static void main(String[] args) {
        //filledRect(4, 4);
        drawTriangle(6);

    }

    public static void filledRect(int rows, int cols)
    {
        for(int r = 1; r <= rows; r++)
        {

            for(int c = 1; c <= cols; c++)
            {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void hollowRect(int rows, int cols)
    {
        for(int r = 1; r <= rows; r++)
        {

            for(int c = 1; c <= cols; c++)
            {
                if(c == 1 || c == cols)
                {
                    System.out.print("x");
                }
                else{
                    if(r == 1 || r == rows)
                    {
                        System.out.print("x");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void diagonal(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            System.out.println("x");
            for(int k = 1; k <= i; k++)
            {
                System.out.print(" ");
            }
        }
    }

    public static void X(int n)
    {
        for(int r = 1; r <= n; r++)
        {
            //System.out.println("X");
            for(int c = 1; c <= n; c++)
            {


            }


            //System.out.println();
        }
    }

    public static void drawTriangle(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = n; j >= 1; j--)
            {
                if(j>=i)
                {
                    System.out.print(j);
                    //System.out.print("X");
                }

            }
            System.out.println();
        }
    }
}
