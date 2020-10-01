import java.util.Scanner;
class mathope{
    
  int add(int a,int b)
  {
   int c =a+b;
   return c;
  }

 int substract(int a,int b)
  {
    int d=a-b;
    return d;
   }

 int multiply(int a,int b)
  {
    int e=a*b;
    return e;
   }

 double power(double a,double b)
  {
     double f=Math.pow(a,b);
       return f;
  } 

}

class Demo{
public static void main(String argc[])
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a two number:");
     int a = sc.nextInt();
     int b = sc.nextInt();

     mathope m1=new mathope();
     int sum=m1.add(a,b);
     System.out.println("Sum =" +sum);

     int substraction=m1.substract(a,b);
     System.out.println("substraction ="+substraction);   

     int mul=m1.multiply(a,b);
     System.out.println("Multiplication =" +mul);

      double p = m1.power(a,b);
       System.out.println("Power =" +p);
    
         
  }
}
     
     
 
    