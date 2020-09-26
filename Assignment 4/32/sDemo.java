class student
 {
   int rno;
   String name;
   static int total_student;
 
 void setData(int roll_no,String sname)
  {
    rno=roll_no;
    name=sname;
    total_student++;
  }
 
 void showData()
 {
  //System.out.println("Roll Number = "+rno);
  //System.out.println("Student name = "+name);
  System.out.println("Total number of student = "+total_student);
 }
}

class sDemo{
 public static void main(String argc[])
   {
     student s= new student();
     s.setData(74,"Pratik Nimbalkar");
    // s.showData();
     s.setData(74,"rahul");
     s.setData(74,"shubham");
      s.setData(74,"jayant");
     s.setData(74,"vivek");
     s.showData();
  }
}
    
     
