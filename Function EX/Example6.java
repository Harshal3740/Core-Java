// Write a Java program to find the sum of all even numbers between 1 to n.

import java.util.*;

	class Example6{
		public static void sumofeven(int n){
			int i=1,sum =0;
			while(i<=n){
				if (i%2 == 0)
					sum = sum + i ;
				i++;
				}
				System.out.println(sum);
		}
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Number");
			int n = scanner.nextInt();
			sumofeven(n);

}}