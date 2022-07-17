import java.util.*;
class EvenorOdd
{
    public static void main(String ar[])
    {
         Scanner s = new Scanner(System.in);  
        System.out.println("enter any number");
        int num=s.nextInt();
        if(num%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}
