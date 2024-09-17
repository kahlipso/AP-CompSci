public class Quadratic {

    private double a, b, c;

    public Quadratic()
    {
        a = 1;
        b = 1;
        c = 1;
    }

    public Quadratic(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double discriminant()
    {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double findRoot1()
    {
        return ((-1 * b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ 2 * a;
    }
    public double findRoot2()
    {
        return ((-1 * b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ 2 * a;
    }

    public double evaluate (double x)
    {
        return a * Math.pow(x,2) + b * x + c;
    }

    public boolean isSolution(double x, double y)
    {
        if(a * Math.pow(x,2) + b * x + c == y)
        {
            return true;
        }
        return false;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}

