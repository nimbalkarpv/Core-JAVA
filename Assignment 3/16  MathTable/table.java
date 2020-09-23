import java.util.Scanner;
class table{
  public static void main(String argc[])
     {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Number for Table");
       int num=sc.nextInt();
       
       for(int i=1;i<=10;i++)
      {
        int a=num*i;
        System.out.println(a);
       }
   }
 }