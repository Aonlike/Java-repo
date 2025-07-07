import java.util.Scanner;
public class MultiplesOfSixAndSeven{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Number: ");
	int number = input.nextInt();
	
	int number1 = number % 6;
	int number2 = number % 7;
	

	if(number1 % 6 == 0){System.out.print("The number is a multiple of 6");}
	else if(number1 % 7 == 0){System.out.print("The number is a multiple of 7");}
	else{System.out.print("The number is neither a multiple of 6 nor 7");}
 }
}