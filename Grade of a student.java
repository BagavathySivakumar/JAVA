import java.util.*;
class grade
{
public static void main(String[] args)
{
    int a,b,c,x,d;
Scanner in = new Scanner(System.in);
System.out.print( "enter the 3 subject marks");
 a=in.nextInt();
 b=in.nextInt();
 c=in.nextInt();
 x=a+b+c;
d=x/3;
System.out.println( "AVERAGE:"+d);

if(d>=90&&d<=100)
{
System.out.println( "Grade:A");
}
else if(d>=80&&d<=89)
{
System.out.println( "Grade:B");
}
else if(d>=70&&d<=79)
{
System.out.println( "Grade:C");
}
else if(d>=60&&d<=69)
{
System.out.println( "Grade:D");
}
else
{
System.out.println("Grade:F");
}

}
}