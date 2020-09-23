import java.util.Scanner;
class reversenum{
 public static void main(String argc[])
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a Number");
       int num=sc.nextInt();

       while(num>1)
        {
       int i=num%10;
       System.out.print(i);
       num=num/10;
       }
 }
}