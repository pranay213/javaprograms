//program to find largest number in given
import java.util.Scanner;
public class LargestNumber 
{
    public static void main(String[] args) {
        System.out.println("enter any 3 numbers");
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        // int c=s.nextInt();
        
      /*   int max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        
        System.out.println(max);*/
   
        //another method to find largest number
        // Math.max is a function
        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
