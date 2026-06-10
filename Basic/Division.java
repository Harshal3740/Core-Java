// Division of Two Number 

import java.util.*;

	class Division{
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a,b,div;
		System.out.println("Enter First Number");
		a = scanner.nextInt();
		System.out.println("Enter Second Number");
		b = scanner.nextInt();

		div = a/b;

		System.out.println("Division of "+a+" and "+b+" is "+div);

}}