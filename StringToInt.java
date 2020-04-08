/*

Two ways of converting a valid string into an integer!

The following is valid:
1. "+1"
2. "-1"
3. "0"

NOTE: Any string with a character that does not fit in the integer category is invalid.


*/

public class StringToInt{
	public static void main(String a[]){
		String num = "41"; //A valid integer as string.
		//1. Using the parseInt() Method
		int convert1 = Integer.parseInt(num);
		//2. Using the valueOf() Method
		int convert2 = Integer.valueOf(num);
		// Let's do some math with our newfound numbers...
		System.out.println("41*41 = "+convert1*convert2);
	}
}