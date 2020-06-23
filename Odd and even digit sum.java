import java.util.*;
class oe
{
	public static void main(String args[])
	{
	int a[]=new int[50];
	int i,j;
	int sum_even=0,sum_odd=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of an array:");
    j=s.nextInt();
	System.out.println("Enter your numbers:");
	for(i=0;i<j;i++)
	{
		a[i]=s.nextInt();
		if(a[i]%2==0)
		{
			sum_even=sum_even+a[i];
		}
		else
		{
			sum_odd=sum_odd+a[i];
		}
	}
	System.out.println("the sum of even numbers:"+sum_even);
	System.out.println("the sum of odd numbers:"+sum_odd);
}
}
	