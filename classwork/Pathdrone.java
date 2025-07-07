import java.util.Scanner;
	public class Pathdrone{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.print("Enter number: ");
	int number = input.nextInt();

	
	if(number % 10 == number / 10000){System.out.print("True");}
	else{System.out.print("False");}
}
}