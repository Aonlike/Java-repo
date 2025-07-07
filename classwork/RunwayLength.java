import java.util.Scanner;
public class RunwayLength{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter speed in(m/s): ");
	double speed = input.nextDouble();

	System.out.print("Enter acceleration in(m/s.s): ");
	double acceleration = input.nextDouble();

	double length = (speed * speed) / (2 * acceleration);

	System.out.print("The minimum runway length for this airplane is " + length);

  }
}