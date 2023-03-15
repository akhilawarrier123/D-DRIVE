package PACK1;

public class C4 
{
		int addition(int a,int b)
		{
			int c=a+b;
			System.out.println(c);
			return c;
		}
		int multipication(int a,int b)
		{
			int k=a*b;
			System.out.println(k);
			return k;

		}
	int subtraction(int b,int a)
	{
		int i=b-a;
		System.out.println(i);
		return i;
	}
	int division(int b,int a)
	{
		int l=b/a;
		System.out.println(l);
		return l;
	}
	int reminder(int b, int a)
	{
		int z=b%a;
	System.out.println(z);
	return z;
	}
		

		
	public static void main(String[] args) 

	{
		C4 x=new C4();
		int a1=x.addition(20,10);
		int b1=x.multipication(20,10);
		int e1=x.subtraction(20,10);
		int k1=x.division(20,10);
		int d1=x.reminder(20,10);
		System.out.println(a1+b1+e1+k1+d1);
	}
	
		
		

		
			

		}



	
	

	


