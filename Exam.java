package project2;

import java.util.*;

class ExamPaper
{
	String subject;
	int count;
	char choice;
	Scanner sc=new Scanner(System.in);
	
	void questionPaper()
	{
		System.out.println("1) Identify the keyword among the following that makes a variable belong to a class,"
				+ "rather than being defined for each instance of the class. ");
		System.out.println("a) final  b)static  c)abstract  d)volatile");		//static
		choice=sc.next().charAt(0);
		if(choice=='b')
			count++;
		
		System.out.println("2)In which of the following is toString() method defined?");
		System.out.println("a)java.lang.Object  b)java.lang.String  c)java.lang.util  d)None");	//a
		choice=sc.next().charAt(0);
		if(choice=='a')
			count++;
		
		System.out.println("3)String str = \"abcde\";\r\n"
				+ "System.out.println(str.substring(1, 3));");
		System.out.println("a)abc	b)bc	c)bcd	d)cd");	//bc
		choice=sc.next().charAt(0);
		if(choice=='b')
			count++;
		
		System.out.println("4)Identify the return type of a method that does not return any value.");
		System.out.println("a)String	b)int	 c)double	 d)void");			//void
		choice=sc.next().charAt(0);
		if(choice=='d')
			count++;
		
		System.out.println("5)Where does the system stores parameters and local variables whenever"
				+ " a method is invoked?");
		System.out.println("a)Heap	 b)RAM	 c)Stack     d)Queue");		//stack
		choice=sc.next().charAt(0);
		if(choice=='c')
			count++;
		

		System.out.printf("You Scored %d marks in Your Exam...!!!",count*10);
		System.out.println();
		
	}
}


class Exam
{
	String userName="User123";
	String pass="Exam123";
	String name="Sarthak";
	Scanner scan=new Scanner(System.in);
	
	
	void Login()
	{
		System.out.println("**********************************************************");
		System.out.print("Enter Your Username No:- ");
		String temp=scan.next();
		
		System.out.print("Enter Your Password :-");
		String temp2=scan.next();
		System.out.println("**********************************************************");
		
		if(temp.equals(userName) && temp2.equals(pass))
		{
			System.out.println("\n\tWelCome to Nashik University's Exam..!!!");
			
		}
		else
		{
			System.out.println("You have Enter Wrong Sit No. or password");
			Login();
		}
	}
	
	void updateProfile()
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("\nWhat U want to Update : 1)UserName 2)Name 3)Pass ");
		int local= scan.nextInt();
		System.out.println("---------------------------------------------------------");
		
		if(local==1)
		{
			System.out.print("Enter the New User Name:-  ");
			userName=scan.next();
			System.out.println("\nNew Username updated successfully...!!!");
		}
		else if(local==2)
		{
			System.out.print("\nEnter the Updated Name:-  ");
			name=scan.next();
			System.out.println("New Name updated successfully...!!!");
		}
		else
		{
			System.out.print("Enter the new Password:-  ");
			name=scan.next();
			System.out.println("\nNew password updated successfully...!!!");
		}
	}
	
	
	public static void main(String args[]) throws InputMismatchException
	{
		int count;
		Scanner scan =new Scanner(System.in);
		Exam stud=new Exam();
		stud.Login();
		
		do{
			  int no=0;
			  System.out.println("1: Update Profile");
	          System.out.println("2: Start Exam");
	          System.out.println("3: Exit");
	          no = scan.nextInt();
	          
	          switch(no)
	          {
	              case 1:
	              {
               	 stud.updateProfile();
               	 break;
                }
	              
	              case 2:
	              {
              	  ExamPaper exam=new ExamPaper();
              	  exam.questionPaper();
              	  break;
                }
		                  
	              case 3:
                {
              	  System.out.println("!!!..Thanks for appearing in the Exam..!!!\n");
  	              System.exit(0);
                }
	          }
	      }
	      while(true);
		}
}
	