
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
        Hotel hotel = new Hotel("DoubleTree", 8, 179.99, false);
        Hotel hotel2 = new Hotel("XDD", 10, 179.99, false);
        //hotel = hotel2;
        hotel2.setNumStars(5);

        Hotel h = hotel;
        //h.setNumStars(h.getNumStars() + 5);
        System.out.println(h.getNumStars());
        System.out.println(hotel.getNumStars());
    }
}
