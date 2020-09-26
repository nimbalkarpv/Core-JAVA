import java.util.Scanner;

class MaxAndMinNum{
   public static void main(String argc[])
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number which you want in array");
          int n=sc.nextInt();
          int arr[]=new int[n];
          
          System.out.println("Enter a number");
          
          for(int i=0; i<arr.length; i++)
           {
             arr[i]=sc.nextInt();
           }

          int max=0;
          int min=0;

           for(int i=0; i<arr.length; i++)
            { 
               for (int j=i+1;j<arr.length;j++)
                 {
                   if(arr[i]>arr[j])
                      { 
                       int temp=arr[i];
                         arr[i]=arr[j];
                         arr[j]=temp;
                      }
                  }
             
            }
               min=arr[0];
              System.out.println("min="+min);
              max= arr[n-1];
               System.out.println("mix="+max);

          
           
      }
}     
              
                 