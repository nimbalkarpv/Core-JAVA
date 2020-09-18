import java.util.Scanner;
class merrigeyear{
    public static void main(String argc[])
        {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter a Gender");
          char gender=sc.next().charAt(0);

           System.out.println("Enter a Age");
          int age=sc.nextInt();
 
 if((gender == 'm' && age>21) || (gender == 'f' && age>18))
    {
       System.out.println("Eligibal gor merriage");
    }
  else
    {
      System.out.println("Not Eligibal for merriage");
    }
  }
}
          
          