import java.util.Scanner;
class btnallprimeno{
  public static void main(String argc[])
    {
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter a lower value: ");
       int lownum = sc.nextInt();

       System.out.println("Enter a uppervalue ");
       int uppnum = sc.nextInt();
       
       while(lownum < uppnum)
        {
           boolean flag=false;

           for(int i=2;i<=lownum/2;i++)
            {
                if(lownum % i == 0)
                    {
                      flag=true;
                       break;
                     }
            }
               if(!flag && lownum!=0 && lownum!=1)
			System.out.println(lownum+" ");
            ++lownum;		
		}
		
	}
}  
         