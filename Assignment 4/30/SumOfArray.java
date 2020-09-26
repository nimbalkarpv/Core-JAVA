import java.util.Scanner;
 class SumOfArray{
   public static void main(String argc[])
     {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter a array element ");
        
        for(int i=0;i<arr.length;i++)
          {
             for(int j=0;j<arr[i].length;j++)
               {
                 arr[i][j]=sc.nextInt();
                }
           }

int sum=0;

         for(int i=0;i<arr.length;i++)
          {
             for(int j=0;j<arr[i].length;j++)
             {
                if(i==j)
                {
                  sum = sum + arr[i][j];
                   System.out.println("Diagonal numbers are = "+arr[i][j]);
                 }
              }
           }
       
         System.out.println("Sum of diagonal number ="+sum);
  }
}       