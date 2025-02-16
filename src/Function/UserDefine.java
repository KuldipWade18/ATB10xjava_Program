package Function;



import java.util.Scanner;

public class UserDefine
{
    public static void main(String[] args) {


        //Calling
     //   main();
    //    greet();

      /*  String  s = greet_with_hello();
        System.out.println(s);

        int  a = age();
        System.out.println(a);*/

        //3
      //  greet_with_name("Kuldip");
        //greet_with_name("Wade");

        //  greet_with_fullname("Kuldip", "wade");

     /*   Scanner sc= new Scanner(System.in);
        System.out.println("Ente  the name");
        String first  =sc.next();
        System.out.println("Ente  the name");
        String last  =sc.next();
        greet_with_fullname(first,last);*/

////D. with parameter and with return type
    int sum    =sumOfTwonumber(4,5);
        int sum1    =sumOfTwonumber(10,5);
        System.out.println(sum);
        System.out.println(sum1);












    }
    //4 type
    //A.without parameters and without Return type
//Step -1 declaration/define
 /*   static void main()
    {
        System.out.println("Hi looks like another main");
    }
    static void greet()
    {
        System.out.println("Hi I am without parameters and without Return type");
    }*/

    //B.without parameters but with Return type

  /*  static String greet_with_hello()
    {
        return "Hi I am without parameters but with Return type";
    }

    static int age()
    {
        System.out.println("Hi this is just printing");
        return 20 ;
    } */

    //C.with parameters and without Return type

    static void greet_with_name(String name)
    {
        System.out.println("Hi your name is "+name);
    }
    static void greet_with_fullname(String firstname, String lastname)
    {
        System.out.println("Hi your name is "+firstname + lastname);
    }

    //D. with parameter and with return type
    static int sumOfTwonumber(int a,int b)
    {
        return a+b;
    }









}
