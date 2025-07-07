import java.util.Scanner;
public class NumberOfYears{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of minutes: ");
	int minutes = input.nextInt();

	double numberOfHours = minutes / 60;

	double numberOfDays = numberOfHours / 24;

	double numberOfYears = numberOfDays / 365;
	
	System.out.print(minutes + " minutes is approximately " + numberOfYears + " Years");
   }
}