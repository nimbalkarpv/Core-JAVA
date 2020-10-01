import java.util.Scanner;
class MathOperation{
  void multiply(int a,int b)
   {
     int c=a*b;
     System.out.println("Multiplication of two integer  number="+c); 
    }

 void multiply(float d,float e, float f)
    {
    float g=d*e*f;
     System.out.println("Multiplication of three float number="+g);
    }

   void multiply(int [] arr)
   {
        int z=1;
      for(int x=0; x<arr.length;x++)
         {
            z=z*arr[x];
          }
            
     System.out.println("Multiplication of Array number="+z);
   }

  void multiply(double h,int i)
   {
     double j=h*i;
     System.out.println("Multiplication double and integer="+j);
    }

}
 
class MathOperationDemo{
     public  static void main(String args[]) 
      {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a two integer");
         int a=sc.nextInt();
         int b=sc.nextInt();

         MathOperation m1 = new MathOperation();
         m1.multiply(a,b); 

         System.out.println("Enter a three float number");
         float d = sc.nextFloat();
         float e= sc.nextFloat();
         float f= sc.nextFloat();
         m1.multiply(d,e,f);

         
         System.out.println("Enter a one float and one int number");
         double h = sc.nextDouble();
         int i= sc.nextInt();
         m1.multiply(h,i);

        int arr[]=new int[5];
        System.out.println("Enter a 5 integer");
         for(int x=0; x<arr.length;x++)
          {
              arr[x]=sc.nextInt();
           } 
           m1.multiply(arr);
      }    
}
  