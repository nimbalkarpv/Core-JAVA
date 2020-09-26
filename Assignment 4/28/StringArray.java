import java.util.Scanner;
class StringArray{
 public static void main(String argc[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a how much string you entered");
      
     int n=sc.nextInt();
     String arr[]=new String[n];

     for(int i=0;i<arr.length;i++)
      {
         arr[i]=sc.next();
      }
 
      for(String name:arr)
      {
         System.out.print(" "+name);
      }
  }
}
     

     