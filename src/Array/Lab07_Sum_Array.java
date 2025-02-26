package Array;

public class Lab07_Sum_Array
{
    public static void main(String[] args) {
        int[]num={21,34,56,67,89};
        int sum=0;

        /*for(int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
        }
        System.out.println(sum);*/

        System.out.println("===for Each Loop");

        for(int n:num)
        {
            sum=sum+n;
        }
        System.out.println(sum);

    }
}
