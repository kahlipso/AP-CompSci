public class Circle {

    private int radius;

    public Circle()
    {
        radius = 10;
    }
    public Circle(int radius)
    {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double computeArea()
    {
        double area = radius * radius * 3.14;

        return area;
    }

    public double computeCircumference()
    {
        return 2 * radius * 3.14;
    }


}
