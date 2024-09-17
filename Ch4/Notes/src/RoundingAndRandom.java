import java.util.Random;

public class RoundingAndRandom {

    public static void main(String[] args)

    {
        /*double d = 34.56789;
        double x = (Math.round(d*10))/10.0;
        double y = (int) d;
        System.out.println(x);
        System.out.println(y);


        double n = (Math.round(d*1000))/1000.0;

        int randInt = (int) ( Math.random() * -5) + 1;

        System.out.println(randInt);

        for(int i = 0; i < 100; i++)
        {
            int rand = (int) (Math.random() * 11) -5;

            System.out.println(rand);
        }*/

        Quadratic q = new Quadratic(0, 2, 4);
        System.out.println(q.discriminant());
        System.out.println(q.evaluate(2));
        System.out.println(q.findRoot1());
        System.out.println(q.findRoot2());
        System.out.println(q.isSolution(0, 4));
    }
}
