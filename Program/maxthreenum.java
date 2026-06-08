//  Write a  Java  program to find a maximum between three numbers.


import java.util.*;

	class maxthreenum{
public static void main(String[] args) {
	int a ,b,c;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter First Number ");
	a = scanner.nextInt();
	System.out.println("Enter Second Number");
	b = scanner.nextInt();
	System.out.println("Enter Third Number ");
	c = scanner.nextInt();

		if (a>b && a>c) 
			System.out.println(a+" is Greater");
		else 
			if ( b>a &&b>c) 
			System.out.println(b+" is Greater");			
			else
			System.out.println(c+" is Number ");
	}
}