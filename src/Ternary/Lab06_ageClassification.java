package Ternary;

public class Lab06_ageClassification
{
    public static void main(String[] args) {
//adult>18;Senior>65;minor<18;

       // int age=65;
        //Taking Input from command line
        String age_string=args[0];
        int age=Integer.parseInt(age_string);

        //  String result=(age<18)? "Y":"N";=(age<18)? "Minor":"adult or senior";=(age<18)? "Minor":(age<65)?"adult":"Senior"; :;
        String result=(age<18)? "minor" : (age<=65)?"adult":"Senior";
        System.out.println(result);
    }
}


