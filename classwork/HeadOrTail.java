import java.util.*;
public class HeadOrTail{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number(0 or 1): ");
	int number = input.nextInt();

	if(number == 0){
	   System.out.println("Tail");
	   System.out.println("Guess is incorrect!");
	}
	else if(number == 1){
	   System.out.println("Head");
	   System.out.println("Guess is correct!");
	}
	else{
	    System.out.print("Invalid input");
	}
  }
}