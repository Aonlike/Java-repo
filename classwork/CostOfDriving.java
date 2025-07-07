import java.util.Scanner;
public class CostOfDriving{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter driving distance: ");
	double distance = input.nextDouble();

	System.out.print("Enter miles per gallon: ");
	double milesPerGallon = input.nextDouble();

	System.out.print("Enter price per gallon: ");
	double pricePerGallon = input.nextDouble();

	double numberOfGallons = distance / milesPerGallon;

	double cost = numberOfGallons * pricePerGallon;
	
	System.out.print("The cost of driving is " + "$" + cost);



}

}