package PACK1;

public class MDarray 
{
public static void main(String[] args) 
	{
	
int [][]a= {{10,20},{30,40}};
for(int i=0;i<a.length;i++)
{
   for(int j=0;j<a.length;j++)
          {
	   if(i==j)
	   {
	System.out.print(a[i][j]+" ");
	   break;
          }
	   }
   System.out.println(" ");
	}

	}
	}
