package PACK1;

public class addmatrix {

	public static void main(String[] args) {
		Integer a1[][]={ { 10, 20, 30 }, { 10, 20, 11 }, { 5, 6, 7 } };
	      Integer b1[][]={ { 5, 5, 5 }, { 1, 1, 1 }, { 2, 2, 2 } };
	      Integer c1[][]=new Integer[3][3];

	      for(int i = 0;i<3;i++){
	         for(int j = 0;j<3;j++){
	            c1[i][j] = a1[i][j]+b1[i][j];
	            System.out.print(c1[i][j]+" ");
	         }
	         System.out.println();
	      }
	   }
	
	}


