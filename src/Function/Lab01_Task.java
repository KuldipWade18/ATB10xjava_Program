package Function;

import java.util.Scanner;

public class Lab01_Task {
    public static void main(String[] args) {
// Create  a function of sub , sum,mul, and Div
        //with parameter a, b (take the input from user)
// logic building
        Scanner sc= new Scanner(System.in);
        System.out.println("Ente  the num1");
        int a  =sc.nextInt();
        System.out.println("Ente  the num2");
        int b  =sc.nextInt();

        int result_sum=sum(a,b);
        int result_sub=sub(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);
        int result_modulas=modulas(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_div);


    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int modulas(int a,int b){
        return a%b;
    }
    static int div(int a,int b){
        if(b==0){
            System.out.println("Div by zero not allowd");
        }
        return a/b;
    }

}
