package PACK2;

public class String4 

{

	public static void main(String[] args) 
	{
	String a="WELCOME";
	String b= "C";
	String d= "K";
	String m=null;
	String[]z=a.split("");

	for(int i=0;i<z.length;i++)
	{
		if(b.equals(z[i]))
		{
			m=z[i];
			z[i]=d;
		}
		System.out.print(z[i])	;			
	}
	
	

	}

}
