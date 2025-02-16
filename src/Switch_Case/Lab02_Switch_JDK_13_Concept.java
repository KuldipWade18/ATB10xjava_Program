package Switch_Case;

public class Lab02_Switch_JDK_13_Concept
{
    public static void main(String[] args) {
  //multiple cases added

        int itemcode=001;

        switch (itemcode)
        {
            case 001,002,005:
                System.out.println("Electronic gadegt");
                break;
            case 004,006,007:
                System.out.println("This is just gadegt");
                break;
            default:
                System.out.println("None");
        }


    }
}
