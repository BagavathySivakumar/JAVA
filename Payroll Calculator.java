import java.util.*;
import java.io.*;
class person
{
	String name;
	String stname,city;
	int age,yr_of_join,na_in_no;
	Scanner s=new Scanner(System.in);
	 person()
	{
		System.out.println("Enter your Name:");
		name=s.next();
		System.out.println("Enter your Street name:");
		stname=s.next();
		System.out.println("Enter your city:");
		city=s.next();
		System.out.println("Enter your age:");
		age=s.nextInt();
		System.out.println("Enter your year of joining:");
		yr_of_join=s.nextInt();
		System.out.println("Enter your National insurance number:");
		na_in_no=s.nextInt();
	}
}
class employee extends person
{
	
		double basic_pay,grade_pay,dearness_allowrance,provident_fund,gross_sal,net_pay,annual_sal;
	 
		employee()
		{
			super();
		}
		void pay()
		{
			System.out.println("Enter your basic pay:");
			basic_pay=s.nextDouble();
			System.out.println("Enter your grade pay:");
			grade_pay=s.nextDouble();
		}
		void dr_al(double d)
		{
			dearness_allowrance=(basic_pay+grade_pay)*d;
		}
		void pro_fund(double p)
		{
			provident_fund=(basic_pay+grade_pay+dearness_allowrance)*p;
		}
		void calc(int hra)
		{
			gross_sal=basic_pay+grade_pay+dearness_allowrance+hra;
			net_pay=gross_sal-provident_fund;
			annual_sal=12*net_pay;
		}
		void show()
		{
			System.out.println("name of the street is:"+stname);
			System.out.println("your national insurance number is:"+na_in_no);
			System.out.println("year of joining is:"+yr_of_join);
			System.out.println("name of the city is:"+city);
			System.out.println("dearness allowrance is:"+dearness_allowrance);
			System.out.println("provident fund is:"+provident_fund);
			System.out.println("gross_sal is:"+gross_sal);
			System.out.println("net_pay is:"+net_pay);
			System.out.println("your annual_salary is:"+annual_sal);
			
		}
		void display() throws FileNotFoundException
        {
    	    	  try
				  {
                  	 File f = new File("F:\fifth sem\iwt lab\ex4\Output.txt");
    			     FileOutputStream fos = new FileOutputStream(f);
    			     PrintWriter pw = new PrintWriter(fos);
    	             System.out.println("Name Is "+name);
    	             System.out.println("Age Is "+age);
			         System.out.println("name of the street is:"+stname);
			         System.out.println("your national insurance number is:"+na_in_no);
			         System.out.println("year of joining is:"+yr_of_join);
			         System.out.println("name of the city is:"+city);
			         System.out.println("dearness allowrance is:"+dearness_allowrance);
			         System.out.println("provident fund is:"+provident_fund);
			         System.out.println("gross_sal is:"+gross_sal);
			         System.out.println("net_pay is:"+net_pay);
			         System.out.println("your annual_salary is:"+annual_sal);

    	             pw.write("Name:"+name);
    	             pw.println();
    	             pw.write("Age: "+age);
    	             pw.println();
    	             pw.println();
    	             pw.flush();
		             fos.close();
		              pw.close();
	            }
				   catch(FileNotFoundException e )
				   {
	                 System.out.println(e);
	               }
				      catch(IOException e1)
					  {
	                   System.out.println(e1);
	                  }
		}
	  
	
	public static void main(String a[])
	{
		int ch;
		Scanner s=new Scanner(System.in);
		
		employee e=new employee();
		do
		{
			System.out.println("Enter your choice:\n1.Assistant professor\n 2.Assistant professor\n 3.Associate professor \n 4.Associate professor(SG) \n 5.Professor");
		ch=s.nextInt();
			switch(ch)
			{
				case 1:
				//dearness_allowrance=0.35;
				//provident_fund=0.10;
				
				e.pay();
				e.dr_al(0.35);
				e.pro_fund(0.10);
				e.calc(1000);
				e.show();
				break;
				case 2:
				//dearness_allowrance=0.39;
				//provident_fund=0.14;
				
				e.pay();
				e.dr_al(0.39);
				e.pro_fund(0.14);
				e.calc(1500);
				e.show();
				break;
				case 3:
				//dearness_allowrance=0.43;
				//provident_fund=0.16;
				
				e.pay();
				e.dr_al(0.43);
				e.pro_fund(0.16);
				e.calc(2000);
				e.show();
				break;
				case 4:
				//dearness_allowrance=0.47;
				//provident_fund=0.21;
				
				e.pay();
				e.dr_al(0.47);
				e.pro_fund(0.21);
				e.calc(2500);
				e.show();
				break;
				case 5:
				//dearness_allowrance=0.50;
				//provident_fund=0.24;
				
				e.pay();
				e.dr_al(0.50);
				e.pro_fund(0.24);
				e.calc(3000);
				e.show();
				break;
				default:
				System.out.println("Enter the correct choice");
				break;
			}
		}while(ch<=5);
	}
}
			
		
			
		
		