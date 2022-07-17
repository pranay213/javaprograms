import java.util.Scanner;
public class IfElse {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your salary");
        int Salary=sc.nextInt();
        if(Salary>=10000)
        {
                Salary=Salary+2000;
            System.out.println("increment in salary is:"+Salary);
        }
        else if(Salary>=20000){
                Salary +=3000; //salary =salay+3000
            System.out.println("increment in salary is:"+Salary);
        }
        else
        {
            Salary +=1000;
            System.out.println("increment in salary is:"+Salary);
        }
    }
    
}
