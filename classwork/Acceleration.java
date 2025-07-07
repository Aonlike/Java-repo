import java.util.Scanner;
public class Acceleration{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter starting velocity(v0): ");
	double v0 = input.nextDouble();

	System.out.print("Enter ending velocity(v1): ");
	double v1 = input.nextDouble();

	System.out.print("Enter the time(t): ");
	double t = input.nextDouble();

	double a = (v1 - v0)/t;

	System.out.println("The average acceleration is  " + a);
  }
}