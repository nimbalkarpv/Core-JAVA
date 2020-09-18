import java.util.Scanner;
class percentage{
      public static void main(String argc[])
            {
               int m1, m2,m3,m4,m5;
               float total,percentage;

               Scanner sc =new Scanner(System.in);
               
             
              System.out.println("ENTER  five subject MARK mark");
              m1 = sc.nextInt();
              m2 = sc.nextInt();
              m3 = sc.nextInt();
              m4 = sc.nextInt();
              m5 = sc.nextInt();

          total=m1+m2+m3+m4+m5;
          
          percentage=(total/500)*100;
          System.out.println("Percentage mark = "+percentage);
         }
}