public class Hotel {

    private String name;
    private int numStars;
    private double avgRoomCost;
    private boolean isOnBeach;

    public Hotel()
    {
        name = "Default Name";
        numStars = 0;
        avgRoomCost = 0;
        isOnBeach = false;
    }

    public Hotel(String name, int numStars, double avgRoomCost, boolean isOnBeach)
    {
        this.name = name;
        this.numStars = numStars;
        this.avgRoomCost = avgRoomCost;
        this.isOnBeach = isOnBeach;
    }
    
    public Hotel(String name)
    {
        this.name = name;
        this.numStars = 0;
        this.avgRoomCost = 0;
        this.isOnBeach = false;
    }

    public String getName() {
        return name;
    }

    public int getNumStars() {
        return numStars;
    }

    public void setNumStars(int numStars) {
        this.numStars = numStars;
    }

    public double getAvgRoomCost() {
        return avgRoomCost;
    }

    public void setAvgRoomCost(double avgRoomCost) {
        this.avgRoomCost = avgRoomCost;
    }

    public boolean getIsOnBeach() {
        return isOnBeach;
    }

    public double calculateAvgCostForStay(int days)
    {
        return avgRoomCost * days;
    }

}
