//fibonacci series program 
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int num=s.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<num)
        {
            //to print the fibanoci series 0,1,1,2,3,5,8,13...
         /*  count=a+b;
            a=b;
            b=count;
            System.out.println(b);*/
            
            //to get the number at given position
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);


    }
    
}
