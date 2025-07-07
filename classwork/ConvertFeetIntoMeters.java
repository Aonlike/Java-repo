import java.util.Scanner;
public class ConvertFeetIntoMeters{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a value for feet: ");
	double feet = input.nextDouble();

	final double meters = feet * 0.305;
	System.out.print(feet + " " + " feet is " + meters + " meters");

   }
}