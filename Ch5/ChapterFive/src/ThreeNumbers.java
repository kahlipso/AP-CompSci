public class ThreeNumbers {

    private int a, b, c;


    public ThreeNumbers()
    {
        a = 1;
        b = 2;
        c = 3;
    }
    public ThreeNumbers(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean contains(int x)
    {
        if(x==a)
        {
            return true;
        }
        else if(x==b)
        {
            return true;
        }
        else if(x==c)
        {
            return true;
        }
        return false;
    }

    public boolean isInOrder()
    {
        if(a < b && b < c)
        {
            return true;
        }
        else if(c < b && b < a)
        {
            return true;
        }

        return false;
    }

    public int getLargest()
    {
        return Math.max(a, Math.max(b, c));
    }

    public boolean isPythagoreanTriple()
    {

        if(a == 0 && b == 0 && c == 0)
        {
        return false;
        }
        if(c == getLargest())
        {
            if(c * c == doPythag(a, b))
                return true;
        }
        else if(b == getLargest())
        {
            if(b * b == doPythag(a, c))
                return true;
        }
        else if(a == getLargest())
        {
            if(a * a == doPythag(b, c))
                return true;
        }


        return false;
    }

    public void sortNums()
    {
        int s = 0, m = 0, l = 0;

        if(c == getLargest())
        {
            l = c;
            if(a > b)
            {
                m=a;
                s=b;
            }
            else {
                s = a;
                m=b;
            }

        }
        else if(b == getLargest())
        {
            l = b;
            if(a > c)
            {
                s = c;
                m=a;
            }
            else {
                s = a;
                m = c;
            }

        }
        else if(a == getLargest())
        {
            l = a;
            if(b > c)
            {
                m = b;
                s = c;
            }
            else {
                m = c;
                s = b;
            }

        }

        a = s;
        b = m;
        c = l;
    }

    public boolean isGeometricSequence()
    {
        if(a != 0 && b != 0 && c != 0)
        {
            if((double) b/a == (double) c/a || (double ) a/b == (double ) b/c)
            {
                return true;
            }
        }

        return false;
    }

    private int doPythag(int x, int y)
    {
        return x * x + y * y;
    }

    public int getNum3() {
        return c;
    }

    public void setNum3(int c) {
        this.c = c;
    }

    public int getNum2() {
        return b;
    }

    public void setNum2(int b) {
        this.b = b;
    }

    public int getNum1() {
        return a;
    }

    public void setNum1(int a) {
        this.a = a;
    }
}
