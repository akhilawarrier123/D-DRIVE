package PACK2;

public class String3
{
/*public  String xyz(String c, int x)
{
	String[]abc=c.split("");
	String a=abc[x];
	return a;
}
	
public static void main(String[] args) 
	{
String abc="Bosnia";
String3 vb=new String3();
//vb.xyz(abc,3);
System.out.println(vb.xyz(abc,2));
	}

}*/
	public static String xyz(String c, int x)
	{
		String[]abc=c.split("");
		String a=abc[x];
		return a;
	}
		
	public static void main(String[] args) 
		{
	String abc="Bosnia";
	//String3 vb=new String3();
	String3.xyz(abc,3);
	System.out.println(String3.xyz(abc,3));
		}

	}
