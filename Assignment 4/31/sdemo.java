
    class Student
      {
         int rno;
         String name;
  
    void setData(int roll_no,String sname)
     {
        rno = roll_no;
        name = sname;
      }
    void showData()
     {
       System.out.println("Roll number = "+rno);
       System.out.println("Student name = "+name);
     }
}
class sdemo{
  public static void main(String argc[])
   {
     Student s=new Student();
     s.setData(74,"Pratik Nimbalkar");
     s.showData();
   }
}