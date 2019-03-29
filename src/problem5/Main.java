package problem5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read the string and output in reverse case.
		Scanner in=new Scanner(System.in);
		String word = in.nextLine();
		char [] charArray = word.toCharArray();
		for ( int i=0; i<charArray.length;i++) {
			if (Character.isUpperCase(charArray[i])) {
				charArray[i] = Character.toLowerCase(charArray[i]);
			} else if (Character.isLowerCase(charArray[i])) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		} word = new String(charArray);
		System.out.println(word);

	}

}


