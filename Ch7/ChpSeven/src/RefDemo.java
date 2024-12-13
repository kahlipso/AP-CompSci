public class RefDemo {
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Fido", 11);
        int var  = 5;
        kennel(myDog, var);
        System.out.println(myDog.getAge());
    }

    public static void kennel(Dog d, int n)
    {
        Dog dog1 = new Dog("Fido", 11);
        Dog dog2 = new Dog("Rex", 2);

        System.out.println(dog1 == d);

        Dog[] kennel = {dog1, dog2, d};

        System.out.println(dog1 == kennel[0]);
        System.out.println(dog1 == kennel[2]);
        System.out.println(dog1.getName().equals(kennel[2].getName()));

        Dog dog3 = kennel[0];
        System.out.println(dog3==dog1);

        dog1.older();
        System.out.println(kennel[0].getAge());
        System.out.println(dog3.getAge());
        System.out.println(d.getAge());

        d.older();
        d=dog2;
        d.older();
        System.out.println(d.getAge());
        System.out.println(kennel[2].getAge());
        n++;
    }
}
