import java.util.ArrayList;

public class Sequence {

    private ArrayList<Integer> values;

    public Sequence()
    {
        values = new ArrayList<>();
    }

    public Sequence(int[] x)
    {
        int size = x.length;
        for(int i = 0; i < size; i++)
        {
            values.add(x[i]);
        }
    }

    public int add(int n)
    {
        int sum = 0;
        sum += values.get(0) + values.get(values.size())-1;

        return sum;
    }
}
