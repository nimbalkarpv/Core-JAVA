import java.util.Scanner;

class gretestnum{
     public static void main(String argc[])
                  {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a three Number: ");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    int c=sc.nextInt();
                 
                   
                     String s=(a>b && a>c)?a+" is greter":(b>a && b>c)?b+" is greter":c+" is greter";
          
                     System.out.println(s);

                    
                      
                       
           }
}                            