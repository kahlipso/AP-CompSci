public class Tenths {
    double[] nums;
    final double EPSILON = 1E-14;

    public Tenths()
    {
        nums = new double[1000];
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = Math.round((Math.random() * (10000.0 - 1.0) + 1.0) * 10) / 10.0;
        }

    }

    public Tenths(int n)
    {
        nums = new double[n];
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = Math.round(((Math.random() * (10000-1)) + 1) * 10) /10.0;
        }


    }

    public Tenths(double[] arr)
    {
        nums = new double[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            nums[i] = arr[i];
        }
    }

    public double getNum(int index)
    {
        return nums[index];
    }

    public void increase(double value)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] + value <= 10000.0)
            {
                nums[i] += value;
            }
            else {
                nums[i] = nums[i] + value - 9999.1;
            }

        }
    }

    public int find(double target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(Math.abs(nums[i]-target) < EPSILON)
            {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(double target)
    {
        for(double n : nums)
        {
            if(Math.abs(n-target) < EPSILON)
            {
                return true;
            }
        }

        return false;
    }

    public double average()
    {
        double sum = 0;
        double count = 0;
        for(double n : nums)
        {
            count ++;
            sum += n;
        }

        double avg = sum / count;

        return Math.round(avg*10.0) /10.0;
    }

    public void replace(int index, double replace)
    {
        //shift everything above index up
        for(int i = 0; i < nums.length-1; i++)
        {
            if(i >= index)
            {
                nums[i] = nums[i-1];
            }
        }
        //replace the desired index
        for(int i = 0; i < nums.length; i++){
            if(i==index){
                nums[i]=replace;
            }
        }
    }

    public void replace(double initial, double replace)
    {
        //find initial index of value
        for(int i = 0; i < nums.length; i++)
        {
            if(Math.abs(nums[i]-initial) <= EPSILON)
            {
                nums[i] = replace;
            }
        }

    }

    public void swap(int index1, int index2)
    {
        double value1 = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i == index1)
            {
                value1 = nums[index1];
            }
        }

        nums[index1] = nums[index2];
        nums[index2] = value1;
    }

    public int[] findAll(double target)
    {
        int counter = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(Math.abs(nums[i]-target) < EPSILON)
            {
                counter++;
            }
        }

        int[] indexes = new int[counter];
        int counter2 = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(Math.abs(nums[i]-target) < EPSILON)
            {
                indexes[counter2] = i;
                counter2++;
            }
        }

        return indexes;
    }

    public String toString()
    {
        String sum = "";
        for(int i = 0; i < nums.length; i++)
        {
            if(i < nums.length-1)
            {
                sum += nums[i] + ", ";
            }
            else if(i == nums.length-1)
            {
                sum += nums[i];
            }
        }

        return sum;
    }

    public boolean hasDuplicate()
    {
        double num = 0;
        for(int i = 0; i < nums.length; i++)
        {
            num = nums[i];
            for(int f =i+1; f < nums.length; f++)
            {
                if(Math.abs(num - nums[f]) < EPSILON)
                {
                    return true;
                }

            }
        }

        return false;
    }

    public boolean isSorted()
    {
        for(int i = 0; i < nums.length-2;i++)
        {
            if((nums[i] < nums[i+1] && nums[i+1] > nums[i+2]) || (nums[i] > nums[i+1] && nums[i+1] < nums[i+2]))
            {
                return false;
            }

        }
        return true;
    }

    public double range()
    {
        if(nums.length == 0)
        {
            return -1;
        }

        double max = 0, min = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }
            if(nums[i] < min)
            {
                min = nums[i];
            }
        }

        return max-min;
    }
}
