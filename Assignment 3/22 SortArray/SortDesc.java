import java.util.Scanner;
class SortDesc{
 public static void main(String argc[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a 10 number: ");
    int arr[]= new int[10];

     int x=0,max=0;

    for(int i=0;i<arr.length;i++)
    {
          arr [i]=sc.nextInt();
    }
   
    for( int j=0;j<arr.length;j++)
      {
          max=arr[j];

           for(int i=j;i<arr.length;i++)
             {
                if(arr[i]>max)
                  {
                      max=arr[i];
                  }
               }

                for(int i=j;i<arr.length;i++)
                  {
                     if(arr[i]==max)
                       {
                          arr[i]=arr[j];
                          arr[j]=max;
                       }
                   }
            }
 
             System.out.println("Sorted array in descending order: ");
                	for(int i:arr)
			{
				System.out.println(i);
			}
			
		}
	}

