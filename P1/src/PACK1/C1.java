package PACK1;

public class C1 
{
	
	
	static int a=10;
	static int b=20;
	
	
	static void addition()
	
	{
	int c= a+b;	
		System.out.println(c);
	}	

	static void subtraction()
 {
	int d= a-b;
	System.out.println(d);
	
 }
	static void multiplication()
	
{
		int e=a*b;
		System.out.println(e);
 }
static void division()
{
	int f=a/b;
	System.out.println(f);
}
static void reminder()
{
int g=a%b;
System.out.println(g);
}
public static void main(String[] args) 
{
	
	
	C1.addition();
	C1.subtraction();
	C1.multiplication();
	C1.division();
	C1.reminder();
}
}
