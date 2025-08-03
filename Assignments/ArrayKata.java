import java.util.Arrays;
public class ArrayKata{
	public static void main(String[] args){
	int[] array = new int[5];

int[] numbers = {20,10,15,7,25};


System.out.print(Arrays.toString(maximumAndMinimum(numbers)));

}

public static int maximumInArray(int[] numbers){
	int max = numbers[0];
	for(int i = 0; i < numbers.length; i++) {
		if(numbers[i] > max){max = numbers[i];}
	}
	return max;


}
public static int minimumInArray(int[] numbers){
	int min = numbers[0];	
	for (int i = 0; i < numbers.length; i++){
	   if(numbers[i] < min){min = numbers[i];}
	}
	
	return min;

	}

public static int sumOfArray(int[] numbers){
	int sum = 0;
	for(int i = 0; i < numbers.length; i++){
	sum += numbers[i];}
	return sum;

	}

public static int sumOfEvenNumbers(int[] numbers){
	int evenSum = 0;
	for(int i = 0; i < numbers.length; i++){
	   if(numbers[i] % 2 == 0){
		evenSum += numbers[i];
	     }
	}
		return evenSum;
   }
public static int sumOfOddNumbers(int [] numbers){
	int oddSum = 0;
	for( int i = 0; i < numbers.length; i++){
		if(numbers[i] % 2 != 0){
			oddSum += numbers[i];
		}
	}
	 return oddSum;

}

public static int numberOfOdd(int[] numbers){
	int count = 0;
	for(int i = 0; i < numbers.length; i++){
		if(numbers[i] % 2 != 0){
		count++;
		}
	}
	return count;
	}



public static int numbersOfEven(int[] numbers){
	int count = 0;
	for(int i = 0; i < numbers.length; i++){
	if(numbers[i] % 2 == 0)
	  count++;
	}
	return count;
}

public static int[] evenNumbersIn(int[] numbers){
	int[] arr = new int[numbers.length];
	for(int i = 0; i < numbers.length; i++){
		if(numbers[i] % 2 == 0){
			arr[i] = numbers[i];
		}
	}
			return arr;
}

public static int[] oddNumbersIn(int[] numbers){
	int[] arr = new int[numbers.length];
	for(int i = 0; i < numbers.length; i++){
		if(numbers[i] % 2 != 0){
		  arr[i] = numbers[i];
		}
	}
		  return arr;


}

public static int[] squareNumbers(int[] numbers){
	int[] squares = new int[numbers.length];
	for(int i = 0; i < numbers.length; i++){
	squares[i] = numbers[i] * numbers[i];
	}
		return squares;
}
		
public static int[] maximumAndMinimum(int[] numbers){
	int max = numbers[0];
	int min = numbers[0];
	for(int i = 0; i < numbers.length; i++){
		if(numbers[i] > max){max = numbers[i];
	}
		if(numbers[i] < min){min = numbers[i];
	}
		
	}
		return new int[]{max, min};
}





}