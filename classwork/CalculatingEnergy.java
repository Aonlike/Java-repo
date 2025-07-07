import java.util.Scanner;
public class CalculatingEnergy{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter amount of water: ");
	double M = input.nextDouble();

	System.out.print("Enter initial temperature: ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter final temperature: ");
	double finalTemperature = input.nextDouble();

	double Q = M * (finalTemperature - initialTemperature) * 4184;

	System.out.print("The energy needed is " + Q + " joules");
 }
}