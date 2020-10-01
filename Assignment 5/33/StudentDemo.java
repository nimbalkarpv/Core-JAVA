                                   import java.util.Scanner;
                                       class Student

				        {
					int roll;
					String name;
					
					void setData(int roll, String name)
					{
						this.roll=roll;
						this.name=name;
					}
					
					void showData()
					{
						System.out.println("Name: "+name);
						System.out.println("Roll no: "+roll);
					}
				}

				class StudentDemo
				{
					
					public static void main(String[] args)
					{
                                          Scanner sc = new Scanner(System.in);
                                          System.out.println("Enter a roll number = ");
                                          int roll = sc.nextInt();
                                          System.out.println("Enter a Name = ");
                                          String name=sc.next();
                                          System.out.println("Roll number = "+roll+"Name = "+name);
				         }
                                }