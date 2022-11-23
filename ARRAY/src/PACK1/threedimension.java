package PACK1;

public class threedimension {

	public static void main(String[] args) {
		
		Integer[][] a1 = { { 10, 20, 30 }, { 10, 20, 11 }, { 5, 6, 7 } };
		Integer[][] b1 = { { 5, 5, 5 }, { 1, 1, 1 }, { 2, 2, 2 } };
		Integer[][]c1=new Integer[3][3];
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				System.out.print(a1[i][j] + " ");
				
			}
			System.out.println(" ");
		}
//second array
		System.out.println(" The second array");
		for (int i = 0; i < b1.length; i++) {
			for (int j= 0; j< b1.length; j++) {
				System.out.print(b1[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("The sum of the given two array is");
		
	for(int i=0;i<c1.length;i++) {
	for(int j=0;j<c1.length;j++) {
	c1[i][j]=a1[i][j]+b1[i][j];
	System.out.print(c1[i][j] + " ");
	
			}
	System.out.println( " ");
	
	}
}
}