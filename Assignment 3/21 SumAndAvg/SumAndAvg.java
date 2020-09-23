import java.util.Scanner;
class SumAndAvg {
 public static void main(String argc[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a 10 Number: ");
    int arr[]=new int[10];
   
    int sum= 0;
    for(int i=0;i<arr.length;i++)
     {
       arr[i]=sc.nextInt();
     }

    for(int i:arr)
     {
      sum=sum+i;
     }
   
     System.out.println("Sum: "+sum);
    System.out.println("Average = " +(sum/arr.length));
  }
}