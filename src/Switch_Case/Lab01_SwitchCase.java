package Switch_Case;

import java.util.Scanner;

public class Lab01_SwitchCase
{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Ebter the Day number(1 to 7)");
        int day =sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wen");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Frid");
                break;
                case 6:
            System.out.println("Saturday");
                    break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
