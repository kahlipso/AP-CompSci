public class House {


    private double value;
    private String city;
    public House()
    {
        value = 100000;
        city = "Chicago";
    }
    public House(double value, String city)
    {
        this.value = value;
        this.city = city;
    }
    public House(String city)
    {
        this.city = city;
    }

    public House(double value)
    {
        this.value = value;
    }

    public void increaseValue(double increase)
    {
        this.value = this.value + this.value * increase;
    }

    public void increaseValue()
    {
        this.value = this.value + this.value * 0.02;
    }
    public double getValue() {
        return value;
    }

    public String getCity() {
        return city;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
