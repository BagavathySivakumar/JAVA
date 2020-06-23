import java.io.*;
import java.util.*;
class BankException extends Exception
{
	int id;
	String status;
	BankException(int m)
	{
		id=m;
	    switch(m)
		{
			case 1:
			status="Minimum balance have to be above 1000";
			break;
			case 2:
			status="Withdrawal amount exceeds balance amount";
			break;
			case 3:
			status="total transaction count is upto 3";
			break;
			case 4:
			status="permitted amount for total transaction for a day is one lakh";
		    break;
			default:
			status="None";
			break;

		}
	}
	public String toString()
	{
		return "Bank exception- "+status;
	}
}

class atm
{
	static int card_no,bal,i,wd,count=1,b=0,deposit;
	static String card_name;
	static void compute()throws BankException
	{
		System.out.println("Your balance="+bal);
		if(bal<1000)
		{
			
			throw new BankException(1);
		}
		else
		{
			System.out.println(" proceed your  transaction with your balance amount="+bal);
			
		}
	}
	static void comp(int with_draw)throws BankException
	{
		
		if(with_draw>bal)
		{
			
			throw new BankException(2);
		}
		else
		{
			
			System.out.println("The amount="+with_draw+" had been successfully withdrawed \n your balance amount="+(bal-with_draw));
			
			
		
		bal=bal-with_draw;
		b=b+bal;
		System.out.println("Total Transaction amount="+b);
			onetrans(b);
		}
	}
	static void com(int tcount)throws BankException
	{
		System.out.println("Transaction no."+tcount);
		if(tcount>3)
		{
			
			throw new BankException(3);
		}
		else
		{
			System.out.println("Proceed your transaction");
			
		}
	}
	static void deposit(int dp)throws BankException
	{
		
		bal=bal+dp;
		System.out.println("Your balance amount:"+bal);
		b=b+bal;
		System.out.println("Total Transaction amount="+b);
			onetrans(b);
		
	}
	static void onetrans(int b)throws BankException
	{
		
		
		if(b>100000)
		{
			throw new BankException(4);
		}
		else
		{
			System.out.println("Next Transaction");
		}
	}
	public static void main(String args[])
	{
		int ch,c;
		Scanner sc=new Scanner(System.in);
		
		try
		{
		System.out.println("Enter the card number  ");
		card_no=sc.nextInt();
		System.out.println("Enter card holder name: ");
		card_name=sc.next();
		System.out.println("Enter your balance amount:");
		bal=sc.nextInt();
		compute();
		b=b+bal;
		System.out.println("Total Transaction amount="+b);
		onetrans(b);
		do{
		System.out.println("Enter your choice:\n1.Deposit\n2.Withdrawal");
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
			com(count);
			System.out.println("Enter your deposit amount:");
			deposit=sc.nextInt();
			deposit(deposit);
			
			break;
			case 2:
			com(count);
		    System.out.println("Enter your withdrawal amount");
		    wd=sc.nextInt();
		    comp(wd);
			onetrans(b);
			break;
		}
		System.out.println("If you want to continue your transaction then press 1...");
		c=sc.nextInt();
		count++;
		}
		while(c==1);
		}
		catch(BankException e)
		{
			System.out.println("Caught:"+e);
		}
		
	}
}

		
		
		

	