package PACK1;

import java.util.ArrayList;

public class Retail {
	//driver class means main method

	public static void main(String[] args) {
		Product P1= new Product();
	P1.setName("colgate");
	P1.setPrice(20);
		Product P2=new Product();
		P2.setName("close up");
		P2.setPrice(35);
		ArrayList<Product> a1 = new ArrayList<Product>();// product here is generics, whatever inside<>
		a1.add(P1);
		a1.add(P2);
		

for(Product A:a1)
{
	System.out.println(A);
	}


}
}


