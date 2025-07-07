import java.util.Scanner;
public class LargestIntegers{
	public static void main{
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();

	System.out.print("Enter third integer: ");
	int number3 = input.nextInt();

	System.out.print("Enter fourth integer: ");
	int number4 = input.nextInt();

	System.out.print("Enter fifth integer: ");
	int number5 = input.nextInt();

	int largest = number1;

	if(number2 >= largest ){
		largest = number2;
	}
	if(number3 >= largest){
		largest = number3;
	}

	if(number4 >= largest){
		largest = number4;
	}

	if(number5 >= largest){
		largest = number5;
	}
	
	int smallest = number1;

	if(number2 <= smallest){
		smallest = number2;
	}
	
	if(number3 <= smallest){
		smallest = number3;
	}

	if(number4 <= smallest){
	smallest = number4;
	}

	if(number5 <= smallest){
	smallest = number5;
	}
		
	System.out.print("The largest number is: " + largest);
	System.out.print("The smallest number is: " + smallest);
	}
}