public class DrawingDay1 {
    public static void main(String[] args) {
        //filledRect(4, 4);
        hollowRect(5);

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

    public static void hollowRect(int n)
    {
        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= n; c++)
            {
                if(r==1 || r==n)
                {
                    System.out.print("X");
                }
                else if(c==1 || c== n)
                {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
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
        int minus = n-1;

        for(int r= 1; r <= n; r++)
        {
            //System.out.println("X");
            for(int c = 1; c <= n; c++)
            {
                if(r==c || r+minus ==c)
                {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }



            }
            minus-=2;
            System.out.println();

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
