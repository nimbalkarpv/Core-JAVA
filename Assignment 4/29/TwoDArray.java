import java.util.Scanner;
class TwoDArray{
  public static void main(String argc[])
   {
     Scanner sc = new Scanner(System.in);
     int arr[][]= new int[4][4];
     System.out.println("Enter a array element");
     
int count=0;
     for(int i=0;i<arr.length;i++)
      {
         for(int j=0;j<arr[i].length;j++)
             {
                arr[i][j]=sc.nextInt();
                 count++;
              }
       }
        System.out.println("Number of 1D array: = "+arr.length);
        System.out.println("No of Array Element"+count);
   }
}
        
     