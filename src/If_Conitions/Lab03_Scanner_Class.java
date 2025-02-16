package If_Conitions;

import java.util.Scanner;

public class Lab03_Scanner_Class
{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
       int age= sc.nextInt();
        if(age>18)
        {
            System.out.println("You are allowed to vote");
        }
        else
        {
            System.out.println("You are not allowed to vote");
        }


    }
}
