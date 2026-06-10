// Multiplication of Two Number 

import java.util.*;

	class Multiplication{
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a,b,multi;
		System.out.println("Enter First Number");
		a = scanner.nextInt();
		System.out.println("Enter Second Number");
		b = scanner.nextInt();

		multi = a*b;

		System.out.println("Multiplication of "+a+" and "+b+" is "+multi);

}}