import java.util.Scanner;
 class SumOfDoubleArray{
    public static void main(String argc[])
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 20 number: ");
        int arr[][]=new int[5][4];
        
        for(int i=0; i<arr.length; i++)
        {
          for(int j=0;j<arr[i].length;j++)
            {
              arr[i][j]=sc.nextInt();
            }
         }
        
         int sum=0;
         for (int i=0;i<arr.length;i++)
           {
            for(int j:arr[i])
                {
                  sum=sum+j;
                 }
            } 
           System.out.println("Sum = "+sum);
    }
 }  