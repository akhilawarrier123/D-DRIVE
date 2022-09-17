package PACK1;

public class C2 {
	int a=20;
	int b=30;
	void addition()
	{
		int c=a+b;
		System.out.println(c);
	}
	void multipication()
	{
		int k=a*b;
		System.out.println(k);

	}
void subtraction()
{
	int i=b-a;
	System.out.println(i);
}
void division()
{
	int l=b/a;
	System.out.println(l);
}
void reminder()
{
	int z=b%a;
System.out.println(z);
}
	

	
public static void main(String[] args) 

{
	C2 x=new C2();
	x.addition();
	x.multipication();
	x.subtraction();
	x.division();
	x.reminder();
}
	}
	