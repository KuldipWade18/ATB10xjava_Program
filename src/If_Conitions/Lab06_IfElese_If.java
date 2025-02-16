package If_Conitions;

import java.util.Scanner;

public class Lab06_IfElese_If {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1=sc.nextInt();
        System.out.println("Enter the number 2");
        int num2=sc.nextInt();

        if(num1>num2)
        {
            System.out.println("Num1");
        } else if (num2>num1)
        {
            System.out.println("Num2");
        }
        else
        {
            System.out.println("Equal");
        }
    }
}
