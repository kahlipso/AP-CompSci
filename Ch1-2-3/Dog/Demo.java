
/**
 * Write a description of class DogDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        System.out.println(d1.getName());
        d1.older();
        System.out.println(d1.getAge());
        
        Dog d2 = new Dog("Fido", 8);
        System.out.println(d2.getName());

        Dog d3 = new Dog("Clazy", 8);

        System.out.println(d1);

        Song song = new Song("LEGENDS NEVER DIE", 3, 5, false);
        System.out.println(song.calculateTax());


    }
}
