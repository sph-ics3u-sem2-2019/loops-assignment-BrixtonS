package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		Scanner in=new Scanner(System.in);
		
		int number1=in.nextInt();
		int number2=in.nextInt();
		int sum=0;
		for (int x=number1;x<=number2;x++) {
			//System.out.println(x);
			sum = sum + x;
			System.out.println(sum);
			
		} 
			

	}

}
