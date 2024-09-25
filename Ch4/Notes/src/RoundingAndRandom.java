import java.util.Random;

public class RoundingAndRandom {

    public static void main(String[] args)

    {
        double d = 34.56789;
        double x = (Math.round(d*10))/10.0;
        double y = (int) d;
        System.out.println(x);
        System.out.println(y);

        String a = "Z";
        String b = "ab";

        System.out.println(a.compareTo(b));

        //System.out.println(randInt);

        /*for(int i = 0; i < 100; i++)
        {
            int rand = (int) (Math.random() * 11) -5;
            int randInt = (int) ( Math.random() * 5) + 1;
            System.out.println(randInt);
        }*/

        /*Quadratic q = new Quadratic(0, 2, 4);
        System.out.println(q.discriminant());
        System.out.println(q.evaluate(2));
        System.out.println(q.findRoot1());
        System.out.println(q.findRoot2());
        System.out.println(q.isSolution(0, 4));*/
    }

    public static String getEnds(String w)
    {
        String f = w.substring(0,1);
        String l = w.substring(w.length()-1);

        return f + l;
    }
}
