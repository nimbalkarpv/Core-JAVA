import java.util.Scanner;
  class primeornot{
   public static void main(String argc[])
   { 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int num = sc.nextInt();
     
     int i=num/2;
     for(int j=2;j<=2;j++)
     {
        if(num%j==0)
        {
          System.out.println("Number is not prime");
         }
         else
         {
          System.out.println("Number is prime");
        } 
        }
  }
}