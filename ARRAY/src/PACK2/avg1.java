package PACK2;
                           //QN ) {kevin, english,50} {thomas,history,98} {kevin,maths,50}. Find the avg of kevin and thomas seperately

public class avg1 {                                                                              //MY EXERSISE

	public static void main(String[] args) 
	{
String[][] a= {{"Kevin", "English", "50"},{"Thomas", "History", "98"},{"Kevin", "Maths", "50"}};
int count=0;
int sum=0;
int i=0;
int j=0;
int c=0;
for (i=0;i<a.length;i++)
{for(j=0;j<a.length;j++)
	{if(i!=1&&j==2)
		{count++;
sum=sum+Integer.parseInt(a[i][j])	;	
}

	}}
System.out.print("The average marks obtained by kevin is"+" ");
System.out.println(sum/count);
System.out.println(" ");
for (i=0;i<a.length;i++)
{for(j=0;j<a.length;j++)
{
 if(i==1&&j==2)
		{
			c=Integer.parseInt(a[i][j]);
			
		}
}}
System.out.print("The average marks obtained by Thomas is ");
System.out.print(c);
	}
	}
		