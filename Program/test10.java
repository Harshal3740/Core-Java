// Write a Java program to find the first and last digit of any number.
import java.util.*;

	class test10{
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = scanner.nextInt();

		int last = num%10;

		while(num>9){
			num = num/10;
		}
		int first =num;
		System.out.println("First "+last);


	}
}