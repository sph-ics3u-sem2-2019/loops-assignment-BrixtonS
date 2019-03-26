package problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a word and print out one character per String
		Scanner in=new Scanner(System.in);
		String word= in.nextLine();
		for (char each: word.toCharArray()) {
			System.out.println(each);
		}
			
	}

}
