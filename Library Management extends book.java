class book 
{
	int bookid[]=new int[5];
	String bookname[]=new String[5];
	int no_of_copies[]=new int[5];
	String name;
	int s_id;
	void getdetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name:"+name);
		name=s.next();
		System.out.println("enter your id:"+s_id);
		s_id=s.nextInt();
	}
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
	String searchbook(String bname)
	{
		
		
}