import java.util.Scanner;
public class VowelsOrConsonants3{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter letter: ");
	String letter = input.next();

	String value1 = "a";
	String value2 = "e";
	String value3 = "i";
	String value4 = "o";
	String value5 = "u";

	//Consonants
	String value11 = "b";
	String value12 = "c";
	String value13 = "d";
	String value14 = "f";
	String value15= "g";

	String value16 = "h";
	String value17 = "j";
	String value18 = "k";
	String value19 = "l";
	String value20 = "m";
	String value21 = "n";
	String value22 = "p";
	String value23 = "q";
	String value24 = "r";
	String value25 = "s";
	String value26 = "t";
	String value27 = "u";
	String value28 = "v";
	String value29 = "w";
	String value30= "x";

	String value31= "y";
	String value32= "z";
	
	
	if(letter.equalsIgnoreCase(value1)){System.out.print("This is a vowel");}
	else if(letter.equalsIgnoreCase(value2)){System.out.print("This is a vowel");}
	else if(letter.equalsIgnoreCase(value3)){System.out.print("This is a vowel");}
	else if(letter.equalsIgnoreCase(value4)){System.out.print("This is a vowel");}
	else if(letter.equalsIgnoreCase(value5)){System.out.print("This is a vowel");}
	else{System.out.print("This is a consonant");}

 }
}