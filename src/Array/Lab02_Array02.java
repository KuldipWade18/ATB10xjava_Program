package Array;

public class Lab02_Array02
{
    public static void main(String[] args) {
        int[]marks={1,2,3,4,5,6};
        //2nd
        int[]marks2=new int [5];
        //System.out.println(marks.length);//Length-it is property; in case of array normal property
      //  System.out.println(marks2[2]);//for int default value is zero, and for string is null
        marks2[0]=10;
        marks2[1]=20;
        marks2[2]=30;
        marks2[3]=40;
        marks2[4]=50;
        System.out.println(marks2);//garbage bvalur
    }
}
