import java.util.Scanner;
class btnallprimeno2{
   public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a lower range number");
      int lower = sc.nextInt();

      System.out.println("Enter a uooer range number");
      int upper = sc.nextInt();

      for(int i=lower;i<=upper;i++)
        {
            int x=i/2;
             if(i==0 || i==1)
              {
                  continue;
              }
               else
               {
                boolean flag=true;
                for(int j=2;j<=x;j++)
                 {
                      if(i%j==0)
                       {
                           flag=false;
                           break;
                        }
                 }
                if(flag==true)
                 {
                   System.out.println(i);
                  }
               }
             } 
          }
     }
                
               