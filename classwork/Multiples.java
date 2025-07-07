import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int number1 = input.nextInt();

	System.out.print("Enter second number: ");
	int number2 = input.nextInt();

	int tripled = number1 * 3;
	int doubled = number2 * 2;

	if(tripled % doubled == 0){
		System.out.print(number1 + " is a multiple of " + number2);}
}
	
}