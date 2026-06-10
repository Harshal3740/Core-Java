// Subtraction of Two Number 

import java.util.*;

	class Subtraction{
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a,b,sub;
		System.out.println("Enter First Number");
		a = scanner.nextInt();
		System.out.println("Enter Second Number");
		b = scanner.nextInt();

		sub = a-b;

		System.out.println("Subtraction of "+a+" and "+b+" is "+sub);

}}