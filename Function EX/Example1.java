//  Write a Java program to print all natural numbers in reverse (from n to 1). - using while loop


import java.util.*;
		class Example1{
			public static void printtonum(int n){
				int i=1;
				while(i<=n){
					System.out.println(n);
					n--;
				}
			}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Number");
			int n = scanner.nextInt();

			printtonum(n);
	}}