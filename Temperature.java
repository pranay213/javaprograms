//program for temperature i.e celcius to fahrenheit
import java.util.Scanner;
public class Temperature
{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter temperature in celcius");
        float TempC=s.nextFloat();
        double TempF=(TempC*9/5)+32;
        System.out.println(TempF);
    }
}