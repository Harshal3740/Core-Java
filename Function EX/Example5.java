// Write a Java program to find the sum of all natural numbers between 1 to n.
import java.util.*;

	class Example5{
		public static void sumofnum(int n){
			int i=1,sum=0;
			while(i<=n){
				sum = sum+i;
				i++;
			}
			System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
			sumofnum(num);			
	
}}