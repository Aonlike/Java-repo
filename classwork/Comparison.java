import java.util.Scanner;
public class Comparison{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	
	System.out.print("Enter integer: ");
	int number1 = input.nextInt();
	int square = number1 * number1;
	System.out.println("The number is " + number1);
	System.out.println("The square is " + square);

	if(number1 > 100 ){System.out.println("The number is greater than 100" );}
	if(number1 == 100){System.out.println("The number is equal to 100");}
	if(number1 != 100){System.out.println("The number is not equal to 100");}
	if(number1 < 100){System.out.println("The number is less than 100");}

	if(square > 100 ){System.out.println("The square is greater than 100" );}
	if(square == 100){System.out.println("The square is equal to 100");}
	if(square != 100){System.out.println("The square is not equal to 100");}
	if(square < 100){System.out.println("The square is less than 100");}
	
	
	}
}

