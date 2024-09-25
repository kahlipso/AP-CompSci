public class MyVector {
    private int x, y;

    public MyVector()
    {
        this.x = (int) (Math.random() * 21) -10;
        this.y = (int) (Math.random() * 21) -10;
    }
    public MyVector(int x, int y)
    {
        this.x = x;
        this.y = y;
    }


    public double magnitude(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public void dilate(double factor)
    {
        x = (int) Math.round(x * factor);
        y = (int) Math.round(y * factor);
    }

    public int dot(MyVector otherVector)
    {
        return x * otherVector.x + y* otherVector.y;
    }

    public double angle(MyVector vector)
    {
        double rad = Math.acos((dot(vector)) / (vector.magnitude() * magnitude()));
        double ang = Math.toDegrees(rad);
        return Math.round(ang * Math.pow(10,6)) / Math.pow(10,6);
    }

    public String toString()
    {
        return "<" + x + "," + y + ">";
    }

    public boolean isOrthogonal(MyVector vector)
    {
        if(dot(vector) == 0)
        {
            return true;
        }
        return false;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
