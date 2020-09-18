import java.util.Scanner;

class readdays{

            public static void main(String argc[])
              {
                 int year,month,days,m;

                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter a dayes");
                 
                 m= sc.nextInt();

                 year=m/365;
                 m= m%365;
                 System.out.println("No. of years:"+year);
                 
                 month=m/30;
                 m=m % 30;
                 System.out.println("No. of  months: "+month);
                 
                 days=m;
                 System.out.println("No of DAys: "+days);

                  }
}