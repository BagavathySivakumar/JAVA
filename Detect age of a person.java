import java.util.*;
class age
{
	int cd,cm,cy,dd,dm,dy;
	Scanner s=new Scanner(System.in);
	void get_details()
	{
		System.out.println("Enter the current date:");
		cd=s.nextInt();
		System.out.println("Enter the current month:");
		cm=s.nextInt();
		System.out.println("Enter the current year:");
		cy=s.nextInt();
		System.out.println("Enter the birth date:");
		dd=s.nextInt();
		System.out.println("Enter the birth month:");
		dm=s.nextInt();
		System.out.println("Enter the birth year:");
		dy=s.nextInt();
	}
	void calculate()
	{
		int x,y,z;
		x=cy-dy;
		y=cm-dm;
		z=cd-dd;
		if(y<0&&z<0)
		{
			y=y+12;
			x=x-1;
			y=y-1;
			z=z+30;
			System.out.println("your age is: "+x+"years "+y+"month "+z+"days");
		}
			
		else if(y<0)
		{
			y=y+12;
			x=x-1;
			System.out.println("your age is: "+x+" years"+y+" month "+z+" days ");
		}
		else if(z<0)
		{
			y=y-1;
			z=z+30;
			System.out.println("your age is: "+x+" years"+y+" month "+z+" days ");
		}
		else
		{
			System.out.println("your age is: "+x+" years "+y+" month "+z+" days ");
		}
	}
	public static void main(String args[])
	{
		age a=new age();
		a.get_details();
		a.calculate();
	}
}