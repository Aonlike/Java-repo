import java.util.Scanner;
public class Kata{

public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	System.out.print("Enter first integer: ");
	int integer1 = input.nextInt();

	//System.out.print("Enter second integer: ");
	int integer2 = input.nextInt();




	// System.out.print(checkEvenNumber(integer1));
	   System.out.print(divide(integer1, integer2));

}

public static int subtract(int integer1, int integer2){
	int result = Math.abs(integer1 - integer2);
	return result;

}

public static boolean primeNumber(int integer1){
	if(integer1 <= 1) return false;
	for(int i = 2; i <= Math.sqrt(integer1); i++){if(integer1 % i == 0)return false;return true;}

}

public static boolean checkEvenNumber(int integer1) {
	if (integer1 % 2 == 0) {
	   return true;
	}
	else {
	 return false;
	}
}

public static float divide(int integer1, int integer2){
		if(integer2 == 0){System.out.print("Not divisible my zero");
			return 0;		
	}

	int divide = integer1 / integer2;
	System.out.print(divide);
		return integer1 / integer2;
	}

public static int factor(int integer1){
		int count = 0;
		for(int i = 1; i <= integer1; i++){
		if(integer1 % i == 0 )count += i;}
		  return count;
	}

public static boolean Square(int integer){
	if(Math.sqrt(integer) != i )return true;
	else{
	    return false;}

	}

public static boolean Palindrone(int integer1){
if(integer1 % 10 == integer1 / 100 || integer1 % 10 == integer1 / 1000 || integer1 % 10 == integer1 / 10000 || integer1 % 10 == integer1 / 100000 )
return true;
		else
		return false;
}

public static  long factorialOf(int integer){int product = 1;

	for(int i = 1; i <= integer; i++)
	product *= i;
	return product;
}

public static long squareOf(int integer1){
	return integer1 * integer1;
	}



}



