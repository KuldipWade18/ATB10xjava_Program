package ForLoop;

public class Lab06_Continue
{
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++)
        {
            if(i==5)
            {
                continue;//skip the 5 and execute the code
            }
            System.out.println(i);
        }
    }
}
