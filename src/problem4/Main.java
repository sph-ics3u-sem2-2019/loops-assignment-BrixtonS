package problem4;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// Ask the user 10 multiplication questions. Check their answers and
		//give them their score
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);
		int question = 0;
		int sum=0;
		int score=0;
		int problems = 0;
		int right = 0;
		int wrong = 0;
		while (problems<=9) {
			int random1 = rnd.nextInt(10);
			int random2 = rnd.nextInt(10);
			question = random1 * random2;
			System.out.println(random1+ "*"+random2+"=");
			sum = in.nextInt();
			
			if (sum==question) {
				System.out.println("Correct");
				right++;
				score = score + 10;

			}else {
				System.out.println("Wrong, the correct answer was " + question);
				wrong++;
			}problems++;
			
		} System.out.println("U got "+ right + " out of " +problems);
		System.out.println("U got " + wrong+" wrong");
		in.close();

	}
}
