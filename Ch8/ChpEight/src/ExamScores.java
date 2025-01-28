public class ExamScores {
    public String[][] responses;
    public String[] key;

    public ExamScores(String[][] examRes, String[] examKey)
    {
        responses = new String[examRes.length][examRes[0].length];
        for(int r = 0; r < examRes.length; r++)
        {
            for(int c = 0; c < examRes[0].length; c++)
            {
                responses[r][c] = examRes[r][c];
            }
        }

        key = new String[examKey.length];
        for(int i = 0; i < examKey.length; i++)
        {
            key[i] = examKey[i];
        }
    }

    int numberCorrect(int k)
    {
        int num = 0;
        for(int i = 0; i < key.length; i++)
        {
            if(responses[k][i].equals(key[i]))
            {
                num++;
            }
        }

        return num;
    }

    public int[] correctSummary()
    {
        int[] num = new int[responses.length];
        for(int i = 0; i < responses.length; i++)
        {
            num[i] += numberCorrect(i);
        }

        return num;
    }

    public double classAverage()
    {
        int sum = 0;
        int[] arr = correctSummary();
        for(int i =0; i < arr.length; i++)
        {
            sum+= arr[i];
        }

        double avg = sum / (responses.length * 1.0);
        return Math.round(avg * 10.0) / 10.0;

    }
}
