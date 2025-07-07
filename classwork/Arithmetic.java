import java.util.Scanner;
public class Arithmetic{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);

	System.out.print("Enter First integer: ");
	double number1 = input.nextDouble();

	System.out.print("Enter second integer: ");
	double number2 = input.nextDouble();

	double square1 = number1 * number1;
	System.out.print("The square of the first number is " + square1);

	double square2 = number2 * number2;
	System.out.println("The square of the second number is " + square2);

	double sum = square1 + square2;
	System.out.println("The sum of the square of the two numbers is " + sum);

	double difference = square1 - square2;
	System.out.println("The difference of the two numbers is " + difference);
	}
}