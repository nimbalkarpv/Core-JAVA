import java.util.Scanner; 
class Circle{
 float r;
 float a;

void init(float radius)
  {
   this.r=radius;
  }

void calculateArea() 

 {
   a=3.14f*r*r;
 }

void display()

 {
   System.out.println(a);
 }

}

class circleDemo{
  public static void main(String argc[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius");
        int r = sc.nextInt();
        
        Circle x= new Circle();
        x.init(5);
        x.calculateArea();
        x.display();
    }
}
         
        

    
 