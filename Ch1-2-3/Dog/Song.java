public class Song {

    private String title;
    private int duration;
    private double cost;
    private boolean isInLibrary = false;


    public Song()
    {
        title = "N/A";
        duration = 0;
        cost = 0.00;
        isInLibrary = false;
    }
    public Song(String songTitle, int songDuration, double songCost, boolean songIsInLibrary)
    {
        title = songTitle;
        duration = songDuration;
        cost = songCost;
        isInLibrary = songIsInLibrary;
    }
    public Song(String songTitle, int songDuration, double songCost)
    {
        title = songTitle;
        duration = songDuration;
        cost = songCost;
    }

    public double calculateTax()
    {
        return cost / 10;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean getIsInLibrary() {
        return isInLibrary;
    }

    public double getCost() {
        return cost;
    }

    public void setIsInLibrary(boolean inLibrary) {
        isInLibrary = inLibrary;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String songTitle)
    {
        title = songTitle;
    }
    public int getDuration()
    {
        return duration;
    }
    public void setDuration(int songDuration)
    {
        duration = songDuration;
    }
}
