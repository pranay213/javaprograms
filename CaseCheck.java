//program for casecheck and get the character at given index position
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any string or character");
        //to get the character at index position
      /*  char ch=s.next().trim().charAt(2);
        System.out.println(ch); */

        //casechecking
        //to convert string to char we use charAt
        char ch=s.next().trim().charAt(0);
        if(ch >='a' && ch <='z')
        {
            System.out.println("lowercase");
        }
        else
        {
            System.out.println("uppercase");
        }

    }
}
