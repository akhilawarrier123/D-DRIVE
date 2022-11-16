package PACK2;

public class xy 
{
String getvalue(String a)
{
	String x1=null;
	String y="welcome";
	String[] y1=y.split(a);
	//for(int i=0;i<y1.length;i++)
	for(int i=y1.length-1;i>=0;i--)
	{
		//if(i==2)
		//{
			//x1=y1[i];
			//break;
			
		//}
		System.out.print(y1[i]);
	}
	
	return x1;
	
	
}

	public static void main(String[] args) 
	{
xy c1=new xy();
String a= c1.getvalue("");
//System.out.println(a);
	}

}
