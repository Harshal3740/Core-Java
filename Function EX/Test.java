// Write a Java program to print all natural numbers from 1 to n. - using while loop
import java.util.*;

	class Test{
	
	public static void  Printtonum(int n){
		int i=1;
		while(i<=n){
			System.out.println(i);
			i++;
		}
	}


	public static void main(String[] args) {
		Scanner scanner	 = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = scanner.nextInt();

		Printtonum(num);
	}}