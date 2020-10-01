import java.util.Scanner;

class Person
 {
   int age;
   String name;
 
   Person()
  {
      age=18;
   }

  void setdata(int age,String name)
   {
     this.age=age;
     this.name=name;
   }
  
  void show()
  {
    System.out.println("Age= "+age);
    System.out.println("Name= "+name);
  }
 }
 
class PersonDemo
  {
    public static void main(String[] argc)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter age :");
       int age=sc.nextInt();
 
     System.out.println("Enter name :");
     String name=sc.next();
     Person p=new Person();
     p.setdata(age,name);
     p.show();
     
    }
}
     