package PACK2;

import java.util.ArrayList;

public class arraylist2 {

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
		int sum=0;
		for(int i=0;i<s.size();i++)
		{
		sum=sum+s.get(i)+2;
			
		}
		System.out.println(sum);
		}
			}

	
