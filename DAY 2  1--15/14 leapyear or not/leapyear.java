import java.util.Scanner;

class leapyear{
       public static void main(String argc[])
         {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a year: ");
            int year = sc.nextInt();

             if(year%4==0)
                  {
                      
                      if(year%100==0)
                         {
                           
                             if(year%400==0)
                               
                              {
                               System.out.println("Leap year ");
                              }
                             else
                              {
                                System.out.println("not Leap year ");
                              }
                          }
                       else 
                          System.out.println("Leap year ");
                   }
                   else
                   System.out.println("NOT Leap year ");
      }
}
