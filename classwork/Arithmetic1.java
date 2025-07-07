import java.util.Scanner;
public class Arithmetic1{
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
	
	int largest;
	if(number1 >= number2 && number1 >= number3){
		largest = number1;
	}
	else if (number2 >= number1 && number2 >= number3){
		largest = number2;
	}else {largest = number3;}
	System.out.println("The largest number " + largest);

	int smallest;
	if(number1 <= number2 && number1 <= number3){
	smallest = number1;}
	else if(number2 <= number1 && number2 <= number3){ smallest = number2;}
	else{ smallest = number3;}

	System.out.println("The smallest number is " + smallest);
	}
}