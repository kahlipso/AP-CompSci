public class Student extends Person{
    private static int id;
    private double gpa;

    public Student(String name, int age, double gpa)
    {
        super(name, age);
        this.gpa = gpa;

    }

    public boolean isHonorRoll()
    {
        if(gpa > 3.0)
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nID: " + id + "\nGPA: " + gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
