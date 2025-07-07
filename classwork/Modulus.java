import java.util.Scanner;
	public class Modulus{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.print("Enter number: ");
	int number = input.nextInt();

	int number1 = number % 10000;
	
	System.out.print(number1);
 }
}