package PACK1;

public class MD2 {

	public static void main(String[] args) 
	{
String[][] x1= {{"kevin","40"},{"thomas","50"}};
//int[][] b=new int[3][3];
int i=0;
int j=0;
int count=0;
int sum=0;
for ( i = 0; i < x1.length; i++) {
   for ( j = 1; j < x1.length;j++) {
    System.out.print(x1[i][j]+" ") ;  
   
    }
  System.out.println(" ");
  
}
for ( i = 0; i < x1.length; i++) {
    for ( j = 1; j < x1.length;j++) {
   if(j==1)
   {
     sum=sum+Integer.parseInt(x1[i][j]);
    count++;
	}
   
	}

}
int c=sum/count;

System.out.print("the average mark is" + c) ; 
	}}
