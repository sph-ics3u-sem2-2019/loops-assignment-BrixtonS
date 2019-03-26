package problem1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read a value. Print out from 1 to the input
		Scanner in=new Scanner(System.in);
		System.out.println("Give me a number");
		int number=1;
		int numbers=in.nextInt();
		while (number<=numbers) {
			System.out.println(number++);
		} if (numbers==number) {
			System.out.println("1");
		} else {
			
		}
		/*int number2=in.nextInt();
		for (int x=0;x<number2;x++) {
			System.out.println(x+1);
		} */
	}
	

}
