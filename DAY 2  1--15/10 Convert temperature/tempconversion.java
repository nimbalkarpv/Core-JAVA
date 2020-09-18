import java.util.Scanner;

class tempconversion{
      public static void main(String argc[])
        {
           float f,c;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a Temperature in Fahrenheit: ");
           
           f=sc.nextFloat();

            c= 5*(f-32)/9;
 
            System.out.println("Temperature in celcius:= "+c);
      
           }
} 