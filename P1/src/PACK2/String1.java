package PACK2;

public class String1 
{
	static int CountOfLetter(String z)
	{
	int count=0;
	if (z!=null)
	{
		String[] ab=z.split("");
	for(int i=0;i<ab.length;i++)
	{
		if(ab[i].equals("v"))
{
		count++;
}

}

	}
	return count;
	}
	

public static void main(String[] args)
	{
String input="vikramvedha";
int x=String1.CountOfLetter(input);
System.out.println(x);
	}

}
