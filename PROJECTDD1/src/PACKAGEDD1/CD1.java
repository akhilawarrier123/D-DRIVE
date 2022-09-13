package PACKAGEDD1;

public class CD1 {
	
//	static void xyzz()
//	{
//	String mn="ABC";
//	String op="ABC";
//	
//	System.out.println(mn.hashCode());
//    System.out.println(op.hashCode());
//	}
//	
	
	  void xyz()
		{
		String mn="ABC";
		String op="ABC";
		System.out.println(mn.hashCode());
	    System.out.println(op.hashCode());
		}
	public static void main(String[] args)
	{
	CD1 ab=new CD1();//non static invoke
	ab.xyz(); //static method invoking
	System.out.println(ab.hashCode());
	}

	}





	


