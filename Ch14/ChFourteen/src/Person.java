public class Person {

    private double height ,weight;


    public Person(double height, double weight)
    {
        this.height = height;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString()
    {
        return height + "\t" + weight;
    }

}
