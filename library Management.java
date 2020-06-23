import java.util.*;
interface magazines
{
	void issue_magazine();
	void return_magazine();
}
interface journals
{
	void issue_journals();
	void return_journals();
}
class book 
{
	int bookid[]=new int[5];
	String bookname[]=new String[5];
	int no_of_copies[]=new int[5];
	String name;
	int s_id;
	Scanner s=new Scanner(System.in);
	void getdetails()
	{
		System.out.println("enter your name:");
		name=s.next();
		System.out.println("enter your id:");
		s_id=s.nextInt();
	System.out.println("enter ur book id's:");
	for(int i=0;i<5;i++)
	{
		bookid[i]=s.nextInt();
	}
	System.out.println("enter ur book names:");
	for(int i=0;i<5;i++)
	{
		bookname[i]=s.next();
	}
	System.out.println("enter number of book copies:");
	for(int i=0;i<5;i++)
	{
		no_of_copies[i]=s.nextInt();
	}
	}
void searchbook(int bid)
	{
		for(int i=0;i<5;i++)
		{
			if(bookid[i]==bid)
			{
				System.out.println("book found");
				break;
			}
			else
			{
				System.out.println("book not found");
			}
		}
	}
void issuebook(int bid )
	{
		for(int i=0;i<5;i++)
		{
			if(bookid[i]==bid)
			{
				if(no_of_copies[i]>=1)
			    {
				 System.out.println("book issued");
				 break;
				}
				else
				{
				System.out.println("out of copies");
				}
			}
			else
			{
				System.out.println("the book is not in our library");
			}
		}
	}
	void returnbook( String bn)
	{
		System.out.println("book is returned");
	}
	void renewbook(String bn)
	{
		System.out.println("book is renewed");
	}
	void finemoney(int cdate,int rdate)
	{
		if(cdate>rdate)
		{
			int p;
			p=cdate-rdate;
			System.out.println("your fine amount is:"+p);
		}
		else if(cdate<rdate)
		{
			System.out.println("no fine money");
		}
		else 
		{
			System.out.println("no fine money");
		}		
    }
		
}
class library extends book implements magazines,journals
{
	Scanner s=new Scanner(System.in);
	public void issue_magazine()
	{
		String mag;
		System.out.println("enter your magazine:");
		mag=s.next();
		System.out.println("your magazine has been issued");
	}
	public void return_magazine()
	{
		String mag;
		System.out.println("enter your magazine:");
		mag=s.next();
		System.out.println("your magazine has been returned");
	}
	public void issue_journals()
	{
		String jrl;
		System.out.println("enter your journal:");
		jrl=s.next();
		System.out.println("your journal has been issued");
	}
	public void return_journals()
	{
		String jrl;
		System.out.println("enter your journal:");
		jrl=s.next();
		System.out.println("your journal has been returned");
	}
    public static void main(String args[])
{
		int ch,bid,cdate,rdate;
		String bn;
		Scanner s=new Scanner(System.in);
		library l=new library();
		do
	{
		System.out.println("enter your choice:\n1.searchbook\n 2.issuebook \n3.return book\n4.renew book\n 5.issue journals\n6.issue magazine\n7.return journals\n8.return magazine");
		ch=s.nextInt();
		l.getdetails();
		switch(ch)
		{
			case 1:
			System.out.println("enter your book id:");
			bid=s.nextInt();
			l.searchbook(bid);
			break;
			case 2:
			System.out.println("enter your book id:");
			bid=s.nextInt();
			l.issuebook(bid);
			break;
			case 3:
			System.out.println("enter current date:");
			cdate=s.nextInt();
			System.out.println("enter return date:");
			rdate=s.nextInt();
			l.finemoney(cdate,rdate);
			System.out.println("enter the book name:");
			bn=s.next();
			l.returnbook(bn);
			break;
			case 4:
			System.out.println("enter current date:");
			cdate=s.nextInt();
			System.out.println("enter renew date:");;
			rdate=s.nextInt();
			l.finemoney(cdate,rdate);
			System.out.println("enter the book name:");
			bn=s.next();
			l.renewbook(bn);
			break;
			case 5:
			l.issue_journals();
			break;
			case 6:
			l.issue_magazine();
			break;
			case 7:
			l.return_journals();
			break;
			case 8:
			l.return_magazine();
			break;
			default:
			System.out.println("enter the correct choice");
			break;
		}	
    }while(ch<=8);
}
}