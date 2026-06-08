//  Write a  Java  program to find the maximum between two numbers.

import java.util.*;

	class maxnumber{
public static void main(String[] args) {
	int a ,b;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter First Number ");
	a = scanner.nextInt();
	System.out.println("Enter Second Number");
	b = scanner.nextInt();

		if (a>b) 
			System.out.println(a+" is Greater");
		else
			System.out.println(b+" is Greater");
			
	}
}