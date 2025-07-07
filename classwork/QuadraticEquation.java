import java.util.Scanner;
public class QuadraticEquation{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first coefficient(b): ");
	int coefficient1 = input.nextInt();

	System.out.print("Enter second coefficient(a): ");
	int coefficient2 = input.nextInt();

	System.out.print("Enter first constant(c): ");
	int constant = input.nextInt();

	double b = (coefficient1 * coefficient1);
	double c = (4 * coefficient2 * constant);
	double discriminantExpression = b - c;
	double discriminant = Math.sqrt(discriminantExpression);
	double denominator = 2 * coefficient2;

	double Root1 = (-coefficient1 + discriminant) / denominator;
	double Root2 = (-coefficient1 - discriminant) / denominator;

	if(discriminant < 0){}

	System.out.println("Root 1: " + Root1);
	System.out.println("Root 2: " + Root2);
 }
}