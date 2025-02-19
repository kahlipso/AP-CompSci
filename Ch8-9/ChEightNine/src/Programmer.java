public class Programmer {
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Programmer(String name, int age, boolean isCurrentlyEmployed, double salary, String language)
    {
        //super(name, age, isCurrentlyEmployed, salary);
        this.language = language;
    }

}
