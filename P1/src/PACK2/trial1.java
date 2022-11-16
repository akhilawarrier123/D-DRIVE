package PACK2;

public class trial1 {

	public static void main(String[] args) {

		/*
		 * String[] b= {null,null,null}; Integer[] a= {null,null,null}; Integer[]a1=new
		 * Integer[5]; a1[0]=10; a1[1]=20; a1[2]=30; a1[3]=40; a1[4]=50;
		 * System.out.println(a1); for(int i=0;i<a1.length;i++) {
		 * System.out.println(a1[i]); } } } //trial class for array
		 */
		int[] a = { 50, 30, 20, 10, 40 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < a.length; j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}

		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
}
//ARRAY SWAPPING AND SORTING