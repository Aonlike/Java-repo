import java.util.Scanner;
public class SumOfDigits{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number between 0 and 1000: ");
	int number = input.nextInt();
	int sum = 0;
	while(number > 0){
	     int lastDigit = number % 10;
	     number = number / 10;
	     sum = sum + lastDigit;
	      }	
	System.out.print("The sum of the digits is " + sum);
  }
}