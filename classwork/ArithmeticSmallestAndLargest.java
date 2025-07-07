import java.util.Scanner;
public class ArithmeticSmallestAndLargest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int number1 = input.nextInt();

	System.out.print("Enter second number: ");
	int number2 = input.nextInt();

	System.out.print("Enter third number: ");
	int number3 = input.nextInt();

	int sum = number1 + number2 + number3;
	System.out.println("The sum is " + sum);

	int average = (number1 + number2 + number3) / 3;
	System.out.println("The average is " + average);

	int product = (number1 * number2 * number3);
	System.out.println("The product is " + product);
	
	int largest = number1;
	if(number2 >= number1){
		largest = number2;
	}
	if (number3 >= largest){
		largest = number3;
	}
	System.out.println("The largest number " + largest);

	int smallest = number1;

	if(number2 <= smallest){
		smallest = number2;}

	if(number3 <= smallest){ smallest = number3;}
	System.out.println("The smallest number is " + smallest);
	}
}