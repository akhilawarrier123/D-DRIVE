package PACK2;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
ArrayList<Integer> s= new ArrayList<Integer>();
s.add(45);
s.add(6);
s.add(3);
s.add(74);
s.add(0);
s.add(34);
s.add(54);
s.add(76);
s.add(1);
s.add(744);
for(int i=0;i<s.size();i++)
{
	if(s.get(i)%(i+1)==0)
	{
		System.out.println(s.get(i));
	}
}
	}

}
