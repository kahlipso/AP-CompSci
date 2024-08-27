
/**
 * Write a description of class DogDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DogDemo
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        System.out.println(d1.getName());
        d1.older();
        System.out.println(d1.getAge());
        
        Dog d2 = new Dog("Fido", 8);
        System.out.println(d2.getName());
        
        
    }
}
