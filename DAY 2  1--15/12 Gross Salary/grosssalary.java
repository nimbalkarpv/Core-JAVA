import java.util.Scanner;

 class grosssalary{

       public static void main(String argc[])
            {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter A salary of Employeee: ");
              double salary=sc.nextDouble();

          if(salary<10000)
             {
               double HRA=(salary*10)/100;
               double DA=(salary*90)/100;
               double gs = salary + HRA + DA;
               System.out.println("Gross salary:= "+gs);
             }

           else
             {
               double HRA=2000;
               double DA=(salary*98)/100;
               double gs = salary + HRA + DA;
               System.out.println("Gross salary:= "+gs);
              }
       }
}
