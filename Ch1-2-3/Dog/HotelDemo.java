
/**
 * Write a description of class DogDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HotelDemo
{
    public static void main(String[] args)
    {
        Hotel hotel = new Hotel("DoubleTree", 4, 179.99, false);
        System.out.println(hotel.getName());
        System.out.println(hotel.getAvgRoomCost());
        hotel.setAvgRoomCost(157);
        System.out.println(hotel.getAvgRoomCost());
    }
}
