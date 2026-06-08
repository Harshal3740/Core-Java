// 1) Write a Java program to print all natural numbers from 1 to n. - using while loop
import java.util.*;


class test {
	public static void main(String[] args) {
		System.out.println("Hello If ELSE");

		int n;
		int start =1;

		System.out.println("Enter the Number");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		while(start <= n)
		{
			System.out.println(start);
			start++;
		}
	}
}