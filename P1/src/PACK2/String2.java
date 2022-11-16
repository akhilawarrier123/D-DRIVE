package PACK2;

public class String2 
{
 static boolean besant(String x,String y)
 {
	 boolean x1=true;
	 String[] splitter=x.split("");
	 if(splitter[0].equals(y))
	 {
		 x1=true;
	 
	 }
	 else
	 {
		 x1=false;
	 }
 
  return x1;
 }

	public static void main(String[] args) 
	
	
	{
		String a= "vBC";
        String input="A";
        //besant(a,input);
        String2.besant(a,input);
        System.out.println(String2.besant(a,input));
	}

}
