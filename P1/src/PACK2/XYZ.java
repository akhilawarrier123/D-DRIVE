package PACK2;

public class XYZ 
{
int getcount(String a,int x)
{
	String[]b= {};

	//String []b=null;(we get exception as the result because it is not a string hence cannot concantinate)
	if(a!=null)
	{
		b=a.split("");
	}
	return b.length+x;
	}

	
	public static void main(String[] args) 
	{
XYZ c2=new XYZ();
int k=c2.getcount("null",5);//if it is given"" instead null we get value 6
System.out.println(k);
	}

}
