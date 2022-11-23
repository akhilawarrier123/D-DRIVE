package PACK1;

public class arguments2 {

	public static void main(String[] args) 
		
	{
		String []a=new String[args.length];
			//System.out.println(args[0]);
			//System.out.println(args[1]);
			//System.out.println(args[0]+args[1]);
		//	System.out.println("output"+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));// to add the integer value
			
			for(int i=0;i<args.length;i++)
			{
				a[i]=args[i];
			

			System.out.println(a[i]);
			}
	}
}

	//known as command line argument
//input giving in runtime phase
//feeding input is only string because it is String[]args

