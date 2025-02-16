package While_Loop;

public class Lab04_DoWhile_01 {


    public static void main(String[] args) {
        int a = 0;

// while (a<0)//not execute the code
// {
//     System.out.println(a);;
//     a++;
// }

        do //execute one time
        {
            System.out.println(a);
            a++;

        } while (a < 0);

    }
}
