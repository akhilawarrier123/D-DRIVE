package PACK2;

import java.util.ArrayList;

public class MMavg {

	public static void main(String[] args) {
ArrayList<Integer>a1=new ArrayList<Integer>();
a1.add(10);
a1.add(5);
a1.add(4);
a1.add(1);
a1.add(3);
int tem=0;
for(int i=0;i<a1.size();i++)
{
	for(int j=1;j<a1.size();j++)
	{
		if(a1.get(j-1)<a1.get(j))
		{
			tem=a1.get(j-1);
			a1.get(j-1)=a1.get(j);
			a1.get(j)=tem;
		}
				
	f

	}


