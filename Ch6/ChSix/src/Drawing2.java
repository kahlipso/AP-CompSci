public class Drawing2 {

    public static void main(String[] args) {
        drawSailboat(10);
    }
    public static void printBackwardsDiagonal(int n)
    {
        int x = n-1;
        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= n; c++)
            {
                if(c - r == x)
                {
                    System.out.print("x");
                }
                else {
                    System.out.print(" ");
                }
            }
            x-=2;
            System.out.println();
        }
    }

    public static void drawN(int n)
    {
        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= n; c++)
            {
                if(c == 1 || c == n || c-r == 0)
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

    public static void drawPyramid(int n)
    {
        for(int r = 1; r <= n; r++)
        {
            int x = r+1;
            for(int c = 1; c <= n + (n-1); c++)
            {
                if(c > n-r && c < n+r)
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

    public static void drawSailboat(int n)
    {
        int nHalf = (int) Math.round(n/2.0);
        for(int r = 1; r <= nHalf; r++)
        {

            for(int c = 1; c <= n; c++)
            {
                if(r==nHalf)
                {
                    System.out.print("X");
                }
                if(r<nHalf)
                {
                    if(c== nHalf || c==nHalf+(r-1))
                    {
                        System.out.print("X");
                    }
                    else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
    public static void drawRegHexagon(int n)
    {
        int cMax = (n-1) * 2 + n;
        int rMax = 2 * n -1;

        for(int r = 1; r <= rMax; r++)
        {
            for(int c = 1; c <= cMax; c++)
            {
                if(r == 1 || r == rMax)
                {
                    if(c >= n && c < n*2)
                    {
                        System.out.print("X");
                    }
                }
                else if(c < n)
                {

                }
            }
        }
    }
}
