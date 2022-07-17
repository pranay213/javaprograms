interface A
{
  void display();
}
interface B
{
   void show();
}
class C implements A,B
{
 public void display()  
 {
    System.out.println("Hello");
 }   
 public void show()
 {
    System.out.println("Hi");
 }
}
class Main
{
    public static void main(String ar[])
    {
        C obj=new C();
        obj.display();
        obj.show();
    }
}