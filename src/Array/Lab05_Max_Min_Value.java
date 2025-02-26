package Array;

public class Lab05_Max_Min_Value
{
    public static void main(String[] args) {
        int[]array={100,56,200,20,67,89};

        int max_output=give_max(array);
        System.out.println(max_output);
        int min_output=give_min(array);
        System.out.println(min_output);


    }

static int give_max(int[] array)
{
    int max=0;
            for(int i=0;i< array.length;i++)
            {
                if(array[i]>max)
                max=array[i];
            }
    return max;
}
    static int give_min(int[] array)
    {
        int min=array[0];
        for(int i=0;i< array.length;i++)
        {
            if(array[i]<min)
                min=array[i];
        }
        return min;
    }
}

