import java.util.Scanner;
  class  SumArrayElement{
  public static void main(String argc[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how much element want in array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter a number");
        for(int i=0; i<arr.length; i++)
         {
           arr[i]=sc.nextInt();
         }
          
         int k=0;
         int a=0;
         for(int i=0; i<arr.length; i++)
         {
           int j= arr[i];
           if (j%2==0)
             {
                k=k+arr[i];
             }
  
             else
             {
               a=a+arr[i];
              }
           }
            System.out.println("Sum of even number= "+k);
             System.out.println("Sum of odd number= "+a);
          }
}      