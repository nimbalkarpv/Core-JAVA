import java.util.*;
class SearchArray{
   public static void main(String argc[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a seven number:");
       int arr[]= new int[7];
       int flag=0;
       
       for(int i = 0; i<arr.length; i++)
        {
           arr[i]=sc.nextInt();
        }
   
        System.out.println("Enter as you want to matching pair");

        int num = sc.nextInt();
        for(int j=0; j<arr.length; j++)
         {
           if(arr[j]==num)
            {
              
               System.out.println("element match at the Index number"+j);
               flag++;
            }
          }
         if(flag==0)
         { 
          System.out.println("element not found");
         }
   }
}   
        