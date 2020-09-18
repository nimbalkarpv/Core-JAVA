import java.util.Scanner;
class siminterest{
               public static void main(String argc[])
                 {
                   int amount,time;
                   float roi,si;
                   Scanner sc = new Scanner(System.in);
                   System.out.println("Enter a amount,Rate of interest,Time");
                   
                   amount = sc.nextInt();
                   time = sc.nextInt();
                   roi = sc.nextFloat();

                  si=(amount*time*roi)/100 ;

                  System.out.println("Simple interest = "+si);

                }
}