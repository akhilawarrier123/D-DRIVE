package PACK1;

public class Duplicate {

	public static void main(String[] args) {
		int[] a = { 10, 10, 10, 20, 60, 50, 10, 30, 80, 70 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j] < a[j - 1]) {
					temp= a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
	
		
		int[] b = new int[10];

		for (int k = 0; k < a.length; k++) {
			
			if(k<a.length-1)
			{
				if ((a[k] != a[k + 1])) {
					b[k] = a[k];
				
				}	
				
			}else if (k==9){
				b[k]=a[k];
		
			}
			
		}
		
		for (int m = 0; m < b.length; m++) {
		System.out.println("printing"+b[m]);
		}

	}
}
