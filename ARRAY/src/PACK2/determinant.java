package PACK2;

public class determinant {

	public static void main(String[] args) {
int[][] a= {{1,2,3}, {5,6,7}, {8,9,10}};

int i=0;
int j=0;
for (i = 0; i < a.length; i++) {
	for (j = 0; j < a.length; j++) {
		System.out.print(a[i][j] + " ");
		
	}
	System.out.println(" ");
}
int c= a[0][0]*((a[1][1]*a[2][2])-(a[1][2]*a[2][1]));
int m=a[0][1]*((a[1][0]*a[2][2]-(a[1][2]*a[2][0])));
int n=a[0][2]*((a[1][0]*a[2][1])-(a[1][1]*a[2][0]));
int x=(c+m-n);
	
System.out.println("the determinant of the given matrix is");
System.out.println(x);
}}