import java .util.Scanner;
class circle {
   public static void main(String argc[])
         {
           Scanner r = new Scanner (System.in);
           System.out.println("Enter a Radius of circle");
           float radius = r.nextFloat();
           
          
           System.out.println("Perimeter of Circle = "+(2 * 3.14 * radius));
           System.out.println("Area Of Circle = "+(3.14 * radius * radius));
         }
}