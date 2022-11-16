package PACK2;

public class LETTER 
{

	 static String check(String x, String a)
	{
		 int countf=0; 
		int countb=0;
		String p=null;
		
		
		String[]ax=x.split("");
		for(int i=0;i<ax.length;i++)
		{
			if(ax[i].equals(a))
					
					{
				countf=i;
				break;
				}

		}
		System.out.println(countf);
		
	for(int j=ax.length-1;j>=0;j--)
		{
	p=ax[j];
			}
		System.out.println(p);
		String[]r=p.split("");
		for(int k=0;k<r.length;k++)
		{
		if(a.equals(r[k]))
		{
			countb=k;
			break;
		}
		}
		
		//System.out.println(m);
		System.out.println(countb);
		String X1=null;
		int y=countf+countb;
		System.out.println(y);
		if(y%2==0)
		{
			X1="even";
		}
		
		else
			{
			X1="odd";
			}
		
			return X1;
			}	
	
	 public static void main(String[] args) 
	 {
		 String n=LETTER.check("PRESTIGE","P");
		 System.out.println("This is a" +  n  +  "number");
		 	}


	}


