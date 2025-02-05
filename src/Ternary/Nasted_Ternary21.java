package Ternary;

public class Nasted_Ternary21 {
    public static void main(String[] args) {

        int num = 15;
        //    String result=(num > 10)? "A is max" : "B is not max";
        String result = (num > 10) ? (num > 20 ? "G>20" : "B 10 to 20") : "B";
        //     System.out.println(result);

        //Largest number
        int n1 = 100, n2 = 45, n3 = 350;
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);

       System.out.println(largest);
    }
}