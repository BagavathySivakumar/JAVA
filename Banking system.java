import java.util.*;
class bank
{   Scanner s=new Scanner(System.in);
	int accno_user1,accno_user2,amount;
	
	void getdetails()
	{
		System.out.println("Enter the account number of user-1:");
         accno_user1=s.nextInt();
		 System.out.println("Enter the account number of user-2:");
         accno_user2=s.nextInt();
		 System.out.println("Enter the amount to be transfered:");
         amount=s.nextInt();
	}
	void fundtransfer(String x,int y,String z)
	{
		int cy;
		System.out.println("Enter the current year:");
		cy=s.nextInt();
         if((x.length()==16)&&(y>cy)&&(z.length()==4))
         {
			 System.out.println("YOUR TRANSACTION IS SUCCESSFUL");
		 }
		 else
		 {
			 System.out.println("PLEASE ENTER THE CREDENTIALS CORRECTLY");
		 }
	}
	void fundtransfer(String a,String b)
	{
		String pinnumber;
		if(a.length()==16&&b.length()>2)
		{
			System.out.println("Enter your pin number:");
			pinnumber=s.next();
			System.out.println("YOUR TRANSACTION IS SUCCESSFUL");
		}
		else
		 {
			 System.out.println("PLEASE ENTER THE CREDENTIALS CORRECTLY");
		 }
	}
    void fundtransfer(String w,int t)
	{
       String pinnumber,sms;
	  
       if((w!="bags") && (t!=1999))
	   {
             System.out.println("PLEASE ENTER THE CREDENTIALS CORRECTLY");
	   }
	   else
		 {
			 System.out.println("Enter your pin number:");
             pinnumber=s.next();
        	 System.out.println("Enter a sms code:");
             sms=s.next();
             if(pinnumber.length()==4&&sms.length()==4)
			 {
                System.out.println("YOUR TRANSACTION IS SUCCESSFUL");
			 }
             else
             {
				 System.out.println("ENTER YOUR PINNUMBER AND SMS CODE CORRECTLY");
             }
			 
		 }
       	   
	}     			 
	public static void main(String args[])
	{Scanner s=new Scanner(System.in);
		bank b=new bank();
		b.getdetails();
		int ch;
	String cc,pinno,dc,hn,un;
	int pw,vy;
	System.out.println("Enter your choice of money transfer:\n1.credit card\n2.debit card\n3.net banking");
	ch=s.nextInt();
	switch(ch)
	{
		case 1:
		System.out.println("............Enter your credit card credentials..........");
		System.out.println("Enter your credit card number:");
		cc=s.next();
		System.out.println("Enter your validity year:");
		vy=s.nextInt();
		System.out.println("Enter your pin number:");
		pinno=s.next();
		b.fundtransfer(cc,vy,pinno);
		break;
		case 2:
		System.out.println("............Enter your debit card credentials..........");
		System.out.println("Enter your debit card number:");
		dc=s.next();
		System.out.println("Enter your holdername:");
		hn=s.next();
		b.fundtransfer( dc, hn);
		break;
		case 3:
		System.out.println("............Enter your net banking credentials..........");
		System.out.println("Enter your user name:");
		un=s.next();
		System.out.println("Enter your password:");
		pw=s.nextInt();
		b.fundtransfer( un, pw);
		break;
		default:
		System.out.println("..........Enter the correct choice..........");
		break;
	}
	}
	}
	
		
	