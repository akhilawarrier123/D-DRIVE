package PACK1;

public class diagonalsum {

	public static void main(String[] args) {
		Integer a1[][]={ { 10, 20, 30 }, { 10, 20, 11 }, { 5, 6, 7 } };
	      //Integer c1[][]=new Integer[3][3];
int sum=0;
for (int i = 0; i < a1.length; i++) {
	for (int j = 0; j < a1.length; j++) {
		System.out.print(a1[i][j] + " ");
		
	}
	System.out.println(" ");
}
	      
for(int i = 0;i<a1.length;i++){
	         for(int j = 0;j<a1.length;j++){
	            if(i==j)
	            {  
	            	sum=sum+a1[i][j];
	         }
	         
	      }
	         
	      }
System.out.println(sum);
	}}
	
	

	