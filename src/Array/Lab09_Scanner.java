package Array;

import java.util.Scanner;

public class Lab09_Scanner
{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int[]number=new int[size];


        for(int i=0;i<number.length;i++)

        {
            System.out.println("Enter the number");
            number[i]=sc.nextInt();
        }
        System.out.println("-----===========------");
// print array
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
}
