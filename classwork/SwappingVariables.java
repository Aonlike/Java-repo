public class SwappingVariables{
	public static void main(String[] args){

	int a = 30;
	int b = 20;

	a = a + b; // 30 + 20 = 50;
	b = a - b; // 50 - 20 = 30;
	a = a - b; // 50 - 30 = 20;
	
	System.out.print("Swapping a and b: a = " + a + " b = " + b);
 }
}