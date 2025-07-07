import java.util.Scanner;
public class DiameterCircumfrence{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter radius: ");
	int r = input.nextInt();

	double diameter = 2 * r;
	double circumference = 2 * Math.PI * r;
	double area = Math.PI * r * r;
	
	System.out.println("The diameter is " + diameter);
	System.out.println("The circumference is " + circumference);
	System.out.println("The area is " + area);


}





}