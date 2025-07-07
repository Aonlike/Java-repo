import java.util.Scanner;
public class ConsonantOrVowel{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter alphabet: ");
	String letter = input.next();

	String[] consonants = {"B","C","D","F","G","H","J","H","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
	String[] vowels = {"A","E","I","O","U"};
	
	if(letter == consonants){System.out.print("Letter is consonant ");}
	else{System.out.print("Letter is a vowel");}


}
}