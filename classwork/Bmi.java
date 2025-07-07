import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight: ");
	double weight = input.nextDouble();

	System.out.print("Enter height: ");
	double height = input.nextDouble();

	final double weightInPoundsToKilograms =  weight * 0.45359237;
	final double heightInPoundsToKilograms =  height * 0.0254;
	
	double BMI = weightInPoundsToKilograms/(heightInPoundsToKilograms * heightInPoundsToKilograms);

	System.out.print("The BMI is " + BMI);


 }
}