import java.util.Scanner;
public class Palidrones1{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int number1 = input.nextInt();
	
	if(number1.length() == 3){
	  int lastDigit = number1 % 10;
	  int secondDigit = number1 % 100 / 10;
	  int firstDigit = number1 / 100;
	    System.out.print("True");
	} 
	else if(number1.length() == 4){
	  int lastDigit = number1 % 10;
	  int thirdDigit = number1 % 100 / 10;
	  int secondDigit = number1 % 100 / 100;
	  int firstDigit = number1 / 1000;
	    System.out.print("True");
	}
	else if(number1.length() == 5){
	  int lastDigit = number1 % 10;
	  int fourthDigit = number1 / 10 % 10;
	  int thirdDigit = number1 % 100 / 10;
	  int secondDigit = number1 % 1000 / 10;
	  int firstDigit = number1 / 10000;
	    System.out.print("True");
	}
	else{System.out.print("False");}
	
  }
}