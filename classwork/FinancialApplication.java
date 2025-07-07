import java.util.Scanner;
public class FinancialApplication{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter balance: ");
	double balance = input.nextDouble();

	System.out.print("Enter interest rate: ");
	double annualInterestRate = input.nextDouble();

	double interest = balance * (annualInterestRate / 1200);
	
	System.out.print("The interest is " + interest);
  }
}