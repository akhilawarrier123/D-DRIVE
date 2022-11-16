package PACK1;

public class dupicate1 {

	public static void main(String[] args)
	{
		{
			int[] a= {10,20,60,50,10,30,80,70};
			int n=0;
			for(int i=0;i<a.length;i++)
			{
			for(int j=1;j<a.length;j++)
			{
				if(a[j]<a[j-1])
				{
					n=a[j];
					a[j]=a[j-1];
					a[j-1]=n;
				}
			}
				}

	}

}
