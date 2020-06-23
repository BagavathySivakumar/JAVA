import java .util.*;
class customer
{
	Scanner s=new Scanner(System.in);
	int id;
	String name,gender;
	 
	 void getcustomerinfo()
	 {
		 System.out.println("Enter the customer id:");
		 id=s.nextInt();
		 System.out.println("Enter the customer name:");
		 name=s.next();
		 System.out.println("Enter the customer gender:");
		 gender=s.next();
	 }
	 void printcustomerinfo()
	 {
		 System.out.println("your customer id is:"+id);
		 System.out.println("your customer name is:"+name);
		 System.out.println("your customer gender is:"+gender);
	 }
}
class account extends customer
{
	int accno,balance;
	void getaccountdetails()
	{
		System.out.println("Enter your account number:");
		accno=s.nextInt();
		System.out.println("enter your balance:");
		balance=s.nextInt();
	}
	void deposit(int x)
	{
		balance=balance+x;
		System.out.println("your deposited amount plus balance is:"+balance);
	}
	void withdraw(int y)
	{
		if(y<=balance)
		{
			balance=balance-y;
			System.out.println("your balance amount is:"+balance);
		}
		else
		{
			System.out.println("your balance is not sufficient");
		}
	}
	int checkbalance()
	{
		 return balance;
	}
	public static void main(String args[])
	{
		account c=new account();
		 Scanner s=new Scanner(System.in);
	     int dep;
		 int with;
		 c.getcustomerinfo();
		 c.printcustomerinfo();
		 c.getaccountdetails();
		 
		int ch;
		boolean exit=false;
		
		while(!exit)
		{
			System.out.println("Enter your choice \n1.deposit\n2.withdraw\n3.check balance\n4.exit");
            ch=s.nextInt();			
         switch(ch)	
		 {
            case 1:
                   	System.out.println("enter your deposit amount:");
                    dep=s.nextInt();
                    c.deposit(dep);
             break;
            case 2:
                    System.out.println("enter your withdrawal amount:");
                      with=s.nextInt();
					  c.withdraw(with);
					  break;
		    case 3:
			      
				  int r=0;
				  r=c.checkbalance();
				    System.out.println("your balance is:"+r);
						break;
			case 4:
						exit=true;
						break;
			default:
						System.out.println("enter the correct choice");
						break;
		 }
	    }
	}
}
