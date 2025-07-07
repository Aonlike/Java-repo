import java.util.Scanner;
public class ConvertPoundsToKilograms{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number in pounds: ");
	double pounds = input.nextDouble();

	final double kilograms = 0.454 * pounds;
	System.out.print(pounds + " is " + kilograms + " kilograms");
	}
}